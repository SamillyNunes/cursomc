package com.samilly.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samilly.cursomc.domain.Categoria;
import com.samilly.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired // Essa anotacao serve para instanciar uma dependencia automaticamente
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	
}
