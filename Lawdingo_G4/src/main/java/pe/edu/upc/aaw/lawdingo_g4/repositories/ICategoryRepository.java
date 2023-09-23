package pe.edu.upc.aaw.lawdingo_g4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.lawdingo_g4.entities.Category;

import java.util.List;

@Repository

public interface ICategoryRepository extends JpaRepository<Category,Integer> {
    @Query(value = "select r.name as Category ,count(*) as Consultationsmade\n" +
            "from Category r inner join Consultation c\n" +
            "on r.id_category=c.id_category\n" +
            "group by r.name",nativeQuery = true)
    List<String[]> quantityConsultationByCategory();
=======
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.lawdingo_g4.entities.Category;

@Repository

public interface ICategoryRepository extends JpaRepository<Category,Integer> {
>>>>>>> parent of eade7df (intento de Web Deployment)
}
