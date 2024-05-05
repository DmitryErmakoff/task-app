package ru.dima.springtasks.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


@Data
@Entity
@Table(name="task")
public class Task {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private PriorityLevel priority;
    private LocalDate endTime;
    @Transient
    private int daysRemaining;

    public int getDaysRemaining() {
        if (endTime.isBefore(LocalDate.now())) {
            return 0;
        } else {
            return (int) ChronoUnit.DAYS.between(LocalDate.now(), endTime);
        }
    }
}
