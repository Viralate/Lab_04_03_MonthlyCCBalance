public class main {
    public static void main(String[] args) {
        //declare variables
        double ccBalance = 5000;
        double interestRate = 0.17;
        double monthlyInterestRate = interestRate / 12;
        
        //process one month interest
        double oneMonthInterestDue = ccBalance * monthlyInterestRate;
        System.out.println("Your interest due after one month is: " + oneMonthInterestDue);
        
        //update ccbalance after one month of interest
        ccBalance += oneMonthInterestDue;

        //process two months interest due
        double twoMonthInterestDue = ccBalance * monthlyInterestRate;
        System.out.println("Your interest due after two months is: " + twoMonthInterestDue);

    
    }
}
