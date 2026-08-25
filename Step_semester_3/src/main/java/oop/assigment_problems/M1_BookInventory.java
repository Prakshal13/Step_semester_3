package oop.assigment_problems;
class BookInventory{
    String Title;
    String Author;
    int copiesAvailable;
    BookInventory(String Title, String Author, int copiesAvailable){
        this.Title = Title;
        this.Author = Author;
        this.copiesAvailable = copiesAvailable;
    }
   void printEntry(){
        System.out.println("Title: " + Title + ", Author: " + Author + ", Copies Available: " + copiesAvailable);
    }
}
public class M1_BookInventory {
    public static void main(String[] args) {
        BookInventory[] books = {
            new BookInventory("Clean Code","Robert C. Martin", 3),
            new BookInventory("Effective Java", "Joshua Bloch", 5),
                new BookInventory("Refactoring", "Martin Fowler", 0),
                new BookInventory("Design Patterns", "GoF", 2)
        };
        for (BookInventory book : books) {
            book.printEntry();
        }
    }
}
