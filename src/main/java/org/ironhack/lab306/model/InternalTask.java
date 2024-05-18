package org.ironhack.lab306.model;


import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.util.Date;

@Entity
// al ser single table no hace falta @Table(name = "internal_tasks")
@PrimaryKeyJoinColumn(name = "id")
public class InternalTask extends Task {

    public InternalTask(int id, String title, Date dueDate, boolean status) {
        super(id, title, dueDate, status);
    }

    public InternalTask() {
    }
}
