package pe.edu.upc.aaw.lawdingo_g4.entities;

import javax.persistence.*;
import java.io.Serializable;

//holas
@Entity
@Table(name = "roles",uniqueConstraints = {@UniqueConstraint(columnNames ={ "ruser_id","rol"})})
public class Role implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rol;
    @ManyToOne
    @JoinColumn(name = "ruser_id",nullable = false)
    private rUsers user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public rUsers getUser() {
        return user;
    }

    public void setUser(rUsers user) {
        this.user = user;
    }
}
