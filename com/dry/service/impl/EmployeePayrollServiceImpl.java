package com.dry.service.impl;

import com.dry.entity.Employee;

import java.util.List;

public class EmployeePayrollServiceImpl {

    public void processPayroll(List<Employee> employees, boolean isAnnualPayroll) {
        for (Employee e : employees) {
            double baseSalary = isAnnualPayroll ? e.getBaseSalary() * 12 : e.getBaseSalary() ;
            double bonus = isAnnualPayroll ? e.getAnnualBonus() : e.getMonthlyBonus();
            double deductions = isAnnualPayroll ? e.getAnnualDeductions() : e.getMonthlyDeductions();
            double total = baseSalary + bonus - deductions;
        }
    }
}