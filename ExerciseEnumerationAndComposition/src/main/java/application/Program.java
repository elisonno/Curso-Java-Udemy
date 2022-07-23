package application;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("E-mail: ");
        String email = sc.next();

        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = sc.next();

        Order order = new Order(new Date(), OrderStatus.valueOf(status), new Client(name, email, birthDate));

        System.out.println("How many items to this order?");
        int repetition = sc.nextInt();

        for (int i = 1; i<= repetition; i++){
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String productName = sc.next();

            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            Product product = new Product(productName,productPrice);

            System.out.print("Product Quantity: ");
            int quantity = sc.nextInt();

            order.addItem(new OrderItem(quantity,product));
        }

        System.out.println(order);

        sc.close();
    }
}

