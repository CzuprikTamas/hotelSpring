package hu.progmatic.hotelspring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
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
    private Integer room_number;
    private Integer max_capacity;
    private Integer nightly_rate;
    private boolean has_jacuzzi;
    private boolean has_sauna;
}
