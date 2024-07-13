package com.metaphorce.api.tarea.service;

import com.metaphorce.api.tarea.model.Tarea;
import com.metaphorce.api.tarea.repository.TareaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaService implements ITareaService {
    @Autowired
    private TareaRepository tareaRepository;

    // TODO: Implement methods for CRUD operations

    @Override
    public void addTarea(Tarea tarea) {

        tareaRepository.save(tarea);
    }

    @Override
    public List<Tarea> getTareas() {

        return tareaRepository.findAll();
    }

    @Override
    public Tarea updateStatus(Long id, boolean status) {

        Tarea tarea = tareaRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Tarea no encontrada con el id: " + id));

        tarea.setCompleted(status);

        tareaRepository.save(tarea);

        return tarea;
    }

}
