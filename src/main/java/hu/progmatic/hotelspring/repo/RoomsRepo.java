package hu.progmatic.hotelspring.repo;

import hu.progmatic.hotelspring.model.Rooms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomsRepo extends JpaRepository<Rooms, Integer> {
}
