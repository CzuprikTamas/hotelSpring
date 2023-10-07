package hu.progmatic.hotelspring.controller;


import hu.progmatic.hotelspring.model.Guests;
import hu.progmatic.hotelspring.service.GuestsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class addController {

    private GuestsService guestsService;

//    @GetMapping("/add-guest")
//    public String addUserPage(Model model) {
//        model.addAttribute("newGuests", new Guests());
//        return "addGuest";
//    }
//
//    @PostMapping("/create-guest")
//    public String addUSer(Guests guests) {
//        guestsService.createNewGuest(guests);
//        return "redirect:users";
//    }

}
