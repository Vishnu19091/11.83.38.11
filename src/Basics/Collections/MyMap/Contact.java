package Basics.Collections.MyMap;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Contact {
    private static final String FILE_NAME = "contacts.txt";
    private static HashMap<String, String> contacts = new HashMap<>();

    public static void main(String[] args) {
        loadContactsFromFile();

        // If file is empty or missing, inject some initial demo data
        if (contacts.isEmpty()) {
            contacts.put("9876543210", "Alice Smith");
            contacts.put("9876511223", "Alex Jones");
            contacts.put("1234567890", "Bob Miller");
            saveContactsToFile();
        }

        Scanner scanner = new Scanner(System.in);
        StringBuilder currentQuery = new StringBuilder();

        while (true) {
            clearConsole();
            System.out.println("==================================================");
            System.out.println("          📱 SMARTPHONE CONTACTS SIMULATOR        ");
            System.out.println("==================================================");
            System.out.println(" [Current Search Query: \"" + currentQuery + "\"]");
            System.out.println("--------------------------------------------------");

            // 1. Live Filter and Display Matches
            String searchStr = currentQuery.toString().toLowerCase();
            Map<String, String> matches = contacts.entrySet().stream()
                    .filter(entry -> entry.getValue().toLowerCase().contains(searchStr) ||
                            entry.getKey().contains(searchStr))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

            if (matches.isEmpty()) {
                System.out.println("   (No matching contacts found)");
            } else {
                matches.forEach((number, name) ->
                        System.out.printf("  👤 %-15s  |  📞 %s\n", name, number)
                );
            }

            System.out.println("--------------------------------------------------");
            System.out.println(" 🌟 CONTROLS:");
            System.out.println("   • Type characters to filter the list");
            System.out.println("   • Type '+' to ADD a new contact");
            System.out.println("   • Type '0' to RESET search filter");
            System.out.println("   • Type 'EXIT' to quit");
            System.out.println("==================================================");
            System.out.print(" Action / Type text: ");

            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("EXIT")) {
                System.out.println("\nSaving data... Goodbye!");
                break;
            } else if (input.equals("0")) {
                currentQuery.setLength(0);
            } else if (input.equals("+")) {
                // Add New Contact Sub-menu
                System.out.print("\nEnter Contact Name: ");
                String name = scanner.nextLine().trim();
                System.out.print("Enter Phone Number: ");
                String number = scanner.nextLine().trim();

                if (!name.isEmpty() && !number.isEmpty()) {
                    contacts.put(number, name);
                    saveContactsToFile();
                    System.out.println("\n✓ Contact saved successfully!");
                } else {
                    System.out.println("\n❌ Error: Name and Number cannot be blank!");
                }
                System.out.println("Press Enter to continue...");
                scanner.nextLine();
            } else {
                // Keep appending characters to search string
                currentQuery.append(input);
            }
        }
        scanner.close();
    }

    // Clears the CLI screen cleanly
    private static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Save HashMap to local text file
    private static void saveContactsToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                writer.write(entry.getKey() + "," + entry.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving contacts to disk: " + e.getMessage());
        }
    }

    // Load text file records back into the HashMap
    private static void loadContactsFromFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",", 2);
                if (parts.length == 2) {
                    contacts.put(parts[0], parts[1]);
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading contacts from disk: " + e.getMessage());
        }
    }
}
