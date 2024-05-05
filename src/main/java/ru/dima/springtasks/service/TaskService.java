package ru.dima.springtasks.service;

import org.springframework.stereotype.Service;
import ru.dima.springtasks.model.Task;

import java.util.List;

@Service
public interface TaskService {
    List<Task> getAllTasks();
    Task saveTask(Task task);
    Task findById(Long id);
    Task updateTask(Task task);
    void deleteTask(Long id);
}
