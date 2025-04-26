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
@Table(name = "Contrato")

public class Contrato {
    @Id
    @Column(name = "pk_id_contrato")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "valor", nullable = false)
    private Number valor;
    @Column(name = "fecha")
    private LocalDate fecha;
    @Column(name = "tipo", nullable = false)
    private String tipo;

    @ManyToOne
    @JoinColumn(name = "fk_id_instructor", nullable = false)
    private Instructor instructor;

    @OneToOne(mappedBy = "contrato")
    private ActaInicio actainicio;
}