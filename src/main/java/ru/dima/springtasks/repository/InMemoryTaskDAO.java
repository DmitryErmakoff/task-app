package ru.dima.springtasks.repository;

import org.springframework.stereotype.Repository;
import ru.dima.springtasks.model.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryTaskDAO {
    private final List<Task> TASKS = new ArrayList<>();

    public List<Task> getAllTasks() {
        return TASKS;
    }

    public Task saveTask(Task task) {
        TASKS.add(task);
        return task;
    }

    public Task findById(Long id) {
        return TASKS.stream().
                filter(task -> task.getId().equals(id)).
                findFirst().orElse(null);
    }

    public Task updateTask(Task task) {
        var taskIndex = IntStream.range(0, TASKS.size())
                .filter(index -> TASKS.get(index).getId().equals(task.getId()))
                .findFirst().orElse(-1);
        if (taskIndex != -1) {
            TASKS.set(taskIndex, task);
            return task;
        }
        return null;
    }

    public void deleteTask(Long id) {
        var task = findById(id);
        if (task != null) {
            TASKS.remove(task);
        }
    }
}
