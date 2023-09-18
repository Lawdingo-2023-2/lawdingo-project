package pe.edu.upc.aaw.lawdingo_g4.entities;

import javax.persistence.*;

@Entity
@Table(name = "Subscription")
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSubscription;


}
