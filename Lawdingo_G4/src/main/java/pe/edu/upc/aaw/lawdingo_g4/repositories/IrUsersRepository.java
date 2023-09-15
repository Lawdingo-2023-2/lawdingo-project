package pe.edu.upc.aaw.lawdingo_g4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.aaw.lawdingo_g4.entities.rUsers;

@Repository
public interface IrUsersRepository extends JpaRepository<rUsers,Long> {
    public rUsers findByUsername(String username);

    //BUSCAR POR NOMBRE
    @Query("select count(u.username) from rUsers u where u.username =:username")
    public int buscarUsername(@Param("username") String nombre);


    //INSERTAR ROLES
    @Transactional
    @Modifying
    @Query(value = "insert into roles (rol, user_id) VALUES (:rol, :ruser_id)", nativeQuery = true)
    public void insRol(@Param("rol") String authority, @Param("ruser_id") Long user_id);

}
