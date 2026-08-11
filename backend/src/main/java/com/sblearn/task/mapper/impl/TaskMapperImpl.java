package com.sblearn.task.mapper.impl;

import com.sblearn.task.domain.CreateTaskRequest;
import com.sblearn.task.domain.dto.TaskDto;
import com.sblearn.task.domain.entity.Task;
import com.sblearn.task.mapper.TaskMapper;
import org.springframework.stereotype.Component;

@Component
public class TaskMapperImpl implements TaskMapper {
    @Override
    public CreateTaskRequest fromDto(CreateTaskRequest dto) {
        return new CreateTaskRequest(
                dto.title(),
                dto.description(),
                dto.dueDate(),
                dto.priority()
        );
    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(
          task.getId(),
          task.getTitle(),
          task.getDescription(),
          task.getDueDate(),
          task.getPriority(),
          task.getStatus()
        );
    }
}
