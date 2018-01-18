package WebMagicAnvil.controllers;

import WebMagicAnvil.models.Effect;
import WebMagicAnvil.services.interfaces.EffectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EffectController {

    @Autowired
    private EffectService effectService;

    /**добавить новый эффект**/
    @PostMapping("/effect")
    public ResponseEntity<?> save(@RequestBody Effect effect){
        long id = effectService.save(effect);
        return ResponseEntity.ok().body("Новый эффект добавлен. Его номер в базе - " + id);
    }

    /**получить эффект по id**/
    @GetMapping("/effect/{id}")
    public ResponseEntity<Effect> get(@PathVariable("id") long id){
        Effect effect = effectService.get(id);
        return ResponseEntity.ok().body(effect);
    }

    /**Получить список эффектов**/
    @GetMapping("/effect")
    public ResponseEntity<List<Effect>> getAll(){
        List<Effect> effects = effectService.getAll();
        return ResponseEntity.ok().body(effects);
    }

    /**Изменить эффект по id**/
    @PutMapping("/effect/{id}")
    public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody Effect effect){
        effectService.update(id,effect);
        return ResponseEntity.ok().body("Эффект успешно изменен!");
    }

    /**Удалить эффект по id**/
    @DeleteMapping("effect/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") long id){
        effectService.delete(id);
        return ResponseEntity.ok().body("Эффект успешно удален!");
    }


}
