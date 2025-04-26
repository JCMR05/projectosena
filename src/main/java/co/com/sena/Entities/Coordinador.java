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
@Table(name = "Coordinador")

public class Coordinador {
    @Id
    @Column(name = "pk_id_coordinador")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;
    @Column(name = "apellido", length = 50, nullable = false)
    private String apellido;
    @Column(name = "correo", length = 100, nullable = false, unique = true)
    private String correo;
    @Column(name = "telefono", nullable = false, unique = true)
    private Long telefono;

    @OneToMany(mappedBy = "coordinador")
    private List<Horario> horario;

}
