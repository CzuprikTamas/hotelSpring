package hu.progmatic.hotelspring.controller;

import hu.progmatic.hotelspring.model.Guests;
import hu.progmatic.hotelspring.model.Reservations;
import hu.progmatic.hotelspring.service.ReservationsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ReservationsController {

    private ReservationsService reservationsService;

    @GetMapping("/reservations")
    public List<Reservations> getAllReservations(){
        return reservationsService.getAllReservations();
    }

    @GetMapping("/newreservations")
    public Reservations createNewGuests() {
        return reservationsService.createNewGuest(new Reservations());
    }

    @DeleteMapping ("/{id}")
    public void deleteReservations(@PathVariable Integer id) {
        reservationsService.deleteReservation(id);
    }

}
