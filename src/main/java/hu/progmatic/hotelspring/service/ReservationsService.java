package hu.progmatic.hotelspring.service;

import hu.progmatic.hotelspring.model.Guests;
import hu.progmatic.hotelspring.model.Reservations;
import hu.progmatic.hotelspring.model.Rooms;
import hu.progmatic.hotelspring.repository.ReservationsRepository;
import hu.progmatic.hotelspring.repository.RoomsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class ReservationsService {

    private ReservationsRepository reservationsRepository;
    private RoomsRepository roomsRepository;

    public List<Reservations> getAllReservations() {
        return reservationsRepository.findAll();
    }

    public Reservations createNewReservation(Reservations reservations) {
        return reservationsRepository.save(reservations);
    }

    public void deleteReservation(Integer id) {
        if (!reservationsRepository.existsById(id)) {
            throw new RuntimeException("Vendég nem található ezen az azonosítón: " + id);
        }
        reservationsRepository.deleteById(id);
    }

    // A szalloda jelenlegi telitettsege

    public Map<Integer, Integer> getSaturation() {
        List<Reservations> reservationsList = reservationsRepository.findAll();
        List<Rooms> roomsList = roomsRepository.findAll();

        Map<Integer, Integer> saturationMap = new HashMap<>();

        for (Rooms rooms : roomsList) {
            saturationMap.put(rooms.getRoomNumber(), 0);
        }

        for (Reservations reservations : reservationsList) {
            Integer roomID = reservations.getRoomsId().getRoomNumber();
            int currentSaturation = saturationMap.get(roomID);
            saturationMap.put(roomID, currentSaturation + 1);
        }
        return saturationMap;
    }
}
