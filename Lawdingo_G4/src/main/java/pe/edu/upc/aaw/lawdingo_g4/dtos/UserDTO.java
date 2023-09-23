package pe.edu.upc.aaw.lawdingo_g4.dtos;

import pe.edu.upc.aaw.lawdingo_g4.entities.Role;

import java.time.LocalDate;
import java.util.List;

public class UserDTO {

    private int idUser;
    private String name;
    private String email;
    private String password;
    private int phone_num;
    private int dni;
    private LocalDate birthDay;
    private LocalDate sub_start_date;
    private boolean lawyer;

    private String username;
    private Boolean enabled;
    private List<Role> roles;



    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(int phone_num) {
        this.phone_num = phone_num;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getBirthDate() {
        return birthDay;
    }

    public void setBirthDate(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public LocalDate getSub_start_date() {
        return sub_start_date;
    }

    public void setSub_start_date(LocalDate sub_start_date) {
        this.sub_start_date = sub_start_date;
    }

    public boolean isLawyer() {
        return lawyer;
    }

    public void setLawyer(boolean lawyer) {
        this.lawyer = lawyer;
    }


}
