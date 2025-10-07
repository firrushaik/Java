package OOPS;

public class BookObject {
    public static void main(String[] args) {
        // ClassName objectName = new ClassName();
        Book b1 = new Book();
        b1.setName("Rich Dad and Poor Dad");
        b1.setPrice(200);
        b1.setPages(400);
        b1.setAuthor("Robert");

        System.out.println(b1.getName());
        System.out.println(b1.getPrice());
        System.out.println(b1.getPages());
        System.out.println(b1.getAuthor());

        Book book2 = new Book("Treasure Island" , 300 , 100,"Stevenson");
        System.out.println(book2.getName());
        System.out.println(book2.getPrice());
        System.out.println(book2.getPages());
        System.out.println(book2.getAuthor());


        Book book3 = new Book(500,"Robert");
        System.out.println(book3.getPrice());
        System.out.println(book3.getName());

    }
}


output is given below:


Rich Dad and Poor Dad
200
400
Robert
Treasure Island
300
100
Stevenson
500
Robert

