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
@Table(name = "Horario")

public class Horario {
    @Id
    @Column(name = "pk_id_horario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fecha_inicio")
    private LocalDate fecha_inicio;
    @Column(name = "fecha_fin")
    private LocalDate fecha_fin;
    @Column(name = "hora_inicio")
    private LocalTime hora_inicio;
    @Column(name = "hora_fin")
    private LocalTime hora_fin;

    @ManyToOne
    @JoinColumn(name = "fk_id_coordinador", nullable = false)
    private Coordinador coordinador;

    @OneToOne
    @JoinColumn(name = "fk_id_instructor", nullable = false)
    private Instructor instructor;

}
