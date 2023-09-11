package pe.edu.upc.aaw.lawdingo_g4.entities;

import javax.persistence.*;

@Entity
@Table(name = "Proceeding")
public class Proceeding {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProceeding;

    @Column(name = "state", nullable = false)
    private char state;

    @ManyToOne
    @JoinColumn(name = "idCourt")
    private Court court;
    private int idClient;
    private int idLawyer;

    public Proceeding() {
    }

    public Proceeding(int idProceeding, char state, Court court, int idClient, int idLawyer) {
        this.idProceeding = idProceeding;
        this.state = state;
        this.court = court;
        this.idClient = idClient;
        this.idLawyer = idLawyer;
    }

    public int getIdProceeding() {
        return idProceeding;
    }

    public void setIdProceeding(int idProceeding) {
        this.idProceeding = idProceeding;
    }

    public char getState() {
        return state;
    }

    public void setState(char state) {
        this.state = state;
    }

    public Court getCourt() {
        return court;
    }

    public void setCourt(Court court) {
        this.court = court;
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
}
