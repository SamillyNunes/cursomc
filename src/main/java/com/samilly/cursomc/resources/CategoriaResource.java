package com.samilly.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.samilly.cursomc.domain.Categoria;

@RestController
@RequestMapping(value="/categorias") //esse value eh o endpoint do endereco do navegador
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET) //Para pegar/recuperar um dado
	public List<Categoria> Listar() {
		
		Categoria cat1 = new Categoria(1,"Informática");
		Categoria cat2 = new Categoria (2, "Escritório");
		
		List<Categoria> lista = new ArrayList<>(); //List eh uma interface
		
		lista.add(cat1);
		lista.add(cat2);
		
		return lista; //retornando no formato JSON
	}

}
