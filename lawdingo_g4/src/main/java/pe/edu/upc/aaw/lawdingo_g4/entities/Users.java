package pe.edu.upc.aaw.lawdingo_g4.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;

    @Column(name = "name",length = 20,nullable = false)
    private String name;

    @Column (name = "email",length =20, nullable = false)
    private String email;
    @Column(name = "password", length = 25, nullable = false)
    private String password;

    @Column(name = "numberPhone", unique = true,nullable = false)
    private int phone_num;

    @Column(name ="DNI", unique = true, nullable = false)
    private int dni;

    @Column(name = "birthDay", nullable = false)
    private LocalDate birthDay;

    @Column(name="sub_start_date",nullable = false)
    private LocalDate sub_start_date;

    @Column(name="lawyer",nullable = false)
    private boolean lawyer;

    @ManyToOne
    @JoinColumn(name ="IdSubscription")
    private Subscription subscription;

    public Users() {}

    public Users(int idUser, String name, String email, String password, int phone_num, int dni, LocalDate birthDay, LocalDate sub_start_date, boolean lawyer, Subscription subscription) {
        this.idUser = idUser;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone_num = phone_num;
        this.dni = dni;
        this.birthDay = birthDay;
        this.sub_start_date = sub_start_date;
        this.lawyer = lawyer;
        this.subscription = subscription;
    }

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

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }
}
