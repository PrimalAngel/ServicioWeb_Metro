package com.example.MetroV2_1.Repositorio;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.MetroV2_1.DTO.LineaMetro;

@Transactional
public interface ILineaMetro extends CrudRepository<LineaMetro, Integer> {
	
	@Query(value="select * from LineaMetro where NombreLinea = :nombreLinea", nativeQuery = true)
	public LineaMetro findByNombreLinea(String nombreLinea);

	@Query(value="delete * from LineaMetro where NombreLinea = :NombreLinea", nativeQuery = true)
	public LineaMetro deletebyNombre(String NombreLinea);
	
	@Modifying
	@Query(value="update LineaMetro set destino=:destino, horario=:horario, origen=:origen, precio=:precio where nombre_linea=:nombreLinea")
	public void updateLineaMetro(String destino, String horario, String origen, String precio, String nombreLinea);
}
