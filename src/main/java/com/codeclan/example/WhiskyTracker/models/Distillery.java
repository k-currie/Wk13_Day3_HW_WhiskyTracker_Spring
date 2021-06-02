package com.codeclan.example.WhiskyTracker.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "distilleries")
public class Distillery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "region")
    private String region;

    @OneToMany(mappedBy = "distillery", fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"distillery"})
    private List<Whisky> whiskies;

    public Distillery() {
    }

    public Distillery(String name, String region) {
        this.name = name;
        this.region = region;
        this.whiskies = new ArrayList<>();
    }

    //GETTERS & SETTERS

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<Whisky> getWhiskies() {
        return whiskies;
    }

    public void setWhiskies(List<Whisky> whiskies) {
        this.whiskies = whiskies;
    }

    // OTHER METHOD/S
    public void addWhisky(Whisky whisky){
        this.whiskies.add(whisky);
    }
}
