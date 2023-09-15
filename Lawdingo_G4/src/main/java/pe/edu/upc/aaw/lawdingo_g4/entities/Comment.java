package pe.edu.upc.aaw.lawdingo_g4.entities;

import javax.persistence.*;

@Entity
@Table(name = "Comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComment;

//    @ManyToOne
//    @JoinColumn(name = "idClient")
//    private rUsers client;
//
//    @ManyToOne
//    @JoinColumn(name = "idLawyer", nullable = false)
//    private rUsers lawyer;

    @Column(name = "description", length = 100, nullable = false)
    private String description;

    @Column(name = "score", nullable = false)
    private int score;

    public Comment() {
    }

    public Comment(int idComment, rUsers client, rUsers lawyer, String description, int score) {
        this.idComment = idComment;
//        this.client = client;
//        this.lawyer = lawyer;
        this.description = description;
        this.score = score;
    }

    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
    }

//    public rUsers getClient() {
//        return client;
//    }
//
//    public void setClient(rUsers client) {
//        this.client = client;
//    }
//
//    public rUsers getLawyer() {
//        return lawyer;
//    }
//
//    public void setLawyer(rUsers lawyer) {
//        this.lawyer = lawyer;
//    }

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
