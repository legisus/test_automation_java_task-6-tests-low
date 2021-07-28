package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

/**
 * <summary>
 * Implement code according to description of task.
 * </summary>
 */
public class SalesPerson extends Employee{
    private int percent;
    public SalesPerson(String lastName, BigDecimal salary, int percent) {
        super(lastName, salary);
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        super.setBonus(bonus);
//        if(percent > 100)
//            bonus = (bonus).add(bonus);
//        if (percent > 200)
//            bonus = (bonus).add(bonus).add(bonus);
    }
}
