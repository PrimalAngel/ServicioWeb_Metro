package com.example.MetroV2_1.Repositorio;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.example.MetroV2_1.DTO.Usuario;

@Transactional
public interface Iusuario extends CrudRepository<Usuario, Integer>{
	
	@Query(value="delete * from Usuario where NombreUsuario = :NombreUsuario", nativeQuery = true)
	public Usuario deletebyNombre(String NombreUsuario);

	@Query(value="select * from Usuario where NombreUsuario = :nomUser", nativeQuery = true)
	public Usuario findByUser(String nomUser);
	
	@Modifying
	@Query(value="update Usuario set Correo=:correo, Fecha_de_Nacimiento=:fechaDeNacimiento, metodo_pago=:metPago, numero_tarjeta=:numTarjeta where nombre_usuario=:NomUsuario")
	public void updateUser(String correo, String fechaDeNacimiento, String metPago, String numTarjeta, String NomUsuario );
}
