package pe.edu.upc.aaw.lawdingo_g4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.lawdingo_g4.entities.Users;

import java.util.List;

@Repository
public interface IUsersRepository extends JpaRepository<Users,Long> {

    // Consulta personalizada utilizando @Query
    @Query(value = "SELECT * FROM Users WHERE name LIKE :startsWith%", nativeQuery = true)
    List<Users> findByStartingLetter(@Param("startsWith") String startsWith);

    List<Users>findByName(String name);


}
