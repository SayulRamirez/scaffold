package com.metaphorce.api.tarea.service;

import com.metaphorce.api.tarea.model.Tarea;

import java.util.List;

public interface ITareaService {

    void addTarea(Tarea tarea);

    List<Tarea> getTareas();

    Tarea updateStatus(Long id, boolean status);
}
