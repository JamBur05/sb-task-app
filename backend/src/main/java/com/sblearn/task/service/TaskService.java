package com.sblearn.task.service;

import com.sblearn.task.domain.CreateTaskRequest;
import com.sblearn.task.domain.entity.Task;

public interface TaskService {

    Task createTask(CreateTaskRequest request);
}
