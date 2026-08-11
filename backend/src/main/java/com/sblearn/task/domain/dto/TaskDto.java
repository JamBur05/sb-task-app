package com.sblearn.task.domain.dto;

import com.sblearn.task.domain.entity.TaskPriority;
import com.sblearn.task.domain.entity.TaskStatus;

import java.time.LocalDate;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDate dueDate,
        TaskPriority priority,
        TaskStatus status
) {
}
