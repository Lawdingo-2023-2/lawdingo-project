package pe.edu.upc.aaw.lawdingo_g4.dtos;
import pe.edu.upc.aaw.lawdingo_g4.entities.rUsers;

public class RoleDTO {
    private int id;

    private String rol;

    private rUsers user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
