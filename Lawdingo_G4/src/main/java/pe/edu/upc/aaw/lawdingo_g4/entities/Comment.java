package pe.edu.upc.aaw.lawdingo_g4.entities;

import javax.persistence.*;

@Entity
@Table(name = "Comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComment;

    @ManyToOne
    @JoinColumn(name = "idClient")
    private Users idClient;
    
    @Column(name = "idLawyer", nullable = false)
    private int idLawyer;

    @Column(name = "description", length = 100, nullable = false)
    private String description;

    @Column(name = "score", nullable = false)
    private int score;

    public Comment() {
    }

    public Comment(int idComment, int idClient, int idLawyer, String description, int score) {
        this.idComment = idComment;
        this.idClient = idClient;
        this.idLawyer = idLawyer;
        this.description = description;
        this.score = score;
    }

    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdLawyer() {
        return idLawyer;
    }

    public void setIdLawyer(int idLawyer) {
        this.idLawyer = idLawyer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
