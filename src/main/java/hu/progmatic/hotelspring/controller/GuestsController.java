package hu.progmatic.hotelspring.controller;

import hu.progmatic.hotelspring.model.Guests;
import hu.progmatic.hotelspring.service.GuestsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@AllArgsConstructor
public class GuestsController {

    private GuestsService guestsService;

//    @PostMapping
//    public Guests createNewGuests() {
//        return guestsService.createNewGuest(new Guests());
//    }

    @PostMapping("/add-guest")
    public String addUSer(@ModelAttribute ("newGuest") Guests guests) {
        guestsService.createNewGuest(guests);
        return "redirect:/guests";
    }
    @GetMapping("/guests")
    public String guestsPage(Model model) {
        model.addAttribute("guestList",
                guestsService.getAllGuests());
        return "guests";
    }
}
