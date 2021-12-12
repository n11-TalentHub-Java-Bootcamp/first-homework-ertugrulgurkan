package com.ertugrul.hibernate;

import com.ertugrul.entity.Category;
import com.ertugrul.entity.Product;
import com.ertugrul.entity.ProductComment;
import com.ertugrul.entity.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {

        try {

            Configuration cfg = new Configuration();

            cfg.addAnnotatedClass(Category.class);
            cfg.addAnnotatedClass(Product.class);
            cfg.addAnnotatedClass(ProductComment.class);
            cfg.addAnnotatedClass(User.class);


            SessionFactory sessionFactory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();

            return sessionFactory;

        } catch (Exception e){

            System.out.println("Session factory oluşturulurken hata oluştu" + e);
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}