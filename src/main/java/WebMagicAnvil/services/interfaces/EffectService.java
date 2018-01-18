package WebMagicAnvil.services.interfaces;

import WebMagicAnvil.models.Effect;

import java.util.List;

public interface EffectService {
    long save(Effect effect);
    Effect get(long id);
    List<Effect> getAll();
    void update(long id, Effect effect);
    void delete(long id);
}
