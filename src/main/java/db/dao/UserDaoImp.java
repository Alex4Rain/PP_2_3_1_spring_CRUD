package db.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import db.models.User;
import org.springframework.stereotype.Repository;
import javax.persistence.TypedQuery;

@Repository
public class UserDaoImp implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public User getUser(Long id) {
        @SuppressWarnings("unchecked")
        TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("FROM User WHERE id = :id");
        query.setParameter("id", id);
        return query.getResultList().get(0);
    }

    @Override
    public void removeUser(User user){
        sessionFactory.getCurrentSession().remove(user);
    }

}
