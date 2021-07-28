package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

/**
 * <summary>
 * Implement code according to description of task.
 * </summary>
 */
public class Employee {
    private String lastName;
    private BigDecimal salary;
    private BigDecimal bonus;


    public Employee(String lastName, BigDecimal salary) {
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
        if (salary.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException();
        }
        if (salary == null){
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
        if (bonus.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException();
        }
        if (bonus == null){
            throw new IllegalArgumentException();
        }
    }

    public BigDecimal toPay(){
        BigDecimal value = new BigDecimal(0);
        value.add(salary);
        value.add(bonus);
        return value;
    }


}

