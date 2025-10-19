package exercice1.metier;

import exercice1.dao.IDao;
import exercice1.entities.LigneCommandeProduit;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class LigneCommandeProduitDaoImpl implements IDao<LigneCommandeProduit> {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean create(LigneCommandeProduit c) {
        sessionFactory.getCurrentSession().save(c);
        return true;
    }

    @Override
    public boolean delete(LigneCommandeProduit c) {
        sessionFactory.getCurrentSession().delete(c);
        return true;
    }

    @Override
    public boolean update(LigneCommandeProduit c) {
        sessionFactory.getCurrentSession().update(c);
        return true;
    }

    @Override
    public LigneCommandeProduit findById(int id) {
        return sessionFactory.getCurrentSession().get(LigneCommandeProduit.class, id);
    }

    @Override
    public List<LigneCommandeProduit> findAll() {
        return sessionFactory.getCurrentSession()
                .createQuery("from LigneCommandeProduit", LigneCommandeProduit.class)
                .list();
    }
}
