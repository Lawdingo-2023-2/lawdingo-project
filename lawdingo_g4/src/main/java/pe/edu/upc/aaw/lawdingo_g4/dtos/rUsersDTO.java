package pe.edu.upc.aaw.lawdingo_g4.dtos;

import pe.edu.upc.aaw.lawdingo_g4.entities.Role;

import java.util.List;

public class rUsersDTO {
    private int id;
    private String username;
    private String password;
    private Boolean enabled;
    private List<Role>roles;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
