package co.com.sena.Repositories;

import co.com.sena.Entities.Horario;
import co.com.sena.Entities.HorarioAmbiente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryHorarioAmbiente extends JpaRepository<HorarioAmbiente,Long> {
}
