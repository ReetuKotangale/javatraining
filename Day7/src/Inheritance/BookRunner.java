package Inheritance;

public class BookRunner {
    public static void main(String[] args) {
         Book book=new Book(101,"effective java","joshua bloch");
         book.addReview(new Review(101,"great",5));//review added 1st time
         book.addReview(new Review(102,"helpful",4.5));//review added 2nd time
         System.out.println(book);
    }
}
