package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

/**
 * <summary>
 * Implement code according to description of task.
 * </summary>
 */
public class Manager extends Employee{
    private int clientAmount;

    public Manager(String lastName, BigDecimal salary, int clientAmount) {
        super(lastName, salary);
        this.clientAmount = clientAmount;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        BigDecimal b1 = new BigDecimal(500);
        BigDecimal b2 = new BigDecimal(1000);
        super.setBonus(bonus);
        if (clientAmount > 100)
            bonus = bonus.add(b1);
        if (clientAmount > 150)
            bonus = bonus.add(b2);
    }
}
