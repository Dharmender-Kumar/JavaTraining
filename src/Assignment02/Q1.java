package Assignment02;

import java.util.ArrayList;
import java.util.Scanner;

class Book{
    static int id;
    int count;
    String name;
    ArrayList<Scholar> rentHistory;
    String category;
    Book(int id, String name, int count, String category){
        this.id = id;
        this.name = name;
        this.category = category;
        this.count = count;
        this.rentHistory = new ArrayList<>();
    }

    int getCount(){
        return this.count;
    }
    void rentOut(Scholar student){
        rentHistory.add(student);
        count--;
    }
    void returnBook(){
        count++;
    }
}


class Scholar{
    static int id=1;
    String name, course;
    Scholar(int id, String name, String course){
        Scholar.id = id;
        this.name = name;
        this.course = course;
    }

}



class Library{
    ArrayList<Book> bookList=new ArrayList<>();
    Library(ArrayList<Book> bookList){
        this.bookList = bookList;
    }

    void rentOut(int bookId, Scholar student){
        for(Book book : bookList){
            if(book.id==bookId){
                book.rentOut(student);
                return;
            }
        }
        System.out.println("AssignmentTwo.Book not found!");
    }

    void returnBook(int bookId, Scholar student){
        for(Book book : bookList){
            if(book.id==bookId){
                book.returnBook();
                return;
            }
        }
        System.out.println("AssignmentTwo.Book not found!");
    }

    void displayRecords(){
        for(Book book : bookList){
            System.out.println("name: "+book.name+", Category :"+book.category+",Currently Available: "+book.count);
            System.out.println("********************\nRental Records:");
            for(Scholar stud : book.rentHistory){
                System.out.println("Name: "+stud.name+",Course: "+stud.course);
            }
            System.out.println("********************");
        }
    }

}
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Book[] bookList = new Book[n];
        System.out.println("Enter Name, number of books and category: ");
        for(int i=0; i<n; i++){
            bookList[i] = new Book(Book.id, scanner.next(), scanner.nextInt(), scanner.next());
        }
        Scholar student = new Scholar(1,"Deku",  "Sharma");
        Scholar student2 = new Scholar(2, "Uraraka", "Sharma");
        bookList[0].rentOut(student);
        bookList[1].rentOut(student2);
        for(Book book : bookList){
            for(Scholar scholar : book.rentHistory){
                System.out.println(book.name + "\t" + scholar.name+"\t"+ scholar.course);
                System.out.println("*********************************");
            }
        }

    }
}