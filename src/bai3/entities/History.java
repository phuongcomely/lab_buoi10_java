package bai3.entities;

import java.time.LocalDate;

public class History {
    private Worker worker;
    private String status;
    private LocalDate upDated;

    public History(Worker worker, String status) {
        this.worker = worker;
        this.status = status;
        this.upDated = LocalDate.now();
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker sworker) {
        this.worker = sworker;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getUpDated() {
        return upDated;
    }

    public void setUpDated(LocalDate upDated) {
        this.upDated = upDated;
    }

    @Override
    public String toString() {
        return "History{" +
                "sworker=" + worker +
                ", status='" + status + '\'' +
                ", upDated=" + upDated +
                '}';
    }
}
