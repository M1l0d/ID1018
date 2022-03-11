package Mortgage_Calculator_NEW;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //MORTGAGE CALCULATOR
        Scanner scanner = new Scanner(System.in);
        //Principal:
        int principal;
        while (true) {
            System.out.print("Principal (10K - 10M): ");
            principal = scanner.nextInt();
            if (principal > 10_000_000)
                System.out.println("Enter a value between 10,000 and 10,000,000.");
            else if (principal < 10_000)
                System.out.println("Enter a value between 10,000 and 10,000,000.");
            else break;
        }

        //Annual Interest Rate:
        float interest_rate;
        while (true) {
            System.out.print("Annual Interest Rate: ");
            interest_rate = scanner.nextInt();
            if (interest_rate > 30)
                System.out.println("Enter a value greater than 0 and less than or equal to 30");
            else if (interest_rate <= 0)
                System.out.println("Enter a value greater than 0 and less than or equal to 30");
            else break;
        }

        //Period:
        short years;
        while (true) {
            System.out.print("Period (Years): ");
            years = scanner.nextShort();
            if (years > 30)
            System.out.println("Enter a value between 1 and 30");
            else if (years < 1 )
                System.out.println("Enter a value between 1 and 30");
            else break;
        }

        //Mortgage calculation
        double r = (interest_rate/ (double)1200); //division by 100 for percent and 12 for months in a year
        double n = ((double)years*(double)12); //12 months in year
        double P = principal;
        double M1 = r*(Math.pow((1+r),n));
        double M2 = (Math.pow((1+r),n)-1);
        double M3 = M1/M2;
        double mortgage = P*M3;
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String mortgageResult = currency.format(mortgage);
        System.out.print("Mortgage: " + mortgageResult);
    }
}
