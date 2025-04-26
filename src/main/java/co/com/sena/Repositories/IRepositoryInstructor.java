package co.com.sena.Repositories;

import co.com.sena.Entities.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryInstructor extends JpaRepository<Instructor,Long> {
}
