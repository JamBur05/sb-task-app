package com.sblearn.task.mapper;

import com.sblearn.task.domain.CreateTaskRequest;
import com.sblearn.task.domain.dto.TaskDto;
import com.sblearn.task.domain.entity.Task;

public interface TaskMapper {

    CreateTaskRequest fromDto(CreateTaskRequest dto);

    TaskDto toDto(Task task);
}
