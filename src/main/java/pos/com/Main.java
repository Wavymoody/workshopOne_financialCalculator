package pos.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mortgage Calculator");

        System.out.print("Loan amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Annual interest rate (%): ");
        double annualRate = scanner.nextDouble();

        System.out.print("Loan term in years: ");
        int years = scanner.nextInt();

        double monthlyRate = annualRate / 12 / 100;
        int months = years * 12;

        double monthlyPayment = principal * (monthlyRate * Math.pow(1 + monthlyRate, months)) /
                (Math.pow(1 + monthlyRate, months) - 1);

        double totalPaid = monthlyPayment * months;
        double totalInterest = totalPaid - principal;

        System.out.printf("Monthly Payment: $%.2f%n", monthlyPayment);
        System.out.printf("Total Interest Paid: $%.2f%n", totalInterest);



    }
}