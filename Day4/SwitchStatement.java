package Day4;

public class SwitchStatement {


    public static void main(String args[]) {
        System.out.println(nameOfDay(3));
        System.out.println(weekDay(2));
        System.out.println(determineNameOfMonth(8));
    }

    public static String determineNameOfMonth(int monthNumber) {
        String result="";
        switch(monthNumber){
            case 1:
                result="January";
                break;
            case 2:
                result="February";
                break;
            case 3:
                result="march";
                break;
            case 4:
                result="April";
                break;
            case 5:
                result="May";
                break;
            case 6:
                result="June";
                break;
            case 7:
                result="July";
                break;
            case 8:
                result="August";
                break;
            case 9:
                result="September";
                break;
            case 10:
                result="October";
                break;
            case 11:
                result="November";
                break;
            case 12:
                result="December";
                break;
            default:
                System.out.println("invalid input");

        }
        return result;
    }

    public static boolean weekDay(int numberOfDay) {
        switch(numberOfDay){
            case 0:
            case 6: return false;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: return true;
            default:
                System.out.println("enter proper input");

        }
        return false;
    }

    public static String nameOfDay(int dayNumber) {
        String result = "";
        switch (dayNumber) {
            case 0:
                result = "Sunday";
                break;
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            default:
                System.out.println("enter proper input");
        }
        return result;





    }



}

