package com.mycompany.doggrooming.logic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pet {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int num_customer;
    private String name;
    private String breed;
    private String color;
    private String allergic;
    private String spatt;
    private String obs;
    @OneToOne
    private Owner oneOwner;

    public Pet() {
    }

    public Pet(int num_customer, String name, String breed, String color, String allergic, String spatt, String obs, Owner oneOwner) {
        this.num_customer = num_customer;
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.allergic = allergic;
        this.spatt = spatt;
        this.obs = obs;
        this.oneOwner = oneOwner;
    }

    public int getNum_customer() {
        return num_customer;
    }

    public void setNum_customer(int num_customer) {
        this.num_customer = num_customer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAllergic() {
        return allergic;
    }

    public void setAllergic(String allergic) {
        this.allergic = allergic;
    }

    public String getSpatt() {
        return spatt;
    }

    public void setSpatt(String spatt) {
        this.spatt = spatt;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Owner getOneOwner() {
        return oneOwner;
    }

    public void setOneOwner(Owner oneOwner) {
        this.oneOwner = oneOwner;
    }
    
    
}
