package hu.progmatic.hotelspring.repository;

import hu.progmatic.hotelspring.model.Guests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestsRepository extends JpaRepository<Guests, Integer> {
}
