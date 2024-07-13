package com.softli.demo.service.Impl;

import com.softli.demo.models.dao.TareasDAO;
import com.softli.demo.models.entity.Tareas;
import com.softli.demo.service.ITareas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TareasImpl implements ITareas {
    @Autowired
    private TareasDAO tareasDAO;
    @Transactional
    @Override
    public Tareas save(Tareas tareas) {
        return null;
    }

    @Transactional(readOnly = true)
    @Override
    public Tareas findById(Integer id) {
        return null;
    }

    @Transactional
    @Override
    public void delete(Tareas tareas) {

    }
    public List<Tareas> findAll() {
        return null;
    }
}
