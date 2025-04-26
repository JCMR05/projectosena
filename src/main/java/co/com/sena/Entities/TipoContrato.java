package co.com.sena.Entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Length;

import java.util.List;


@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TipoContrato")

public class TipoContrato {
    @Id
    @Column(name = "pk_id_tipoContrato")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "tipoContrato")
    private List<Instructor> instructor;
}
