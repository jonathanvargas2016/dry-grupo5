package com.dry.service.impl;

import com.dry.entity.Employee;

import java.util.List;

public class EmployeePayrollServiceImpl {

    public void processPayroll(List<Employee> employees, Boolean isAnnualPayroll) {
        for (Employee e : employees) {
            double baseSalary = isAnnualPayroll ? e.getBaseSalary() * 12 : e.getBaseSalary() ;
            double bonus = e.getMonthlyBonus();
            double deductions = e.getMonthlyDeductions();
            double total = baseSalary + bonus - deductions;
        }
    }
}