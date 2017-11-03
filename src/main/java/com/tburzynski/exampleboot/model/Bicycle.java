package com.tburzynski.exampleboot.model;

import javax.persistence.*;

@Entity
@Table(name = "BICYCLE")
public class Bicycle extends Vehicle{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "BICYCLE_TYPE")
    private String bicycleType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBicycleType() {
        return bicycleType;
    }

    public void setBicycleType(String bicycleType) {
        this.bicycleType = bicycleType;
    }
}
