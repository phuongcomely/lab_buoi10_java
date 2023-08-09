package bai3.service;

import bai3.entities.History;
import bai3.entities.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkerService {
    public  String inputName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên: ");
        return scanner.nextLine();
    }

    public int inputAge(){
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Mời bạn nhập tuổi");
            try{
                int age = Integer.parseInt(scanner.nextLine());
                if (age <=0){
                    System.out.println("Tuổi công nhân không hợp lệ!");

                }else{
                    return age;
                }

            }catch(Exception e){
                System.out.println("lỗi! Nhập lại");
            }
        }while (true);

    }
    public double inputSalary(){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập lương công nhân:  ");


            try {
                double salary = Double.parseDouble(scanner.nextLine());
                if(salary<0){
                    System.out.println("Lương phải lớn hơn hoặc bằng 0.");

                }else {
                    return salary;
                }
            } catch (Exception e) {
                System.out.println("Lỗi! Nhập lại");
            }
        }while(true);

    }
    public String inputWorkPlace(){
        System.out.println("Nhập vị trí làm việc: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public Worker createrWorker(){
        return new Worker(inputName(), inputAge(), inputSalary(), inputWorkPlace());
    }

    public Worker findById(String id, ArrayList<Worker> workers){
        for(Worker worker : workers){
            if(worker.getId().equalsIgnoreCase(id)){
                return worker;
            }
            break;
        }
        return  null;
    }
    public  void  changeSalary(String choose, String id, double salaryChange, ArrayList<Worker> workers, ArrayList<History> histories, HistoryService historyService){
        Worker worker = findById(id, workers);
        if(choose == "T" ){
            worker.setSalary(worker.getSalary()+salaryChange);
            historyService.addListHistory(worker, "Up", histories );

        }else {
            worker.setSalary(worker.getSalary()-salaryChange);
            historyService.addListHistory(worker, "Down", histories);
        }
    }

}
