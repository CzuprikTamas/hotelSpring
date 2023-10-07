package hu.progmatic.hotelspring.controller;

import hu.progmatic.hotelspring.model.Guests;
import hu.progmatic.hotelspring.service.GuestsService;
import lombok.AllArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class GuestsController {

    private GuestsService guestsService;

//    @GetMapping("/guests")
//    public List<Guests> getAllGuests(){
//        return guestsService.getAllGuests();
//    }

    @PostMapping
    public Guests createNewGuests() {
        return guestsService.createNewGuest(new Guests());
    }


}
