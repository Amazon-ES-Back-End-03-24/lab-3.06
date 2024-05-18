package org.ironhack.lab306.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.util.Date;
import java.util.Objects;

@Entity
// al ser single table no hace falta @Table(name = "billable_tasks")
@PrimaryKeyJoinColumn(name = "id")
public class BillableTask extends Task {
    private int hourlyRate;

    public BillableTask(int id, String title, Date dueDate, boolean status, int hourlyRate) {
        super(id, title, dueDate, status);
        this.hourlyRate = hourlyRate;
    }

    public BillableTask() {
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BillableTask that = (BillableTask) o;
        return hourlyRate == that.hourlyRate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hourlyRate);
    }
}
