package com.example.Facetify.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Publications")
public class Publications {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_publication;

    @Basic
    private String title;
    private String footer;
    private byte img;
    private String events_details;

    public Publications (Long id_publication, String title,  String footer, byte img, String events_details) {
       this.id_publication = id_publication;
       this.title = title;
       this.footer = footer;
       this.img = img;
       this.events_details = events_details;
    }

    public Publications(){

    }

}
