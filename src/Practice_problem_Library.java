import java.util.Scanner;
class Library{
    static int totalNoOfBooks = 0;
    String[] books = {"A", "B", "C", "D", "E"};
    String[] issuedBooks = new String[10];
    int count = 0;
    public void bookIssue(String bookName){
        for(int i = 0; i<books.length; i++){
            if(books[i] != null && books[i].equals(bookName)){
                issuedBooks[count] = books[i];
                books[i] = null;
                count++;
                totalNoOfBooks++;
                System.out.println("Book is issued.");
                return;
            }
        }
        System.out.println("Book is not here.");
    }
}

public class Practice_problem_Library{
    public static void main(String[] args){
        Library lb = new Library();
        lb.bookIssue("A");
        lb.bookIssue("F");
    }
}