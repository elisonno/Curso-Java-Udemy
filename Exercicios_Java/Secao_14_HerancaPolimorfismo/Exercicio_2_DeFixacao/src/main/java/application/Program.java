package application;

import entities.CompanyPerson;
import entities.IndividualPerson;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of tax payers: ");
        int counter = sc.nextInt();
        List<TaxPayer> taxPayers = new ArrayList<>();

        for (int i =1; i <= counter; i++){
            System.out.println("Tax payer # "+ i + " data:");
            System.out.print("Individual or company (i/c)?: ");
            char option = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if(option == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                taxPayers.add(new IndividualPerson(name, anualIncome, healthExpenditures));
            }
            else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                taxPayers.add(new CompanyPerson(name, anualIncome, numberOfEmployees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        double totalTax = 0;
        for (TaxPayer t : taxPayers){
            System.out.println(t);
            totalTax += t.tax();
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTax));


        sc.close();
    }
}
