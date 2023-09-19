package pe.edu.upc.aaw.lawdingo_g4.dtos;

import pe.edu.upc.aaw.lawdingo_g4.entities.Subscription;

import java.time.LocalDate;

public class UserDTO {

    private int idUser;
    private String name;
    private String email;
    private String password;
    private int phone_num;
    private int dni;
    private LocalDate birthDate;
    private LocalDate sub_startdate;
    private boolean lawyer;
    private Subscription subscription;


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
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getSub_startdate() {
        return sub_startdate;
    }

    public void setSub_startdate(LocalDate sub_startdate) {
        this.sub_startdate = sub_startdate;
    }

    public boolean isLawyer() {
        return lawyer;
    }

    public void setLawyer(boolean lawyer) {
        this.lawyer = lawyer;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }
}
