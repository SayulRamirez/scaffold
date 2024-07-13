package com.metaphorce.api.tarea.controller;


import com.metaphorce.api.tarea.service.ITareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-tareas")
public class TareaController {
    @Autowired
    ITareaService serviceTarea;
    // TODO: Implement REST endpoints for CRUD operations
}
