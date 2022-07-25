package com.FIBONACCI.ApiRest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FIBONACCI.ApiRest.DAO.FuncionDAO;
import com.FIBONACCI.ApiRest.entity.FuncionFibonacci;

@Service
public class FuncionServiceImpl implements FuncionService {

	@Autowired
	private FuncionDAO funcionDAO;
	
	@Override
	public List<FuncionFibonacci> findAll() {
        List<FuncionFibonacci> listFuncion= funcionDAO.findAll();
        return listFuncion;
	}

	@Override
	public Optional<FuncionFibonacci>  find(long id) {
		Optional<FuncionFibonacci> funcion = funcionDAO.findById(id);
        return funcion;
	}

	@Override
	public void save(FuncionFibonacci funcion) {
		funcionDAO.save(funcion);
		
	}

	@Override
	public void deleteById(long id) {
		funcionDAO.deleteById(id);
		
	}

}
