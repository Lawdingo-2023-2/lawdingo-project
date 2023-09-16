package pe.edu.upc.aaw.lawdingo_g4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.upc.aaw.lawdingo_g4.entities.Comment;

import java.util.List;

public interface ICommentRepository extends JpaRepository<Comment, Integer> {

    @Query(value = "select cl.name as client, c.description, c.score\n" +
            "\n" +
            "from comment c\n" +
            "\n" +
            "join users cl on c.id_client = cl.id_user\n" +
            "\n" +
            "join users la on c.id_lawyer = la.id_user\n" +
            "\n" +
            "where c.id_lawyer = " + Integer.toString(idLaw), nativeQuery = true)
    public List<String[]> quantityTaskByPerson(int idLaw);
}
