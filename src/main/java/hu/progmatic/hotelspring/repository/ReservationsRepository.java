package hu.progmatic.hotelspring.repository;

import hu.progmatic.hotelspring.model.Reservations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationsRepository extends JpaRepository<Reservations, Integer> {
}
