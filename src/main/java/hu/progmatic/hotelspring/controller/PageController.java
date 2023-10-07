package hu.progmatic.hotelspring.controller;

import hu.progmatic.hotelspring.model.Guests;
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

    @GetMapping("/reservation")
    public String reservationPage() {
        return "reservation";
    }

    @GetMapping("/guests")
    public String guestsPage(Model model) {
        model.addAttribute("guestList",
                guestsService.getAllGuests());
        return "guests";
    }

//    @GetMapping("/statistics")
//    public String statisticsPage() {
//        return "statistics";
//    }

    @GetMapping("/statistics")
    public String statisticsPage(Model model) {
        Map<Integer, Integer> saturationMap = reservationsService.getSaturation();
        model.addAttribute("saturationMap", saturationMap);
        return "statistics";
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

    @PostMapping("/add-guest")
    public String addUSer(@ModelAttribute ("newGuest") Guests guests) {
        guestsService.createNewGuest(guests);
        return "redirect:/reg";
    }

}
