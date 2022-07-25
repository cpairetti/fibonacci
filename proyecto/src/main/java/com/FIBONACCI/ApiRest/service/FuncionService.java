package com.FIBONACCI.ApiRest.service;

import java.util.List;
import java.util.Optional;

import com.FIBONACCI.ApiRest.entity.FuncionFibonacci;

public interface FuncionService {
	
    public List<FuncionFibonacci> findAll();

    public Optional<FuncionFibonacci>  find(long id);

    public void save(FuncionFibonacci funcion);

    public void deleteById(long id);
}
