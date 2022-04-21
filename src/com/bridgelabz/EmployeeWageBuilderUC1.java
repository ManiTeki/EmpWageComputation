package com.bridgelabz;


import java.util.Random;

public class EmployeeWageBuilderUC1 {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;
        int empHours = 0;
        int empWage = 0;
        Random random = new Random();
        int empCheck = random.nextInt(2);
        if(empCheck == IS_FULL_TIME){
            empHours = 8;
        }
        else{
            empHours = 0;
        }
        empWage = empHours * EMP_RATE_PER_HOUR;
        System.out.println("the daily wage of employee is : " + empWage);
    }
}
