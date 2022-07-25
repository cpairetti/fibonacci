package com.FIBONACCI.ApiRest.service;

import java.util.List;
import java.util.Optional;

import com.FIBONACCI.ApiRest.entity.Estadistica;

public interface EstadisticaService {
    public List<Estadistica> findAll();

    public Optional<Estadistica> find(long id);

    public void save(Estadistica estadistica);

    public void deleteById(long id);


}
