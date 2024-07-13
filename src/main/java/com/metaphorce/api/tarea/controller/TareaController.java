package com.metaphorce.api.tarea.controller;


import com.metaphorce.api.tarea.model.Tarea;
import com.metaphorce.api.tarea.service.ITareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-tareas")
public class TareaController {
    @Autowired
    ITareaService serviceTarea;
    // TODO: Implement REST endpoints for CRUD operations

    @PostMapping(value = "add")
    public ResponseEntity<Void> addTarea(@RequestBody Tarea tarea) {
        serviceTarea.addTarea(tarea);

        return ResponseEntity.ok().build();
    }
}
