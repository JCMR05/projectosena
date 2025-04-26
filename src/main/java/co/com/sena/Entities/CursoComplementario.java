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
@Table(name = "CursoComplementario")

public class CursoComplementario {
    @Id
    @Column(name = "pk_id_competencias")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre",nullable = false,length = 50)
    private String nombre;

    @ManyToMany
    @JoinTable(
            name = "AprendizCursoComplementario",
            joinColumns = @JoinColumn(name = "fk_id_cursoComplementario"),
            inverseJoinColumns = @JoinColumn(name = "fk_id_aprendiz")
    )
    private List<Aprendiz> aprendiz;
}
