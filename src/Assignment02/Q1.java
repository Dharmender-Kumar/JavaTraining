package Assignment02;

//Create Java classes having suitable attributes for Library management system.Use OOPs concepts in your design.
// Also try to use interfaces and abstract classes.

// books, issued-customer

abstract class Library{
    int BookId;
    String BookName;
}
class Book extends Library{
    String genre;
}
class Customer extends Book{
    int CustomerId;
    String CustomerName;
    String IssuedDate;



}


public class Q1 {

    public static void main(String[] args) {

    }
}
