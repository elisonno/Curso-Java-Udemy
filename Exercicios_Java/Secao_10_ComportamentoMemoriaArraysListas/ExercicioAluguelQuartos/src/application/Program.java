package application;

import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rooms will be rented?");
		int numberRooms = sc.nextInt();
		int room;
		String name, email;
		Room[] rooms = new Room[10];
		for(int i = 0; i <numberRooms; i++) {
			sc.nextLine();
			System.out.println("Enter name student: ");
			name = sc.nextLine();
			System.out.println("Enter e-mail student: ");
			email = sc.nextLine();
			System.out.println("What room do you want?");
			room = sc.nextInt();
			rooms[room] = new Room(name, email);
			
		}
		for(int i = 0; i < rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.println(i + ": " + rooms[i]);
			}
		}
				
		sc.close();

	}

}
