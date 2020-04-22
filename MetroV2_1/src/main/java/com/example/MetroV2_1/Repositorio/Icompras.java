package com.example.MetroV2_1.Repositorio;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.MetroV2_1.DTO.Compras;


@Transactional
public interface Icompras extends CrudRepository<Compras, Integer>{
	
	@Query(value="select * from Compras where compra = :compra", nativeQuery = true)
	public Compras findByCompra(String compra);
	
	@Query(value="update Compras set fecha=:fecha, nombreLinea=:nombreLinea, origen=:origen,precio=:precio,typePago=:typePago,typeVagon=:typeVagon,usuario=:usuario where compra=:compra")
	public Compras updateCompra(String compra,String fecha,String nombreLinea,String origen, String precio,String typePago, String typeVagon, String usuario);

}
