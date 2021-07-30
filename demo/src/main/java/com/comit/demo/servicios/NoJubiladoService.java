package com.comit.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comit.demo.modelo.NoJubilado;
import com.comit.demo.repository.NoJubiladoRepository;

@Service
public class NoJubiladoService {
	private final NoJubiladoRepository noJubiladoRepository;
	
	@Autowired
	public NoJubiladoService(NoJubiladoRepository noJubiladoRepository) {
		this.noJubiladoRepository =noJubiladoRepository;
	}

	public NoJubilado guardar(NoJubilado nojubilado) {
		nojubilado = noJubiladoRepository.save(nojubilado);
		return nojubilado;
	}

	public NoJubilado findOneByEmailAndNroSeguridad(String email, Long nroSeguridad) {
		return noJubiladoRepository.findOneByEmailAndNroSeguridad(email, nroSeguridad);
		
	}

}
