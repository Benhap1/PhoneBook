package practice;

import java.util.Set;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a command (Name, Number or List):");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Name")) {
                System.out.println("Enter the name:");
                String name = scanner.nextLine();
                System.out.println("Enter the phone number:");
                String phone = scanner.nextLine();
                phoneBook.addContact(phone, name);
            } else if (input.equalsIgnoreCase("Number")) {
                System.out.println("Enter the phone number:");
                String phone = scanner.nextLine();
                String contact = phoneBook.getContactByPhone(phone);
                if (contact.isEmpty()) {
                    System.out.println("Contact not found");
                } else {
                    System.out.println(contact);
                }
            } else if (input.equalsIgnoreCase("List")) {
                Set<String> contacts = phoneBook.getAllContacts();
                for (String contact : contacts) {
                    System.out.println(contact);
                }
            }
        }
    }
}
