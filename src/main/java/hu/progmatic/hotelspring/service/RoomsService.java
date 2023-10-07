package hu.progmatic.hotelspring.service;

import hu.progmatic.hotelspring.model.Reservations;
import hu.progmatic.hotelspring.model.Rooms;
import hu.progmatic.hotelspring.repository.RoomsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class RoomsService {

    private RoomsRepository roomsRepository;

    public List<Rooms> getAllRooms() {
        return roomsRepository.findAll();
    }

}
