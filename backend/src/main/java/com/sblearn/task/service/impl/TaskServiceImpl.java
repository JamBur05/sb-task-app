package com.sblearn.task.service.impl;

import com.sblearn.task.domain.CreateTaskRequest;
import com.sblearn.task.domain.entity.Task;
import com.sblearn.task.domain.entity.TaskPriority;
import com.sblearn.task.domain.entity.TaskStatus;
import com.sblearn.task.repository.TaskRepository;
import com.sblearn.task.service.TaskService;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createTask(CreateTaskRequest request) {
        Instant now = Instant.now();
        Task task = new Task(
                null, // Hibernate generates the id automatically
                request.title(),
                request.description(),
                request.dueDate(),
                TaskStatus.OPEN,
                request.priority(),
                now,
                now

        );

        return taskRepository.save(task);
    }
}
