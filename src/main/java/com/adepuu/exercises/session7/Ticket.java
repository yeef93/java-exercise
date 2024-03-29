package com.adepuu.exercises.session7;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Ticket{
    // Instance variables
    public static int totalTicket =0;
    private UUID identifier;
    private String eventName;
    private double price;
    private boolean isSold = false;

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
