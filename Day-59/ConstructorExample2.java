package OOPS;

public class Student {
    private String name;
    private int fee;
    private String course;

    //setters and getters methods
    public void setName(String name){
        this.name=name;
    }

    public void setFee(int fee){
        this.fee=fee;
    }

    public void setCourse(String course){
        this.course=course;
    }

    public String getName(){
        return name;
    }

    public int getFee(){
        return fee;
    }

    public String getCourse(){
        return course;
    }

    public void doHomeWork(){
        System.out.println("Doing home work");
    }

    // creating constructor

    Student(){

    }


    Student(String name,int fee,String course){
        this.name = name;
        this.fee=fee;
        this.course=course;
    }
}

// private is access modifier
//if we specify any variable with private access modifier
//we can access that variable only within that class


//setters -> assign value to variables
//getters -> access values

// this keyword -> it tell that variable belongs to current object
