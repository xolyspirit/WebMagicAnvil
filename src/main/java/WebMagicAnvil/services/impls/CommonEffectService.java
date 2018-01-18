package WebMagicAnvil.services.impls;

import WebMagicAnvil.dao.interfaces.EffectDao;
import WebMagicAnvil.models.Effect;
import WebMagicAnvil.services.interfaces.EffectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class CommonEffectService implements EffectService {

    @Autowired
    private EffectDao effectdao;

    @Transactional
    public long save(Effect effect) {
        return effectdao.save(effect);
    }

    public Effect get(long id) {
        return effectdao.get(id);
    }

    public List<Effect> getAll() {
        return effectdao.getAll();
    }

    @Transactional
    public void update(long id, Effect effect) {
        effectdao.update(id, effect);
    }

    @Transactional
    public void delete(long id) {
        effectdao.delete(id);
    }
}
