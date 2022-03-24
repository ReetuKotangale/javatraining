package Day4;

import java.math.BigDecimal;

public class SimpleInterestRunner {
    public static void main(String args[]){
        SimpleInterest interest= new SimpleInterest("4500.00","7.5");
        BigDecimal totalValue=interest.calculateSimpleInterest(5);
        System.out.println(totalValue);//total value= principal+principal*interestRate*noOfYears/100



    }
}
