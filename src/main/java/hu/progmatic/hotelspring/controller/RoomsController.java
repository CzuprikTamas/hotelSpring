package hu.progmatic.hotelspring.controller;


import hu.progmatic.hotelspring.model.Rooms;
import hu.progmatic.hotelspring.service.RoomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class RoomsController {
    private final RoomsService roomsService;


    public RoomsController(RoomsService roomsService) {
        this.roomsService = roomsService;
    }
}

