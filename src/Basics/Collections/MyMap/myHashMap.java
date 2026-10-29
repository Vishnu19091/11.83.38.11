package Basics.Collections.MyMap;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class myHashMap {
    public static void main(String[] args) {
        // Key: Phone Number (Unique ID), Value: Name
        HashMap<String, String> contacts = new HashMap<>();

        // Populate sample data
        contacts.put("9876543210", "Alice Smith");
        contacts.put("9876511223", "Alex Jones");
        contacts.put("1234567890", "Bob Miller");
        contacts.put("5556667777", "Charlie Smith");

        // Test Scenario 1: Half-typed Name
        System.out.println("--- Search results for Name 'al': ---");
        searchContacts(contacts, "al");

        // Test Scenario 2: Half-typed Phone Number
        System.out.println("\n--- Search results for Number '9876': ---");
        searchContacts(contacts, "9876");
    }

    /**
     * Simulates real-time phone contact searching by filtering keys or values
     */
    public static void searchContacts(HashMap<String, String> contacts, String query) {
        // Convert query to lowercase to ensure the search is case-insensitive
        String lowerQuery = query.toLowease();

        // Filter the map entries for partial matches
        Map<String, String> matches = contacts.entrySet().stream()
                .filter(entry -> entry.getValue().toLowerCase().contains(lowerQuery) ||
                        entry.getKey().contains(lowerQuery))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        // Display results
        if (matches.isEmpty()) {
            System.out.println("No contacts found matching: " + query);
        } else {
            matches.forEach((number, name) ->
                    System.out.println("Name: " + name + " | Phone: " + number)
            );
        }
    }
}
