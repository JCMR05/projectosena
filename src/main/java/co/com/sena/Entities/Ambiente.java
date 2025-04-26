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
@Table(name = "Ambiente")

public class Ambiente {
    @Id
    @Column(name = "pk_id_ambiente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre",nullable = false,length = 50)
    private String nombre;

    @OneToMany(mappedBy = "ambiente")
    private List<ProgramaFormacion> programaFormacion;

    @OneToOne(mappedBy = "ambiente")
    private HorarioAmbiente horarioAmbiente;

}

