package hu.progmatic.hotelspring.service;

import hu.progmatic.hotelspring.model.Reservations;
import hu.progmatic.hotelspring.model.Rooms;
import hu.progmatic.hotelspring.repo.ReservationRepo;
import hu.progmatic.hotelspring.repo.RoomsRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class ReservationService {

    private ReservationRepo reservationRepo;
    private RoomsRepo roomsRepo;

    public List<Reservations> getAllReservations() {
        return reservationRepo.findAll();
    }

    public Reservations createNewReservation(Reservations reservations) {
        return reservationRepo.save(reservations);
    }

    public void deleteReservation(Integer id) {
        if (!reservationRepo.existsById(id)) {
            throw new RuntimeException("Foglalás nem található ezen az azonosítón: " + id);
        }
        reservationRepo.deleteById(id);
    }
    public Map<Integer, Integer> getSaturation() {
        List<Reservations> reservationsList = reservationRepo.findAll();
        List<Rooms> roomsList = roomsRepo.findAll();

        Map<Integer, Integer> saturationMap = new HashMap<>();

        for (Rooms rooms : roomsList) {
            saturationMap.put(rooms.getRoomNumber(), 0);
        }

        for (Reservations reservations : reservationsList) {
            Integer roomID = reservations.getRoomsReservation().getRoomNumber();
            int currentSaturation = saturationMap.get(roomID);
            saturationMap.put(roomID, currentSaturation + 1);
        }
        return saturationMap;
    }
}
