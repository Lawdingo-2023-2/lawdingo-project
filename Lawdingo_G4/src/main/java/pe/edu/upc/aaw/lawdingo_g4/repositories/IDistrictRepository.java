package pe.edu.upc.aaw.lawdingo_g4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.lawdingo_g4.entities.District;
import pe.edu.upc.aaw.lawdingo_g4.entities.Documentation;

@Repository
public interface IDistrictRepository extends JpaRepository<District, Integer> {
}
