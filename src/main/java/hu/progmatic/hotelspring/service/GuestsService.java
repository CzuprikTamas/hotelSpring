package hu.progmatic.hotelspring.service;

import hu.progmatic.hotelspring.model.Guests;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;
import hu.progmatic.hotelspring.repo.GuestsRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@AllArgsConstructor
public class GuestsService {
    private GuestsRepo guestsRepo;

    public List<Guests> getAllGuests() {
        return guestsRepo.findAll();
    }

    public Guests createNewGuest(Guests guests) {
        return guestsRepo.save(guests);
    }
}
