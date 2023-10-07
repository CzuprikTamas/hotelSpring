package hu.progmatic.hotelspring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Rooms {

    @Id
    private Integer roomNumber;
    private Integer maxCapacity;
    private Integer nightlyRate;
    private boolean hasJacuzzi;
    private boolean hasSauna;
}

