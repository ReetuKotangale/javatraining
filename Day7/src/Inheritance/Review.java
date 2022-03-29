package Inheritance;

public class Review {
    //state
    private int id;
    private String description;
    private double rating;

    //creation
    public Review(int id,String description,double rating){
        this.id=id;
        this.description=description;
        this.rating=rating;
    }
    public String toString(){
        return id + " " + description + " " +rating;
    }

}
