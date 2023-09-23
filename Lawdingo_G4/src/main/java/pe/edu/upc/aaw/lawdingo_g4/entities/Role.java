package pe.edu.upc.aaw.lawdingo_g4.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

//holas
@Entity
@Table(name = "roles",uniqueConstraints = {@UniqueConstraint(columnNames ={ "user_id","rol"})})
public class Role implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idrol;
    private String rol;

    //@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "user_id")

    private Users user;

    public Long getIdrol() {
        return idrol;
    }

    public void setIdrol(Long id) {
        this.idrol = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
