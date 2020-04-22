package com.example.MetroV2_1.Repositorio;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.example.MetroV2_1.DTO.Usuario;

@Transactional
public interface Iusuario extends CrudRepository<Usuario, Integer>{
	
	@Query(value="delete * from Usuario where NombreUsuario = :Usuario", nativeQuery = true)
	public Usuario deletebyNombre(String usuario);

}
