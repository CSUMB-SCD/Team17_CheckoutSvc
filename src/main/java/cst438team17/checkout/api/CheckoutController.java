package cst438team17.checkout.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import cst438team17.checkout.api.entities.ConcertTicket;

import cst438team17.checkout.business.Manager;

@RestController
public class CheckoutController {

    @Autowired
    Manager manager;

    @PutMapping ("/ConcertTickets/{id}")
    @ResponseBody
    @CrossOrigin(origins = "*")
    public void updateCustomer(@PathVariable("id") String id, @RequestBody ConcertTicket ticket) {
        manager.setConcertTicket(id, ticket);
	}
}