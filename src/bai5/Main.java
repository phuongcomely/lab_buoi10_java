package bai5;

import bai5.entities.Pet;
import bai5.service.PetService;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PetService petService = new PetService();
        ArrayList<Pet> match = new ArrayList<>();
        Data data = new Data();
        data.createrData;
        Pet owner = petService.createPet();
        petService.match(Data.pets, match, owner);
        if (match.size() != 0) {
            boolean check = true;
            petService.randomPet(match);
            while (check) {
                System.out.println("Bạn có muốn tìm chú pet khác? (Y/N)");
                String choose = scanner.nextLine();
                if (choose.equalsIgnoreCase("Y")) {
                    petService.randomPet(match);
                } else if (choose.equalsIgnoreCase("N")) {
                    check = false;
                } else {
                    System.out.println("Mời chọn lại");
                }
            }
        } else {
            System.out.println("Không tìm thấy pet phù hợp");
        }
    
    }

}
