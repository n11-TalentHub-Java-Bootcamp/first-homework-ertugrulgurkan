package com.ertugrul.hibernate;

import com.ertugrul.entity.Kategori;
import com.ertugrul.entity.Kullanici;
import com.ertugrul.entity.Urun;
import com.ertugrul.entity.UrunYorum;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {

        try{

            Configuration cfg = new Configuration();

            cfg.addAnnotatedClass(Kategori.class);
            cfg.addAnnotatedClass(Urun.class);
            cfg.addAnnotatedClass(UrunYorum.class);
            cfg.addAnnotatedClass(Kullanici.class);


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