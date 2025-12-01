package org.example;

import jakarta.persistence.Query;
import org.example.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Configuration config = new Configuration();
       config.configure("hibernate.cfg.xml");

       config.addAnnotatedClasses(Student.class);

       // Sessions -> SessionsFactory
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        //insert query
//        Student s1 = new Student(1,"Rock","Rock@gmail.com");
//        session.persist(s1);

        //fetch particular student
//        Student s1 = session.find(Student.class,2); // here student is a java class neme
//        System.out.println(s1);

        // fetch entire student table
//        String fetchQuery = "from Student";
//        System.out.println(fetchQuery);
//        String fetchQuery = "from Student where name rollno = 3";
//        Query query = session.createQuery(fetchQuery);

//        update -> merge , executiveUpdate
        String updateQuery = "update Student SET marks = 80 where rollno = 2";
        Query query = session.createQuery(updateQuery);
        query.executeUpdate();

        // if primary key is already exist then it will update,otherwise insert a new record.
//        Student s1 = new Student(2,"Hohn","Hohn@gmail.com");
//        session.merge(s1);

        //delete
//        Student s1 = new Student(1,"Rock","Rock@gmail.com");
//        session.remove(s1);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}