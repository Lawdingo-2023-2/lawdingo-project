package pe.edu.upc.aaw.lawdingo_g4.entities;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    @Column(name = "name", length = 20, nullable = false)
    private String name;
}
