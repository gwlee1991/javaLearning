package com.andrew;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone phone = new MobilePhone("6508158619");

    public static void main(String[] args) {
        boolean quit = false;
        printActions();

        while(!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action ) {
                case 0:
                    System.out.println("\nShutting down..");
                    quit = true;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addNewContacts();
                    break;
                case 3:
                    updateContacts();
                    break;
                case 4:
                    removeContacts();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }

    }

    private static void updateContacts(){
        System.out.println("Choose name that you would like to update: ");
        String name = scanner.nextLine();
        Contacts existingContact = phone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter new contact name");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number");
        String newNumber = scanner.nextLine();

        Contacts newContact = Contacts.createContact(newName, newNumber);
        if(phone.updateContact(existingContact, newContact)){
            System.out.println("Successfully updated Record");
        } else {
            System.out.println("Error updating record");
        }

    }

    private static void removeContacts(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContact = phone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }

        if (phone.removeContact(existingContact)) {
            System.out.println("Successfully removed");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    private static void searchContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContact = phone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Name: " + existingContact.getName() + " phone number is " + existingContact.getNumber());
    }

    private static void addNewContacts(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String number = scanner.nextLine();

        Contacts newContact = Contacts.createContact(name, number);
        if (phone.addNewContact(newContact)){
            System.out.println("New contact added: " + name + ", phone: " + number);
        } else {
            System.out.println("Can't add " + name + ".");
        }
    }

    private static void printContacts(){
        phone.printContacts();
    }

    private static void startPhone(){
        System.out.println("Starting phone...");
    }

    private static void printActions(){
        System.out.println("\nAvailable actions: \npress");
        System.out.println("0 - to shutdown\n" +
                "1 - print contacts\n" +
                "2 - add new contact\n" +
                "3 - update existing contact\n" +
                "4 - remove contact\n" +
                "5 - search contact\n" +
                "6 - print list of actions\n");
        System.out.println("Choose your actions: ");
    }
}
