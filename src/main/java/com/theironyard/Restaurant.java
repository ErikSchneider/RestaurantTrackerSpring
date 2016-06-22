package com.theironyard;

import javax.persistence.*;

/**
 * Created by Erik on 6/21/16.
 */
@Entity
@Table(name = "restaurants")
public class Restaurant {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String location;

    @Column(nullable = false)
    int rating;

    @Column(nullable = false)
    String comment;

    @ManyToOne
    User user;


    public Restaurant() {
    }

    public Restaurant(String name, String location, int rating, String comment, User user) {
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.comment = comment;
        this.user = user;
    }

    public Restaurant(int id, String name, String location, int rating, String comment) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.comment = comment;
    }
}
