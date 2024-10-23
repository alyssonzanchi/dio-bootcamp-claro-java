package com.dio.todo.service;

import com.dio.todo.exceptions.ResourceNotFoundException;
import com.dio.todo.model.Task;
import com.dio.todo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTaskById(int id) {
        return taskRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Task not found"));
    }

    public List<Task> getTasksByStatus(String status) {
        return taskRepository.findByStatus(status);
    }

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public Task updateTask(int id, Task updatedTask) {
        Task task = getTaskById(id);
        task.setTitle(updatedTask.getTitle());
        task.setDescription(updatedTask.getDescription());
        task.setDeadline(updatedTask.getDeadline());
        task.setStatus(updatedTask.getStatus());
        return taskRepository.save(task);
    }

    public void deleteTask(int id) {
        taskRepository.deleteById(id);
    }
}
