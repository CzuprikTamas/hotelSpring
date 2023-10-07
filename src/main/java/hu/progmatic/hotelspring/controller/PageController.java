package hu.progmatic.hotelspring.controller;

import hu.progmatic.hotelspring.model.Guests;
import hu.progmatic.hotelspring.model.Reservations;
import hu.progmatic.hotelspring.service.GuestsService;
import hu.progmatic.hotelspring.service.ReservationsService;
import hu.progmatic.hotelspring.service.RoomsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
@AllArgsConstructor
public class PageController {
    private GuestsService guestsService;
    private ReservationsService reservationsService;
    private RoomsService roomsService;

    @GetMapping("/home")
    public String homePage() {
        return "home";
    }


    @GetMapping("/rooms")
    public String roomPage() {
        return "rooms";
    }

    @GetMapping("/add-guest")
    public String addUserPage(Model model) {
        model.addAttribute("newGuest", new Guests());
        return "addGuest";
    }

    @GetMapping("/modify-guest")
    public String modifyUser(Model model) {
        model.addAttribute("newGuest", new Guests());
        return "modifyGuest";
    }

    @GetMapping("/modify-reservation")
    public String modifyReservation(Model model) {
        model.addAttribute("newReservation", new Reservations());
        return "modifyReservation";
    }
    @GetMapping("/add-reservation")
    public String addReservationPage(Model model) {
        model.addAttribute("newreservation", new Reservations());
        return "addReservation";
    }

}
