package bai5.data;

import bai5.entities.Pet;
import bai5.entities.Type;

import java.util.ArrayList;

public class Data {
    public static ArrayList<Pet> pets = new ArrayList<>();
    public void createrData(){
        pets.add(new Pet("A", "Bull", 1, "MALE", "Very playful", Type.DOG, "image1.jpg"));
        pets.add(new Pet("B", "Beagle", 2, "FEMALE", "Friendly with kids", Type.DOG, "image2.jpg"));
        pets.add(new Pet("C", "Poodle", 3, "MALE", "Quiet and calm", Type.CAT, "image3.jpg"));
        pets.add(new Pet("D", "Maine", 4, "MALE", "Active and energetic", Type.DOG, "image4.jpg"));
        pets.add(new Pet("E", "Ragdoll", 3, "FEMALE", "Independent", Type.CAT, "image5.jpg"));
    }

}
