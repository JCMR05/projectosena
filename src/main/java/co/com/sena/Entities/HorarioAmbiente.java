package co.com.sena.Entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "HorarioAmbiente")

public class HorarioAmbiente {
    @Id
    @Column(name = "pk_id_horarioAmbiente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "hora_inicio")
    private LocalTime hora_inicio;
    @Column(name = "hora_fin")
    private LocalTime hora_fin;
    @Column(name = "fecha")
    private Date fecha;

    @OneToOne
    @JoinColumn(name = "fk_id_ambiente", nullable = false)
    private Ambiente ambiente;

}