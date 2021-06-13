package service;

import model.CinemaTicket;

import java.util.ArrayList;
import java.util.List;

public class CinemaTicketManagement {
    List<CinemaTicket>cinemaTicketList;
    public CinemaTicketManagement(){
        cinemaTicketList= new ArrayList<>();
    }
    public List<CinemaTicket>getCinemaTicketList(){
        return cinemaTicketList;
    }
}
