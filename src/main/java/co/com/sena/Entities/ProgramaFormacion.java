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
@Table(name = "ProgramaFormacion")

public class ProgramaFormacion {
    @Id
    @Column(name = "pk_id_programaFormacion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre",nullable = false,length = 50)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "fk_id_ambiente", nullable = false)
    private Ambiente ambiente;

    @ManyToMany
    @JoinTable(
            name = "programaFormacionInstructor",
            joinColumns = @JoinColumn(name = "fk_id_programaFormacion"),
            inverseJoinColumns = @JoinColumn(name = "fk_id_instructor")
    )
    private List<Instructor> instructor;

    @ManyToMany(mappedBy = "programaFormacion")
    private List<Competencias> competencias;

    @OneToMany(mappedBy = "programaFormacion")
    private List<Aprendiz> aprendiz;

}

