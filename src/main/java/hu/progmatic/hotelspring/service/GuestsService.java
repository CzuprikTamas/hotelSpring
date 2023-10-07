package hu.progmatic.hotelspring.service;

import hu.progmatic.hotelspring.model.Guests;
import hu.progmatic.hotelspring.repository.GuestsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GuestsService {

    private GuestsRepository guestsRepository;

    public List<Guests> getAllGuests() {
        return guestsRepository.findAll();
    }


    public Guests createNewGuest(Guests guests) {
        return guestsRepository.save(guests);
    }
}
