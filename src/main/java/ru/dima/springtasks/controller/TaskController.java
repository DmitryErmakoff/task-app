package ru.dima.springtasks.controller;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.dima.springtasks.model.Task;
import ru.dima.springtasks.service.TaskService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/tasks")
public class TaskController {

    private final TaskService service;

    @GetMapping
    public List<Task> getAllTasks() {
        return service.getAllTasks();
    }

    @PostMapping("save_task")
    public Task saveTask(@RequestBody Task task) {
        return service.saveTask(task);
    }

    @GetMapping("/{id}")
    public Task findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PutMapping("update_task")
    public Task updateTask(@RequestBody Task task) {
        return service.updateTask(task);
    }

    @DeleteMapping("delete_task/{id}")
    public void deleteTask(@PathVariable Long id) {
        service.deleteTask(id);
    }
}
