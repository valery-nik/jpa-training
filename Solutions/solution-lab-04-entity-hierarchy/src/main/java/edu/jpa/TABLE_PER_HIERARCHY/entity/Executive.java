package edu.jpa.TABLE_PER_HIERARCHY.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Anton German &lt;AGerman@luxoft.com&gt;
 * @version 1.0 15.02.15
 */
@Entity
@DiscriminatorValue("Executive")
public class Executive extends Employee {
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
