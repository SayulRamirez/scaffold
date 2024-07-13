package com.softli.demo.controller;


import com.softli.demo.models.entity.Tareas;
import com.softli.demo.service.ITareas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("api/v1")
public class TareasController {

    @Autowired
    private ITareas tareasService;

    @PostMapping("tarea")
    public Tareas create (@RequestBody Tareas tareas){
        return tareasService.save(tareas);
    }

    @PutMapping("tarea")
    public Tareas update(@RequestBody Tareas tareas){
        return tareasService.save(tareas);
    }

    @DeleteMapping("tareas/{id}")
    public void delete(@PathVariable Integer id){
        Tareas tareasDelete = tareasService.findById(id);
        tareasService.delete(tareasDelete);
    }
    @GetMapping("tareas/{id}")
    public Tareas showById(@PathVariable Integer id){
        return  tareasService.findById(id);
    }
    @GetMapping("/tareas")
    public List<Tareas> findAll() {
        List<Tareas> tareasList = tareasService.findAll();
        return tareasList;
    }
    }

