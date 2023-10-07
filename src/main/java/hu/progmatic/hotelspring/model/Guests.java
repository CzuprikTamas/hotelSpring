package hu.progmatic.hotelspring.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Guests {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer guestId;
    private String title;
    private String lastName;
    private String firstName;
    private String placeOfBirth;
    private LocalDate dateOfBirth;
    private String personalId;
    private String email;

    @OneToMany(mappedBy = "guestsId")
    @JsonManagedReference
    private List<Reservations> guestReservations;
}
