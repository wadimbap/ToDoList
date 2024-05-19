package com.example.application.model;

import com.example.application.entity.TaskEntity;
import lombok.Data;

/**
 * Модель задачи, используемая для представления задачи в системе.
 */
@Data
public class Task {
    private Long id;
    private String title;
    private Boolean completed;
    private String description;

    public static Task toModel(TaskEntity entity) {
        Task model = new Task();
        model.setId(entity.getId());
        model.setTitle(entity.getTitle());
        model.setCompleted(entity.getCompleted());
        return model;
    }
}