package com.adepuu.exercises.session7;

import java.util.ArrayList;
import java.util.List;

public class Event {
    private String eventName;
    private List<Ticket> ticketList;

    public Event(String eventName) {
        this.eventName = eventName;
        this.ticketList = new ArrayList<>();
    }

    // getter
    public String getEvent() {
        return eventName;
    }

    public List<Ticket> getTickets() {
        return ticketList;
    }

    // setter
    public void addTicket(Ticket ticket) {
        ticketList.add(ticket);
    }
}
