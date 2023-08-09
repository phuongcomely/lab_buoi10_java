package bai3.service;

import bai3.entities.History;
import bai3.entities.Worker;

import java.util.ArrayList;


    public class HistoryService {
        public History createrHistory(Worker worker, String status){
            return  new History(worker, status);

        }
        public void addListHistory(Worker worker, String status, ArrayList<History> histories){
            History history = createrHistory(worker, status);
            histories.add(history);
        }
        public  void outputHistory(ArrayList<History> histories){
            System.out.println(" code   Name    Age     Salary     Status      Date");
            for (History history: histories){
                history.getWorker().getId();
                history.getWorker().getName();
                history.getWorker().getSalary();
                history.getStatus();
                history.getUpDated();
            }
        }
}
