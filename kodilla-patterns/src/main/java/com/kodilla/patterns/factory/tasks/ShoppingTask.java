package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task{
    private final String taskName;
    private final String whatToBuy;
    private double quantity;

    public ShoppingTask(final String taskName,final String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public String executeTask() {
        return taskName + whatToBuy + quantity;
    }

    @Override
    public boolean isTaskExecuted() {
        return true;
    }
}
