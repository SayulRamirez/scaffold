package com.softli.demo.models.dao;

import com.softli.demo.models.entity.Tareas;
import org.springframework.data.repository.CrudRepository;

public interface TareasDAO extends CrudRepository<Tareas,Integer> {
}
