package co.com.sena.Entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;


@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Centro")

public class Centro {
    @Id
    @Column(name = "pk_id_centro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre",nullable = false,length = 50)
    private String nombre;
    @Column(name = "direccion",nullable = false,length = 100)
    private String direccion;

    @OneToMany(mappedBy = "centro")
    private List<Instructor> instructor;
}
