package hu.progmatic.hotelspring.controller;

import hu.progmatic.hotelspring.model.Guests;
import hu.progmatic.hotelspring.model.Reservations;
import hu.progmatic.hotelspring.service.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class ReservationController {
    private final ReservationService reservationService;

    @Autowired
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @DeleteMapping
    public void deleteReservation(@PathVariable Integer id) {
        reservationService.deleteReservation(id);
    }

    @GetMapping("/statistics")
    public String statisticsPage(Model model) {
        Map<Integer, Integer> saturationMap = reservationService.getSaturation();
        model.addAttribute("saturationMap", saturationMap);
        return "statistics";
    }

    @PostMapping("/add-reservation")
    public String addReservation(@ModelAttribute ("newreservation") Reservations reservations) {
        reservationService.createNewReservation(reservations);
        return "redirect:/reservation";
    }
    @GetMapping("/reservation")
    public String reservationPage(Model model) {
        model.addAttribute("reservationList", reservationService.getAllReservations());
        return "reservation";
    }
}

