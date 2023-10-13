package hu.progmatic.hotelspring.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Reservations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reservationId;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private Integer numberOfGuests;
    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name="guest_id")
    @JsonBackReference
    private Guests guestReservation;
    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name="room_number")
    @JsonBackReference
    private Rooms roomsReservation;
}
