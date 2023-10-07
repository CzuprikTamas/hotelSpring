package hu.progmatic.hotelspring.repo;

import hu.progmatic.hotelspring.model.Reservations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepo extends JpaRepository<Reservations,Integer> {
}
