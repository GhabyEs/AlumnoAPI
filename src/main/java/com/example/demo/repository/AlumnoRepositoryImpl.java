package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Alumno;
@Repository
public class AlumnoRepositoryImpl implements AlumnoRepository {

	private static List<Alumno> alumnos = new ArrayList<>();
	static {
		Alumno alumno =new Alumno();
		alumno.setId(1);
		alumno.setNombre("Gaby");
		alumno.setApellidos("Estrada Martínez");
		alumno.setCarrera("informatica");
		alumno.setEdad(27);
		alumnos.add(alumno);
	}
	
	
	
	@Override
	public Alumno add(Alumno alumno) {
		alumno.setId(alumnos.size()+1);
		alumnos.add(alumno);
		return alumno;
	}

	@Override
	public List<Alumno> findAll() {
		
		return alumnos;
	}

}
