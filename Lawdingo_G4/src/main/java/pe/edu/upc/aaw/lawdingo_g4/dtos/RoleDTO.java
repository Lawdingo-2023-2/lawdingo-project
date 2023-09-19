package pe.edu.upc.aaw.lawdingo_g4.dtos;
import pe.edu.upc.aaw.lawdingo_g4.entities.rUsers;

public class RoleDTO {
    private Long id;

    private String rol;

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
