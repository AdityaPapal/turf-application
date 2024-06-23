package turf.turfApp.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "turf")
public class Turf {

    @Id
    @Column(name = "turf_id")
    public int turfId;

    @Column(name = "turf_name")
    public String turfName;

}
