package com.FIBONACCI.ApiRest.controller;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.FIBONACCI.ApiRest.DAO.FuncionDAO;
import com.FIBONACCI.ApiRest.entity.Estadistica;
import com.FIBONACCI.ApiRest.entity.FuncionFibonacci;
import com.FIBONACCI.ApiRest.service.EstadisticaService;
import com.FIBONACCI.ApiRest.service.FuncionService;

@RestController
@RequestMapping("/") 

public class ApiRestController {
	
    @Autowired
    private FuncionService funcionService;
    
    @Autowired
    private EstadisticaService estadisticaService;
	
    @GetMapping("/tamanio/{num}")
    public long calculoFibonacci(@PathVariable long num){



    	Optional<FuncionFibonacci> fibonacci = Optional.ofNullable(new FuncionFibonacci());
    	fibonacci = funcionService.find(num);
    	long result = 0;

    	
    	
    	if(fibonacci.isEmpty()) {
        	result = fibonacci(num);
        	FuncionFibonacci guardar = new FuncionFibonacci(num, result);
        	funcionService.save(guardar);
    	}
    	else {
        	result = fibonacci.get().getResultado();
    	}
    	
    	guardarEstadistica(num,result);

    	
    	return result;
    }
    
    @GetMapping("/estadistica")
    public List<Estadistica> findAll(){
        
        return estadisticaService.findAll();
    }
    
    
    
    
    
    
	public int fibonacci(long n)
	{
	    if (n>1){
	       return fibonacci(n-1) + fibonacci(n-2);  
	    }
	    else if (n==1) {  
	        return 1;
	    }
	    else if (n==0){ 
	        return 0;
	    }
	    else{ 
	        return -1; 
	    }
	} 
    
	public void guardarEstadistica(long tam, long res) {
		
		Optional<Estadistica> estad = Optional.ofNullable(new Estadistica());
		estad = estadisticaService.find(tam);
    	long sum;
		
    	if(estad.isEmpty()) {
        	Estadistica guardar = new Estadistica(tam, res,1);
        	estadisticaService.save(guardar);
    	}
    	else {
        	sum = estad.get().getCantidad() + 1 ;
        	Estadistica guardar = new Estadistica(tam, res,sum);
        	estadisticaService.save(guardar);
    	}
	}
    
}
