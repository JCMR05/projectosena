package co.com.sena.Entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;


@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Instructor")

public class Instructor {
    @Id
    @Column(name = "pk_id_instructor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre",nullable = false,length = 50)
    private String nombre;
    @Column(name = "apellido",nullable = false,length = 50)
    private String apellido;
    @Column(name = "correo",length = 100,nullable = false, unique = true)
    private String correo;
    @Column(name = "telefono", nullable = false, unique = true)
    private Long telefono;
    @Column(name = "documento",length = 10,nullable = false, unique = true)
    private Long documento;
    @Column(name = "direccion", length = 30, nullable = false)
    private String direccion;

    @OneToOne(mappedBy = "instructor")
    private Horario horario;

    @ManyToOne
    @JoinColumn(name = "fk_id_centro", nullable = false)
    private Centro centro;

    @OneToMany(mappedBy = "instructor")
    private List<Contrato> contrato;

    @ManyToOne
    @JoinColumn(name = "fk_id_tipoContrato", nullable = false)
    private TipoContrato tipoContrato;

    @ManyToMany(mappedBy = "instructor")
    private List<ProgramaFormacion> programaFormacion;
}
