package hiber.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "users")
@RequiredArgsConstructor
@Data
@NoArgsConstructor
public class User {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(name = "name")
   @NonNull
   private String firstName;

   @Column(name = "last_name")
   @NonNull
   private String lastName;

   @Column(name = "email")
   @NonNull
   private String email;

   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "car_id", referencedColumnName = "id")
   private Car car;

}
