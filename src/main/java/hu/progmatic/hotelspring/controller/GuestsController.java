package hu.progmatic.hotelspring.controller;

import hu.progmatic.hotelspring.model.Guests;
import hu.progmatic.hotelspring.service.GuestsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.boot.context.properties.source.ConfigurationPropertyName.isValid;

@Controller
public class GuestsController {
    private final GuestsService guestsService;

    @Autowired
    public GuestsController(GuestsService guestsService) {
        this.guestsService = guestsService;
    }
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

