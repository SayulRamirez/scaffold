package com.metaphorce.api.tarea.service;

import com.metaphorce.api.tarea.model.Tarea;
import com.metaphorce.api.tarea.repository.TareaRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TareaServiceTest {
    @Mock
    private TareaRepository tareaRepository;

    private TareaService underTest;

    @Test
    void addTarea() {
        // Dado
        Tarea tarea = new Tarea(null, "Tarea", false);

        // Cuando
        underTest.addTarea(tarea);

        // Entonces
        ArgumentCaptor<Tarea> tareaArgumentCaptor = ArgumentCaptor.forClass(Tarea.class);
        verify(tareaRepository).save(tareaArgumentCaptor.capture());
        Tarea capturedTarea = tareaArgumentCaptor.getValue();

        assertEquals(tarea, capturedTarea);
    }

    @Test
    void getTareas() {
        // Dado
        Tarea tarea1 = new Tarea(null, "Tarea 1", false);
        Tarea tarea2 = new Tarea(null, "Tarea 2", true);

        List<Tarea> tareas = List.of(tarea1, tarea2);
        when(tareaRepository.findAll()).thenReturn(tareas);

        // Cuando
        List<Tarea> result = underTest.getTareas();

        // Entonces
        verify(tareaRepository, times(2)).findAll();
        assertEquals(tareas, result);
    }
}
