package cst438team17.checkout.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import cst438team17.checkout.api.entities.ConcertTicket;
import cst438team17.checkout.data.ConcertTicketsDBClient;

@Service
public class Manager {
    @Autowired
    ConcertTicketsDBClient concertTicketsDBClient;

    public void setConcertTicket(String id, ConcertTicket ticket) {
        concertTicketsDBClient.setConcertTicketData(id, ticket);
    }
}
