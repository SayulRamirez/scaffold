package com.metaphorce.api.tarea.controller;


import com.metaphorce.api.tarea.model.Tarea;
import com.metaphorce.api.tarea.service.ITareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping(value = "getAll")
    public ResponseEntity<List<Tarea>> getAll() {

        return ResponseEntity.ok(serviceTarea.getTareas());
    }
}
