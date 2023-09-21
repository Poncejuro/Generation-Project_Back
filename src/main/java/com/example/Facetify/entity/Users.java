package com.example.Facetify.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Basic
    private String name;
    private String email;

    public Users(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Users(){

    }


}
