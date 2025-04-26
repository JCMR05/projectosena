package co.com.sena.Entities;

import jakarta.persistence.*;
import lombok.*;

import javax.sound.sampled.BooleanControl;
import java.time.LocalDate;
import java.time.LocalTime;


@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ActaInicio")

public class ActaInicio {
    @Id
    @Column(name = "pk_id_actainicio")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fecha")
    private LocalDate fecha;
    @Column(name = "descripcion", length = 100, nullable = false)
    private String descripcion;

    @OneToOne
    @JoinColumn(name = "fk_id_actainicio", nullable = false)
    private Contrato contrato;
}
