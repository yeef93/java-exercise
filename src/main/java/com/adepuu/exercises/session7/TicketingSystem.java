package com.adepuu.exercises.session7;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TicketingSystem {
    /**
     * Write a Java Program using OOP about simple ticketing system for an event.
     * <p>
     * Feature Acceptance Criteria:
     * - Ticket Creation: The system should allow for the creation of a new ticket with a unique identifier, event name, and price.
     * - Ticket Booking: Users should be able to book a ticket by selecting an event and providing their details.
     * - Ticket Validation: The system should check if the ticket is still available for booking.
     * - Ticket Confirmation: After booking, the system should issue a confirmation ticket to the user.
     * <p>
     * OOP Concept-wise Acceptance Criteria:
     * - Classes and Objects: The system should define a Ticket class that serves as a blueprint for creating ticket objects. Each ticket object should represent a unique ticket for an event.
     * - Encapsulation: The Ticket class should encapsulate the ticket details (e.g., ticket ID, event name, price) by making them private and providing public getter and setter methods to access and modify these details.
     * - Static Keyword: The Ticket class should use a static field to keep track of the total number of tickets sold, demonstrating the use of static variables.
     * - Interface Implementation (Optional): Ticket class could implement an interface (e.g., Ticketable) that defines methods for printing ticket details, ensuring that all ticket types adhere to a common contract.
     * <p>
     * Start your project from the main method below ;) have fun!
     */
    public static void main(String[] args) {
        System.out.println("===== Create Ticket Event =====");
        //Create 5 Ticket
        int totalTicket = 5;
        // Generate a random UUID
        for(int i=0 ; i<totalTicket; i++){
            UUID uuid = UUID.randomUUID();
            Ticket obj = new Ticket(uuid, "Event A", 25000);
        }
    }
}

class Ticket{
    // Instance variables
    public static int totalTicket =0;
    private UUID identifier;
    private String eventName;
    private double price;

    private Map<Integer, Ticket> eventTickets;

    public Ticket() {
        this.eventTickets = new HashMap<>();
    }

    // Constructor to initialize the instance variables
    public Ticket(UUID identifier, String eventName, double price) {
        this.identifier = identifier;
        this.eventName = eventName;
        this.price = price;
        System.out.println("Ticket Id: " + identifier+", Event: "+eventName+ ", Price: "+price);
        totalTicket++;
    }

    public UUID getIdTicket(){
        return identifier;
    }

    public String getEventName(){
        return eventName;
    }

    public double getPrice(){
        return price;
    }

    // Instance method to print house details
    public void printDetails() {
        System.out.println("Unique Identifier: " + identifier);
        System.out.println("Event Name: " + eventName);
        System.out.println("Price: " + price);
        System.out.println(+totalTicket);
        System.out.println("-------------------------");
    }

}
