package Assignment_1;

import java.util.Date;

public class Loan {
    private double anoualIntrestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date localDate;
    Loan(){
        anoualIntrestRate=2.5;
        numberOfYears=1;
        loanAmount=1000;
        localDate=new Date();
    }
    Loan(double anualInt,int numOfYears,double l_Amount,Date l_date){
        this.anoualIntrestRate=anualInt;
        this.numberOfYears=numOfYears;
        this.loanAmount=l_Amount;
        this.localDate=l_date;
    }
    Loan(double anualInt,int numOfYears,double l_Amount){
        this(anualInt,numOfYears,l_Amount,new Date());
    }
//getters

    public double getAnoualIntrestRate() {
        return anoualIntrestRate;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public Date getLocalDate() {
        return localDate;
    }
    //setters


    public void setAnoualIntrestRate(double anoualIntrestRate) {
        this.anoualIntrestRate = anoualIntrestRate;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getMonthlyPayment() {

        double monthlyInterestRate =
                anoualIntrestRate / 1200;

        int numberOfPayments =
                numberOfYears * 12;

        double monthlyPayment =
                loanAmount * monthlyInterestRate /
                        (1 - Math.pow(1 + monthlyInterestRate,
                                -numberOfPayments));

        return monthlyPayment;
    }

    public double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;
    }
}



