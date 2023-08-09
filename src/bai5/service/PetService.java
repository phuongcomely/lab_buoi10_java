package bai5.service;

import bai5.entities.Pet;
import bai5.entities.Type;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PetService {
    public String inputName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên cho pet của bạn:");
        return scanner.nextLine();
    }
    public String inputSpecies(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giống loại cho pet của bạn:");
        return scanner.nextLine();
    }
    public int inputAge(){
        while (true){
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhập tuổi của pet: ");
                return Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                System.out.println("Lỗi!");
            }
        }
    }
    public String inputSex(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {

                System.out.println("Nhập giới tính cho pet của bạn (1: MALE, 2: FEMALE)");
                int sex = Integer.parseInt(scanner.nextLine());
                if (sex == 1) {
                    return "Male";

                }
                else if (sex == 2) {
                    return "Female";

                }else {
                    System.out.println("Mời nhập lại");
                }
            }catch (Exception e){
                System.out.println("Dữ liệu không hợp lệ");
            }
        }
    }
    public String inputDescription(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mô tả cho pet của bạn");
        return scanner.nextLine();
    }
    public Type inputType(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {

                System.out.println("Chọn loại cho pet của bạn (1: DOG, 2: CAT):");
                int type = Integer.parseInt(scanner.nextLine());
                if (type == 1){
                    return Type.DOG;
                } else if (type == 2) {
                    return Type.CAT;
                }else {
                    System.out.println("Mời nhập lại");
                }
            }catch (Exception e){
                System.out.println("Dữ liệu không hợp lệ");
            }
        }
    }
    public String inputImage(){
        return "image.png";
    }
    public Pet createPet(){
        return new Pet(inputName(), inputSpecies(), inputAge(), inputSex(), inputDescription(), inputType(), inputImage());
    }
    public void match(ArrayList<Pet> pets, ArrayList<Pet> matchPet, Pet userPet){
        for (Pet pet : pets ) {
            if (pet.getType() == userPet.getType() && pet.getSex() != userPet.getSex()){
                matchPet.add(pet);
            }
        }
    }
    public void randomPet(ArrayList<Pet> matchPet){
        Random rand = new Random();
        System.out.println(matchPet.get(rand.nextInt(matchPet.size())));
    }
}
