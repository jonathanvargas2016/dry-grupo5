package com.dry.entity;

public class Employee {

    private double baseSalary;
    private double monthlyBonus;
    private double monthlyDeductions;

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getMonthlyBonus() {
        return monthlyBonus;
    }

    public void setMonthlyBonus(double monthlyBonus) {
        this.monthlyBonus = monthlyBonus;
    }

    public double getMonthlyDeductions() {
        return monthlyDeductions;
    }

    public void setMonthlyDeductions(double monthlyDeductions) {
        this.monthlyDeductions = monthlyDeductions;
    }
}
