package pe.edu.upc.aaw.lawdingo_g4.entities;

import javax.persistence.*;

@Entity
@Table(name = "Subscription")
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSubscription;

    @Column(name = "name",nullable = false , length = 20)
    private  String name;

    @Column(name= "amount",nullable = false)
    private Double amount;

    public Subscription() {}

    public Subscription(int idSubscription, String name, Double amount) {
        this.idSubscription = idSubscription;
        this.name = name;
        this.amount = amount;
    }




    public int getIdSubscription() {
        return idSubscription;
    }

    public void setIdSubscription(int idSubscription) {
        this.idSubscription = idSubscription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
