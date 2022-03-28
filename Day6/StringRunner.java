package Day6;

public class StringRunner {
    public static void main(String args[]){

        String[] daysOfWeek={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        //print the day with most character
        String daysWithMostCharacter="";
        for(String days:daysOfWeek){
            if(days.length()>daysWithMostCharacter.length()){
                daysWithMostCharacter=days;
            }
        }
        System.out.println(daysWithMostCharacter);

        //print the days backward
        for(int i=daysOfWeek.length-1;i>=0;i--){
            System.out.println(daysOfWeek[i]);
        }





    }
}
