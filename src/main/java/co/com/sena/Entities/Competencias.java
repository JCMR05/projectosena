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
@Table(name = "Competencias")

public class Competencias {
    @Id
    @Column(name = "pk_id_competencias")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre",nullable = false,length = 50)
    private String nombre;

    @ManyToMany
    @JoinTable(
            name = "programaFormacionCompetencias",
            joinColumns = @JoinColumn(name = "fk_id_competencias"),
            inverseJoinColumns = @JoinColumn(name = "fk_id_programaFormacion")
    )
    private List<ProgramaFormacion> programaFormacion;

}
