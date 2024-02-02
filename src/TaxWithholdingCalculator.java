import java.util.Scanner;

public class TaxWithholdingCalculator {
    public static void  main(String[] args) {
        Scanner scnr =  new Scanner(System.in);

    System.out.print("Enter Weekly Income: $");
    double income = scnr.nextDouble();
    double taxRate;

    if (income < 500) {
        taxRate = .10; // 10%
    } else if (income < 1500) {
        taxRate = .15; // 15%
    }  else if (income < 2500) {
        taxRate = .20; // 20%
    }    else {
        taxRate = .30; // 30%
        }
    double taxWithholding = income * taxRate;
    double averageTaxWithholding = taxWithholding / income;

    System.out.printf("Weekly income: $%.2f%n", income);
    System.out.printf("Tax withholding: $%.2f%n", taxWithholding);
    System.out.printf("Average tax withholding: $%.2f%n", averageTaxWithholding * 100);

    scnr.close();


    }
}