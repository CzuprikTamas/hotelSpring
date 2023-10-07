package hu.progmatic.hotelspring.controller;

import hu.progmatic.hotelspring.model.Guests;
import hu.progmatic.hotelspring.model.Reservations;
import hu.progmatic.hotelspring.service.ReservationsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@AllArgsConstructor
public class ReservationsController {

    private ReservationsService reservationsService;

//    @GetMapping("/reservations")
//    public List<Reservations> getAllReservations(){
//        return reservationsService.getAllReservations();
//    }

//    @GetMapping("/newreservations")
//    public Reservations createNewGuests() {
//        return reservationsService.createNewReservation(new Reservations());
//    }

    @DeleteMapping ("/{id}")
    public void deleteReservations(@PathVariable Integer id) {
        reservationsService.deleteReservation(id);
    }

    @GetMapping("/statistics")
    public String statisticsPage(Model model) {
        Map<Integer, Integer> saturationMap = reservationsService.getSaturation();
        model.addAttribute("saturationMap", saturationMap);
        return "statistics";
    }

    @PostMapping("/add-reservation")
    public String addReservation(@ModelAttribute ("newreservation") Reservations reservations) {
        reservationsService.createNewReservation(reservations);
        return "redirect:/reservation";
    }
    @GetMapping("/reservation")
    public String reservationPage(Model model) {
        model.addAttribute("reservationList", reservationsService.getAllReservations());
        return "reservation";
    }
}
