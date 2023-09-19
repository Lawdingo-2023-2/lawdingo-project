package pe.edu.upc.aaw.lawdingo_g4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.lawdingo_g4.entities.Subscription;
import pe.edu.upc.aaw.lawdingo_g4.entities.Users;

import java.util.List;

@Repository
public interface ISubscriptionRepository extends JpaRepository<Subscription,Integer> {
    List<Subscription> findByName(String name);
    // Consulta personalizada para obtener las suscripciones por usuario
    @Query("SELECT u.subscription FROM Users u WHERE u.idUser = :userId")
    List<Subscription> findSubscriptionsByUser(@Param("userId") int userId);


}
