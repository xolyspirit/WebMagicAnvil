package WebMagicAnvil.dao.impls;

import WebMagicAnvil.dao.interfaces.EffectDao;
import WebMagicAnvil.models.Effect;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class CommonEffectDao implements EffectDao{

    @Autowired
    private SessionFactory sessionFactory;

    public long save(Effect effect) {
        sessionFactory.getCurrentSession().save(effect);
        return effect.getEffectId();
    }

    public Effect get(long id) {
        return sessionFactory.getCurrentSession().get(Effect.class, id);
    }

    public List<Effect> getAll() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Effect> cq = cb.createQuery(Effect.class);
        Root<Effect> root = cq.from(Effect.class);
        cq.select(root);
        Query<Effect> query = session.createQuery(cq);
        return query.getResultList();
    }

    public void update(long id, Effect effect) {
        Session session = sessionFactory.getCurrentSession();
        Effect inbaseEffect = session.byId(Effect.class).load(id);
        inbaseEffect.setChance(effect.getChance());
        inbaseEffect.setEffectDescription(effect.getEffectDescription());
        inbaseEffect.setEffectName(effect.getEffectName());
        inbaseEffect.setEffectType(effect.getEffectType());
        inbaseEffect.setElement(effect.getElement());
        inbaseEffect.setRealChance(effect.getRealChance());
        session.flush();
    }

    public void delete(long id) {
        Session session = sessionFactory.getCurrentSession();
        Effect effect = session.byId(Effect.class).load(id);
        session.delete(effect);
    }
}
