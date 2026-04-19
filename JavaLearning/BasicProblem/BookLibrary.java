//Q.Create a Book class for a library system.

public class BookLibrary {
    String title;
    String author;
    String publication;
    int addition;
    int isbn;
    boolean isBorrowed;

    static int totalBooks;

    static{
        totalBooks = 0;
    }

    {
        totalBooks ++ ;
    }

    BookLibrary(String title, String author, String publication, int isbn, int addition){
        this.title = title;
        this.author = author;
        this.publication = publication;
        this.isbn = isbn;
        this.addition = addition;
    }
    BookLibrary(int isbn){
        this.title = "Unknown";
        this.author = "Unknown";
        this.publication = "Sufaid's MNC";
        this.isbn = isbn;
        this.addition = 2023;

    }



    public static int getTotalNoBook(){
        return totalBooks;
    }

    void borrowBook(){
        if (isBorrowed){
            System.out.println("This book is already borrowed.");
        } else {
            this.isBorrowed = true;
            System.out.println("You borrowed " + title + " of " + author +". Enjoy the book. Thank you..");
        }
    }

    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false ;
            System.out.println("Hope you enjoyed.");
            totalBooks --;

        }else {
            System.out.println("This book is already in the library.");
        }
    }
    public static void main(String[] args) {
        BookLibrary Obj1 = new BookLibrary(2545);
        Obj1.borrowBook();
        System.out.println(totalBooks);
        BookLibrary Obj2 = new BookLibrary("Basic of Java", "Sufaid", "unkown",  222, 2020 );
        Obj2.borrowBook();
        System.out.println(totalBooks);
        Obj1.borrowBook();
        Obj1.returnBook();
        System.out.println(totalBooks);
        Obj2.returnBook();
        System.out.println(totalBooks);


        
    }

}
