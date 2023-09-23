package pe.edu.upc.aaw.lawdingo_g4.dtos;

import pe.edu.upc.aaw.lawdingo_g4.entities.Users;

public class RoleDTO {
    private Long idrol;

    private String rol;

    private Users user;

    public Long getIdrol() {
        return idrol;
    }

    public void setIdrol(Long idrol) {
        this.idrol = idrol;
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
