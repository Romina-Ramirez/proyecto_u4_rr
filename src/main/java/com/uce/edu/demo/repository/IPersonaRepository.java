package com.uce.edu.demo.repository;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Persona;

public interface IPersonaRepository {

	public void crear(Persona p);

	public Persona leer(Integer id);

	public void actualizar(Persona p);

	public void eliminar(Integer id);

	public List<Persona> leerTodos();

}
