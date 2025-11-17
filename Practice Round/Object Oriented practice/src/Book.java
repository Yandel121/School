public class Book {
    private String title;
    private String author;
    private int price;

    public Book(){
        this.title="Shakespeare";
        this.author="Wallah";
        this.price=34;
    }
    public Book(String title, String author){
        this.title=title;
        this.author=author;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getPrice(){
        return price;
    }
    public static void main(String[] args){
        Book book=new Book("Java", "Yande");
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());

        Book book2=new Book();
        System.out.println(book2.getTitle());
        System.out.println(book2.getAuthor());
        System.out.println(book2.getPrice());
    }

}
