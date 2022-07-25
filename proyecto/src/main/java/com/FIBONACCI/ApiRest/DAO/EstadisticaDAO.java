package com.FIBONACCI.ApiRest.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FIBONACCI.ApiRest.entity.Estadistica;
import com.FIBONACCI.ApiRest.entity.FuncionFibonacci;

public interface EstadisticaDAO extends JpaRepository<Estadistica, Long>{
	
    public List<Estadistica> findAll();


}
