package com.isaac.model;

import java.time.LocalDateTime;
import java.util.Set;
import javax.persistence.*;
import javax.persistence.Entity;

import io.vertx.codegen.doc.Tag;
import jdk.jfr.Category;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDateTime;
import java.util.Set;



@Entity
public class Benutzer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(readOnly = true)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime checkIn;

    @Column(nullable = false)
    private LocalDateTime checkOut;

    @ManyToOne(optional = false)
    @Fetch(FetchMode.JOIN)
    private Category category;

    @ManyToMany
    @JoinTable(
        name = "entry_tags",
        joinColumns = @JoinColumn(name = "entry_id"),
        inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    @JsonIgnoreProperties("entries")
    @Fetch(FetchMode.JOIN)
    private Set<Tag> tags;

}
