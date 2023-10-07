package hu.progmatic.hotelspring.service;

import hu.progmatic.hotelspring.model.Guests;
import hu.progmatic.hotelspring.model.Reservations;
import hu.progmatic.hotelspring.repository.ReservationsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationsService {

    private ReservationsRepository reservationsRepository;

    public List<Reservations> getAllReservations() {
        return reservationsRepository.findAll();
    }

    public Reservations createNewGuest(Reservations reservations) {
        return reservationsRepository.save(reservations);
    }

    public void deleteReservation(Integer id) {
        if (!reservationsRepository.existsById(id)) {
            throw new RuntimeException("Vendég nem található ezen az azonosítón: " + id);
        }
        reservationsRepository.deleteById(id);
    }
}
