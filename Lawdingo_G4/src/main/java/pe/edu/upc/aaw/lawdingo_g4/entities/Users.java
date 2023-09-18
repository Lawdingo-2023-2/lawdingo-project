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

    @Column(name = "birthDate", nullable = false)
    private LocalDate birthDate;

    @Column(name="sub_startdate",nullable = false)
    private LocalDate sub_startdate;

    @Column(name="lawyer",nullable = false)
    private boolean lawyer;

    @ManyToOne
    @JoinColumn(name ="IdSubscription")
    private Subscription subscription;

    public Users() {}

    public Users(int idUser, String name, String email, String password, int phone_num, int dni, LocalDate birthDate, LocalDate sub_startdate, boolean lawyer, Subscription subscription) {
        this.idUser = idUser;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone_num = phone_num;
        this.dni = dni;
        this.birthDate = birthDate;
        this.sub_startdate = sub_startdate;
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
