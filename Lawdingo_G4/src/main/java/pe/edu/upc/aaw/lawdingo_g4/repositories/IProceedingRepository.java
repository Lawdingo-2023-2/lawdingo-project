package pe.edu.upc.aaw.lawdingo_g4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.aaw.lawdingo_g4.entities.Proceeding;

public interface IProceedingRepository extends JpaRepository<Proceeding, Integer> {
}
