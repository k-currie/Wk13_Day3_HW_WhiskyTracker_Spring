package com.codeclan.example.WhiskyTracker.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import sun.jvm.hotspot.utilities.soql.JSJavaTypeArray;

import javax.persistence.*;

@Entity
@Table(name = "whiskies")
public class Whisky {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "year")
    private int year;

    @Column(name = "age")
    private int age;

    @ManyToOne
    @JsonIgnoreProperties({"whisky"})
    @JoinColumn(name = "distillery_id", nullable = false)
    private Distillery distillery;

    public Whisky() {
    }

    public Whisky(String name, int year, int age, Distillery distillery) {
        this.name = name;
        this.year = year;
        this.age = age;
        this.distillery = distillery;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Distillery getDistillery() {
        return distillery;
    }

    public void setDistillery(Distillery distillery) {
        this.distillery = distillery;
    }
}
