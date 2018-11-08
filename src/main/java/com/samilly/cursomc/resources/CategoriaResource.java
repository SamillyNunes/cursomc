package com.samilly.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias") //esse value eh o endpoint do endereco do navegador
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET) //Para pegar/recuperar um dado
	public String Listar() {
		return "REST está funcionando";
	}

}
