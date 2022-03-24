package Day4;

import java.math.BigDecimal;



public class SimpleInterest {

    BigDecimal principal;
    BigDecimal interestRate;
    public SimpleInterest(String principal, String interestRate) {
        this.principal=new BigDecimal(principal);
        this.interestRate=new BigDecimal(interestRate).divide(new BigDecimal(100));//interestRate/100
    }
    public BigDecimal calculateSimpleInterest(int noOfYears){
        //total value= principal+principal*interestRate*noOfYears/100
        BigDecimal year=new BigDecimal(noOfYears);//5
        BigDecimal totalValue= principal.add(principal.multiply(interestRate).multiply(year));
        return totalValue;
    }
}
