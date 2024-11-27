package com.example.concurrency.task;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;

public class EvenNumTask extends Task<ObservableList<Integer>> {

    private final int lowerLimit;
    private final int upperLimit;
    private final long sleepMillis;

    public EvenNumTask(int lowerLimit, int upperLimit, long sleepMillis) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
        this.sleepMillis = sleepMillis;
    }

    @Override
    protected ObservableList<Integer> call() throws Exception {
        ObservableList<Integer> results = FXCollections.observableArrayList();
        this.updateTitle("Even Number Finder Task");
        int totalWork = this.upperLimit - this.lowerLimit + 1;
        int workDone = 0;

        for (int i = lowerLimit; i <= upperLimit; i++) {
            if (this.isCancelled()) {
                break;
            }
            workDone++;
            this.updateMessage("Checking if " + i + " is an even number.");
            try {
                Thread.sleep(this.sleepMillis);
            } catch (InterruptedException e) {
                if (this.isCancelled()) {
                    break;
                }
            }
            if (EvenNumUtil.isEven(i)) {
                results.add(i);
                this.updateValue(FXCollections.observableArrayList(results));
            }
            this.updateProgress(workDone, totalWork);
        }
        return results;
    }

    @Override
    protected void cancelled() {
        super.cancelled();
        this.updateMessage("Task was cancelled");
    }

    @Override
    protected void failed() {
        super.failed();
        this.updateMessage("Task Failed");
    }

    @Override
    protected void succeeded() {
        super.succeeded();
        this.updateMessage("Task Succeeded");
    }
}
