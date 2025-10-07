package OOPS;

public class Example {
    public static void main(String[] args) {
        // ClassName objectName = new ClassName();
        Student s1 = new Student();
        s1.setName("Firdose");
        s1.setFee(20000);
        s1.setCourse("java");

        System.out.println(s1.getName());
        System.out.println(s1.getFee());
        System.out.println(s1.getCourse());


        Student s2 = new Student();
        s2.setName("Meenakshi");
        s2.setFee(20000);
        s2.setCourse("java");

        System.out.println(s2.getName());
        System.out.println(s2.getFee());
        System.out.println(s2.getCourse());


        Student student2 = new Student("Shaik" , 20000, "JAVA");
        System.out.println(student2.getName());
        System.out.println(student2.getFee());
        System.out.println(student2.getCourse());
    }

}
