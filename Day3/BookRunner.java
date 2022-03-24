package objectOrientedProgramming;

import java.sql.SQLOutput;

public class BookRunner {
    public static void main(String args[]){
             //instance of book
                Book artOfComputerProgramming= new Book(200);
                System.out.println(artOfComputerProgramming.getNoOfCopies());
                Book effectiveJava= new Book(120);
                System.out.println(effectiveJava.getNoOfCopies());
                Book cleanCode = new Book(250);
                System.out.println(cleanCode.getNoOfCopies());
                Book something=new Book();
                System.out.println(something.getNoOfCopies());


                //calling methods by instance
                artOfComputerProgramming.NameOfAuthor();
                effectiveJava.NumberOfBooksSold();
                cleanCode.Rating();

                //number of copies of books
                cleanCode.setNoOfCopies(100);
                System.out.println("number of copies:"+cleanCode.getNoOfCopies());
                effectiveJava.setNoOfCopies(250);
                System.out.println("number of copies:"+effectiveJava.getNoOfCopies());
                artOfComputerProgramming.setNoOfCopies(1203);
                System.out.println("number of copies:"+artOfComputerProgramming.getNoOfCopies());

                //ratings of books out of 5
                cleanCode.setRate(4);
                System.out.println("the rating of book clean code:"+cleanCode.getRate());
                effectiveJava.setRate(-2);
                System.out.println("the rating of book effective java:"+effectiveJava.getRate());

                /*increase the number of copies of books by 200
                int number= cleanCode.getNoOfCopies(); //get number of copies of book
                number=number+200;    //increase by 200
                cleanCode.setNoOfCopies(number); //set it to clean code book

        System.out.println(cleanCode.getNoOfCopies());*/

        cleanCode.increaseNumberOfBooks(400);
        System.out.println("the number of books increased by "+cleanCode.getNoOfCopies());

        cleanCode.decreaseNumberBook(500);
        System.out.println("the number of books decreased by "+cleanCode.getNoOfCopies());
    }
}
