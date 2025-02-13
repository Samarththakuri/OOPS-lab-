/*1. Create a Book class with attributes title and author.
Assign default values (e.g., "Untitled", "Unknown Author").
Accept user-defined values for title and author.
Add another constructor that also includes an integer parameter for publicationYear.
Objective: Create multiple Book objects using the different constructors and display their details.
*/

class Books{
    String title;
    String author;
    int publicationYear;
    public Books() {
        title = "Untitled";
        author = "Unknown Author";
        publicationYear = 0; 
    }

  
    public Books(String title,String author,int year){
        this.title=title;
        this.author=author;
        this.publicationYear=year;
    }
    

}


public class Book {
    public static void main(String a[]){
Books obj=new Books("Hello","Bye",10);

System.out.println(obj.author);

Books book3 = new Books("2001", "Way of KIngs", 1949);
System.out.println(book3.author);

    }
    
}
