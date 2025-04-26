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
@Table(name = "Aprendiz")

public class Aprendiz {
    @Id
    @Column(name = "pk_id_aprendiz")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @Column(name = "apellido", nullable = false, length = 50)
    private String apellido;
    @Column(name = "correo", length = 100, nullable = false, unique = true)
    private String correo;
    @Column(name = "telefono", nullable = false, unique = true)
    private Long telefono;
    @Column(name = "documento", length = 10, nullable = false, unique = true)
    private Long documento;

    @ManyToOne
    @JoinColumn(name = "fk_id_programaFormacion")
    private ProgramaFormacion programaFormacion;

    @ManyToMany(mappedBy = "aprendiz")
    private List<CursoComplementario> cursoComplementario;

}