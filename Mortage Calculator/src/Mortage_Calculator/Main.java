package Mortage_Calculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //MORTGAGE CALCULATOR
        Scanner scanner = new Scanner(System.in);
        //Principal:

        System.out.print("Kapital: ");
        int principal = scanner.nextInt();

        //Annual Interest Rate:
        System.out.print("Ränta: ");
        float interest_rate = scanner.nextFloat();

        //Period:
        System.out.print("Period (År): ");
        short years = scanner.nextShort();

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
        System.out.print("Inteckning: " + mortgageResult);
    }
}
