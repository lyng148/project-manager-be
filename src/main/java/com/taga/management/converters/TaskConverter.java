package com.taga.management.converters;

import com.taga.management.DTOs.request.TaskInputDTO;
import com.taga.management.models.Task;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaskConverter {

    @Autowired
    private ModelMapper modelMapper;

    public Task convertToTask(TaskInputDTO taskDTO) {
        Task task = modelMapper.map(taskDTO, Task.class);
        return task;
    }
}