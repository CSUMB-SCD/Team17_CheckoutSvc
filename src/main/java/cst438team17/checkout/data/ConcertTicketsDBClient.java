package cst438team17.checkout.data;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import cst438team17.checkout.api.entities.ConcertTicket;;

@Repository
public class ConcertTicketsDBClient {
    public void setConcertTicketData(String id, ConcertTicket ticket) {
        final String uri = "https://team17-ticketsdb.herokuapp.com/id/" + id;
        RestTemplate rt = new RestTemplate();
        rt.postForEntity(uri, ticket, Object.class);
    }

}