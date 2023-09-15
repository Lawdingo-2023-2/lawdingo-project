package pe.edu.upc.aaw.lawdingo_g4.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "consultation")
public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idConsultation;
    @Column(name = "title",length = 50,nullable = false)
    private String title;
    @Column(name = "date",nullable = false)
    private LocalDate date;
    @Column(name = "description",length = 200,nullable = false)
    private String description;
//    @ManyToOne
//    @JoinColumn(name = "idUsers")
//    private rUsers rUsers;

    public int getIdConsultation() {
        return idConsultation;
    }

    public void setIdConsultation(int idConsultation) {
        this.idConsultation = idConsultation;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public rUsers getUsers() {
//        return rUsers;
//    }
//
//    public void setUsers(rUsers rUsers) {
//        this.rUsers = rUsers;
//    }
}
