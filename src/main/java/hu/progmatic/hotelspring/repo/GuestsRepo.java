package hu.progmatic.hotelspring.repo;

import hu.progmatic.hotelspring.model.Guests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestsRepo extends JpaRepository<Guests,Integer> {
}
