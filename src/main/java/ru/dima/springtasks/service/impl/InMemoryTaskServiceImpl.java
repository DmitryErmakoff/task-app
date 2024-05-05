package ru.dima.springtasks.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dima.springtasks.model.Task;
import ru.dima.springtasks.repository.InMemoryTaskDAO;
import ru.dima.springtasks.service.TaskService;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryTaskServiceImpl implements TaskService {
    private final InMemoryTaskDAO repository;

    @Override
    public List<Task> getAllTasks() {
        return repository.getAllTasks();
    }

    @Override
    public Task saveTask(Task task) {
        return repository.saveTask(task);
    }

    @Override
    public Task findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Task updateTask(Task task) {
        return repository.updateTask(task);
    }

    @Override
    public void deleteTask(Long id) {
        repository.deleteTask(id);
    }
}
