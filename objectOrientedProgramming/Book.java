package objectOrientedProgramming;

public class Book {
    //state
    private int noOfCopies;
    private int rate;

    //constructor

    Book(){
        this(5);
    }

    Book(int noOfCopies){
        this.noOfCopies=noOfCopies;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        if(rate>1)
        this.rate = rate;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        if(noOfCopies>0)
        this.noOfCopies = noOfCopies;
    }

    public void increaseNumberOfBooks(int num){
        setNoOfCopies(this.noOfCopies+num);

    }

    public void decreaseNumberBook(int dec){
        setNoOfCopies(this.noOfCopies -dec );

    }

    //behaviour,methods
    void NameOfAuthor(){
        System.out.println("The name of author is");
    }
    void NumberOfBooksSold(){
        System.out.println("The number of books sold is");
    }
    void Rating(){
        System.out.println("The rating is");
    }






}
