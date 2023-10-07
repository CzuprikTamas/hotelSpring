package hu.progmatic.hotelspring.controller;

import hu.progmatic.hotelspring.model.Guests;
import hu.progmatic.hotelspring.model.Rooms;
import hu.progmatic.hotelspring.service.RoomsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class RoomsController {

    private RoomsService roomsService;

//    @GetMapping("/rooms")
//    public List<Rooms> getAllRooms() {
//        return roomsService.getAllRooms();
//    }

}
