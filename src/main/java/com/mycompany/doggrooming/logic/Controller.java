package com.mycompany.doggrooming.logic;

import com.mycompany.doggrooming.persistence.PersistenceController;
import java.util.List;

public class Controller {
    PersistenceController persisControl = new  PersistenceController();

    public void save(String petName, String breed, String color, String obs, String allergic, String spatt, String ownName, String ownCell) {
        //We create the owner ans assign its values.
        Owner owner = new Owner();
        owner.setName(ownName);
        owner.setCell(ownCell);
        //We create the pet and assign its values.
        Pet pet = new Pet();
        pet.setName(petName);
        pet.setBreed(breed);
        pet.setColor(color);
        pet.setAllergic(allergic);
        pet.setSpatt(spatt);
        pet.setObs(obs);
        pet.setOneOwner(owner);
        
        persisControl.save(owner,pet);
        
        
    }

    public List<Pet> getPets() {
        return persisControl.getPets();
    }

    public void deletePet(int num_customer) {
        persisControl.deletePet(num_customer);
    }

  
       
    public Pet getPet(int num_customer) {
         return persisControl.getPet(num_customer);
        
    }

    public void editPet(Pet pet, String petName, String breed,
            String color, String obs, String allergic, String spatt,
            String ownName, String ownCell) {
        
        pet.setName(petName);
        pet.setBreed(breed);
        pet.setColor(color);
        pet.setAllergic(allergic);
        pet.setSpatt(spatt);
        
        //Edit pet
        persisControl.editPet(pet);
        
        //set new values of the owner
        Owner owner = this.findOwner(pet.getOneOwner().getId_owner());
        owner.setName(ownName);
        owner.setCell(ownCell);
        
        //Call to editOwner
        this.editOwner(owner);
        
        
    }

    private Owner findOwner(int id_owner) {
        return persisControl.getOwner(id_owner);
    }

    private void editOwner(Owner owner) {
        persisControl.editOwner(owner);
    }

   
    }
 

   
    
    

