package OOPS;

public class Book {
    private String name;
    private int price;
    private int pages;
    private String author;

    //setters and getters methods
    public void setName(String name){
        this.name=name;
    }

    public void setPrice(int price){
        this.price=price;
    }

    public void setPages(int pages){
        this.pages=pages;
    }

    public void setAuthor(String author){
        this.author=author;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public int getPages(){
        return pages;
    }

    public String getAuthor(){
        return author;
    }

}
