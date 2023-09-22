package com.example.Facetify.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_profile;

    @Basic
    private String rol;
    private String bibliography;
    private byte photo;

    public Profile (Long id_profile, String rol, String bibliography, byte photo) {
        this.id_profile = id_profile;
        this.rol =rol ;
        this.bibliography = bibliography;
        this.photo = photo;
    }

    public Profile(){

    }

}
