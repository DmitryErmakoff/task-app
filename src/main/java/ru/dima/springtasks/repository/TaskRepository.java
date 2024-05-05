package ru.dima.springtasks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dima.springtasks.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
    void deleteById(Long Id);
    Task findTaskById(Long id);
}
