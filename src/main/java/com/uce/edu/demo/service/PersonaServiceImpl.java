package com.uce.edu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IPersonaRepository;
import com.uce.edu.demo.repository.modelo.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	private IPersonaRepository iPersonaJpaRepository;

	@Override
	public void guardar(Persona p) {
		this.iPersonaJpaRepository.crear(p);
	}

	@Override
	public Persona buscarPorId(Integer id) {
		return this.iPersonaJpaRepository.leer(id);
	}

	@Override
	public void actualizar(Persona p) {
		this.iPersonaJpaRepository.actualizar(p);
	}

	@Override
	public void eliminar(Integer id) {
		this.iPersonaJpaRepository.eliminar(id);
	}

	@Override
	public List<Persona> buscarTodos() {
		return this.iPersonaJpaRepository.leerTodos();
	}

}
