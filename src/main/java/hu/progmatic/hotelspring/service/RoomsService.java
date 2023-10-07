package hu.progmatic.hotelspring.service;

import hu.progmatic.hotelspring.model.Rooms;
import hu.progmatic.hotelspring.repo.RoomsRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RoomsService {

    private RoomsRepo roomsRepo;

    public List<Rooms> getAllRooms() {
        return roomsRepo.findAll();
    }
}


