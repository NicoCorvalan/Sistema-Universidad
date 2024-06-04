package sistema_universidad.universidad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sistema_universidad.universidad.model.Carrera;

@Repository
public interface CarreraRepository extends JpaRepository<Carrera, Long> {

}
