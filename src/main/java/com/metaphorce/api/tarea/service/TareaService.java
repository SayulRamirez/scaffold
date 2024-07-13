package com.metaphorce.api.tarea.service;

import com.metaphorce.api.tarea.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TareaService implements ITareaService {
    @Autowired
    private TareaRepository tareaRepository;

    // TODO: Implement methods for CRUD operations
}
