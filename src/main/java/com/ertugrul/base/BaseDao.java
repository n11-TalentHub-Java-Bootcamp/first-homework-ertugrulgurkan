package com.ertugrul.base;
import com.ertugrul.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BaseDao {

    private final SessionFactory sessionFactory;

    public BaseDao() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    protected Session getCurrentSession(){
        return sessionFactory.openSession();
    }
}