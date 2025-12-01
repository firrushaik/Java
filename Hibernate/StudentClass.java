package org.example.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //bean class or pojo class
@Table(name = "student")
public class Student {

    //primary key -> @Id
    @Id
    @Column(name = "rollno")
    private int rollno;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "marks")
    private int marks;

    public Student(){

    }

    public Student(int rollno, String name, String email,int marks) {
        this.rollno = rollno;
        this.name = name;
        this.email = email;
        this.marks = marks;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", marks=" + marks +
                '}';
    }
}
