package com.FIBONACCI.ApiRest.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FIBONACCI.ApiRest.entity.FuncionFibonacci;

public interface FuncionDAO  extends JpaRepository<FuncionFibonacci, Long>{

	
    public List<FuncionFibonacci> findAll();


	
}
