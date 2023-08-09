package bai3;

import bai3.entities.History;
import bai3.entities.Worker;
import bai3.service.HistoryService;
import bai3.service.WorkerService;
import bai3.view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WorkerService workerService = new WorkerService();
        ArrayList<History> histories = new ArrayList<>();
        HistoryService historyService = new HistoryService();

        ArrayList<Worker> workers = new ArrayList<>();
        Menu menu = new Menu();
        do{
            menu.displayMenu();
            System.out.println("Chọn Choose: ");
            try {
                int choose = Integer.parseInt(scanner.nextLine());
                menu.selectMenu();
                switch (choose) {
                    case 1:
                        Worker worker = workerService.createrWorker();
                        workers.add(worker);
                        break;
                    case 2:
                        String choose1 = "T";
                        System.out.println("Nhập id cần tăng lương: ");
                        String id = scanner.nextLine();
                        System.out.println("Nhập số tiền lương tăng: ");
                        double salaryChange = Double.parseDouble(scanner.nextLine());
                        workerService.changeSalary(choose1, id,  salaryChange, workers,histories, historyService);
                        break;
                    case 3:

                        String choose2 = "G";
                        System.out.println("Nhập Id công nhân cần giảm lương: ");
                        String id1 = scanner.nextLine();
                        System.out.println("Nhập số tiền muốn giảm");
                        double salaryDown = Double.parseDouble(scanner.nextLine());
                        workerService.changeSalary(choose2, id1,  salaryDown, workers,histories, historyService);
                        break;
                    case 4:
                        System.out.println("  Display Information salary");
                        historyService.outputHistory(histories);
                    case 5:
                        break;

                }
            }catch (Exception e){
                System.out.println("Try again");
            }

        }while (true);

    }
}



