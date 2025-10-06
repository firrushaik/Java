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

    }
}
