package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        List<Product> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int quantity;
        char option;

        System.out.print("Enter the number of products: ");
        quantity = sc.nextInt();
        for(int i =1; i<= quantity; i++){
            System.out.print("Common, used or imported (c/u/i)? ");
            option = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            switch (option){
                case 'c':
                    products.add(new Product(name, price));
                    break;

                case 'u':
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    Date manufacture = sdf.parse(sc.next());
                    products.add(new UsedProduct(name, price, manufacture));
                    break;

                case 'i':
                    System.out.print("Customs fee: ");
                    double customs = sc.nextDouble();
                    products.add(new ImportedProduct(name, price, customs));
                    break;
            }
        }

        System.out.println("PRICE TAGS:");
        for(Product p : products){
            System.out.println(p.priceTag());
        }


        sc.close();
    }
}
