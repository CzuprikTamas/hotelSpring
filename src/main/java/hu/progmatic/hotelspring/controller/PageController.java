package hu.progmatic.hotelspring.controller;


import hu.progmatic.hotelspring.model.Guests;
import hu.progmatic.hotelspring.model.Reservations;
import hu.progmatic.hotelspring.service.GuestsService;
import hu.progmatic.hotelspring.service.ReservationService;
import hu.progmatic.hotelspring.service.RoomsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class PageController {
    private final GuestsService guestsService;
    private final ReservationService reservationService;
    private final RoomsService roomsService;


    @GetMapping({"/", "/home"})
    public String index() {
        return "home";
    }

    @GetMapping("/rooms")
    public String roomsPage() {
        return "rooms";
    }

    @GetMapping("/add-guest")
    public String addUserPage(Model model) {
        model.addAttribute("newGuest", new Guests());
        return "addguest";
    }
    @GetMapping("/modify-guest")
    public String modifyUser(Model model) {
        model.addAttribute("newGuest", new Guests());
        return "modifyguest";
    }
    @GetMapping("/modify-reservation")
    public String modifyReservation(Model model) {
        model.addAttribute("newReservation", new Reservations());
        return "modify_reservation";
    }
    @GetMapping("/add-reservation")
    public String addReservationPage(Model model) {
        model.addAttribute("newReservation", new Reservations());
        return "addreservation";
    }
}
