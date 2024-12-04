package hiber.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "cars")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NonNull
    String model;

    @Column
    @NonNull
    int series;

    @OneToOne(mappedBy = "car",cascade = CascadeType.ALL)
    private User user;


}
