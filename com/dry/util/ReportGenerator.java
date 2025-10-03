package com.dry.util;

import java.util.List;

public class ReportGenerator {

    private <T extends Number> void generateReport(String title, String label, List<T> items) {
        System.out.println("Report: " + title);

        double sum = 0;
        for (int i = 0; i < items.size(); i++) {
            System.out.println(label + " #" + (i + 1) + ": " + items.get(i));
            sum += items.get(i).doubleValue();
        }

        double avg = items.isEmpty() ? 0 : sum / items.size();
        System.out.println("Total " + label + "s: " + sum);
        System.out.println("Average " + label + ": " + avg);
    }


    public void generateReport(String title, List<Double> sales) {
        generateReport(title,"Sale", sales);
    }
    public void generateInventoryReport(String title, List<Integer> inventory) {
        generateReport(title,"Items", inventory);

    }
}