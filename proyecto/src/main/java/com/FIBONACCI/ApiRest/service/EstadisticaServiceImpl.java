package com.FIBONACCI.ApiRest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FIBONACCI.ApiRest.DAO.EstadisticaDAO;
import com.FIBONACCI.ApiRest.entity.Estadistica;


@Service
public class EstadisticaServiceImpl implements EstadisticaService {

	@Autowired
	private EstadisticaDAO estadisticaDAO;
	
	@Override
	public List<Estadistica> findAll() {
        List<Estadistica> listEstadistica= estadisticaDAO.findAll();
        return listEstadistica;
	}

	@Override
	public Optional<Estadistica> find(long id) {
		Optional<Estadistica> estadistica = estadisticaDAO.findById(id);
        return estadistica;
	}

	@Override
	public void save(Estadistica estadistica) {
		estadisticaDAO.save(estadistica);
		
	}

	@Override
	public void deleteById(long id) {
		estadisticaDAO.deleteById(id);
		
	}

}
