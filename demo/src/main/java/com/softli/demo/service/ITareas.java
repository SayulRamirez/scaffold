package com.softli.demo.service;

import com.softli.demo.models.entity.Tareas;

import java.util.List;

public interface ITareas {

    Tareas save(Tareas tareas);
    Tareas findById(Integer id);
    void delete(Tareas tareas);
    List<Tareas>findAll();
}
