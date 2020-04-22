package com.example.MetroV2_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.MetroV2_1.DTO.Compras;
import com.example.MetroV2_1.DTO.LineaMetro;
import com.example.MetroV2_1.DTO.Usuario;
import com.example.MetroV2_1.Repositorio.ILineaMetro;
import com.example.MetroV2_1.Repositorio.Icompras;
import com.example.MetroV2_1.Repositorio.Iusuario;

import me.uvmetro.metrov2_1.ActualizarCompraRequest;
import me.uvmetro.metrov2_1.ActualizarCompraResponse;
import me.uvmetro.metrov2_1.ActualizarLineaMetroRequest;
import me.uvmetro.metrov2_1.ActualizarLineaMetroResponse;
import me.uvmetro.metrov2_1.ActualizarUsuarioRequest;
import me.uvmetro.metrov2_1.ActualizarUsuarioResponse;
import me.uvmetro.metrov2_1.CancelarCompraRequest;
import me.uvmetro.metrov2_1.CancelarCompraResponse;
import me.uvmetro.metrov2_1.CompraRequest;
import me.uvmetro.metrov2_1.CompraResponse;
import me.uvmetro.metrov2_1.EliminarLineaMetroRequest;
import me.uvmetro.metrov2_1.EliminarLineaMetroResponse;
import me.uvmetro.metrov2_1.EliminarUsuarioRequest;
import me.uvmetro.metrov2_1.EliminarUsuarioResponse;
import me.uvmetro.metrov2_1.LineasMetroRequest;
import me.uvmetro.metrov2_1.LineasMetroResponse;
import me.uvmetro.metrov2_1.MostrarCompraRequest;
import me.uvmetro.metrov2_1.MostrarCompraResponse;
import me.uvmetro.metrov2_1.MostrarLineaMetroRequest;
import me.uvmetro.metrov2_1.MostrarLineaMetroResponse;
import me.uvmetro.metrov2_1.UsuarioRequest;
import me.uvmetro.metrov2_1.UsuarioResponse;

@Endpoint
public class EndPoint {
	
	@Autowired
	Icompras objICompra;
	Iusuario objIusuario;
	ILineaMetro objIMetro;
	
	@PayloadRoot(localPart="CompraRequest", namespace="http://www.uvMetro.me/MetroV2_1")
	@ResponsePayload
	public CompraResponse getCompraExitosa(@RequestPayload CompraRequest peticion) {
		CompraResponse respuesta=new CompraResponse();
		respuesta.setCompra("Compra = "+peticion.getCompra());
		respuesta.setUsuario("Usuario = "+peticion.getUsuario());
		respuesta.setFecha("Fecha = "+peticion.getFecha());
		respuesta.setOrigen("Origen = "+peticion.getOrigen());
		respuesta.setNombreLinea("Linea = "+peticion.getNombreLinea());
		respuesta.setTypeVagon("Vagon = "+peticion.getTypeVagon());
		respuesta.setPrecio("Precio = "+peticion.getPrecio());
		respuesta.setTypePago("Tipo de pago = "+peticion.getTypePago());
		
		Compras objCompra= new Compras();
		objCompra.setCompra(peticion.getCompra());
		objCompra.setUsuario(peticion.getUsuario());
		objCompra.setFecha(peticion.getFecha());
		objCompra.setOrigen(peticion.getOrigen());
		objCompra.setNombreLinea(peticion.getNombreLinea());
		objCompra.setTypeVagon(peticion.getTypeVagon());
		objCompra.setPrecio(peticion.getPrecio());
		objCompra.setTypePago(peticion.getTypePago());
		
		objICompra.save(objCompra);
		
		return respuesta;
	}
	
	@PayloadRoot(localPart="ActualizarCompraRequest", namespace="http://www.uvMetro.me/MetroV2_1")
	@ResponsePayload
	public ActualizarCompraResponse getActualizarCompraExitosa(@RequestPayload ActualizarCompraRequest peticion) {
		ActualizarCompraResponse respuestaActualizar=new ActualizarCompraResponse();
		Compras objCompra= new Compras();
		
		objCompra=objICompra.findByCompra(peticion.getCompra());
		if(objCompra == null) {
			respuestaActualizar.setRespuesta("La compra no existe "+peticion.getCompra());
		}else {
			objCompra.setCompra(peticion.getCompra());
			objCompra.setUsuario(peticion.getUsuario());
			objCompra.setFecha(peticion.getFecha());
			objCompra.setOrigen(peticion.getOrigen());
			objCompra.setNombreLinea(peticion.getNombreLinea());
			objCompra.setTypeVagon(peticion.getTypeVagon());
			objCompra.setPrecio(peticion.getPrecio());
			objCompra.setTypePago(peticion.getTypePago());
			
			objICompra.updateCompra(peticion.getCompra(), peticion.getFecha(), peticion.getNombreLinea(), peticion.getOrigen(), peticion.getPrecio(), peticion.getTypePago(), peticion.getTypeVagon(), peticion.getUsuario());
			
			respuestaActualizar.setRespuesta("Compra con id: "+peticion.getCompra()+" fue Actualizada con exito");
		}	
		
		return respuestaActualizar;
	}
	
	@PayloadRoot(localPart="CancelarCompraRequest", namespace="http://www.uvMetro.me/MetroV2_1")
	@ResponsePayload
	public CancelarCompraResponse getCancelarCompraExitosa(@RequestPayload CancelarCompraRequest peticion) {
		CancelarCompraResponse respuestaCancelar=new CancelarCompraResponse();
		Compras objCompra= new Compras();
		objCompra=objICompra.findByCompra(peticion.getCancelación());
		objICompra.delete(objCompra);
		respuestaCancelar.setRespuesta("Compra con id: "+peticion.getCancelación()+" Fue cancelada");
		return respuestaCancelar;
	}
	
	@PayloadRoot(localPart="MostrarCompraRequest", namespace="http://www.uvMetro.me/MetroV2_1")
	@ResponsePayload
	public MostrarCompraResponse getCompraExitosa(@RequestPayload MostrarCompraRequest peticion) {
		MostrarCompraResponse respuesta=new MostrarCompraResponse();
		Compras objCompra= new Compras();
		objCompra=objICompra.findByCompra(peticion.getCompra());
		if(objCompra.equals(null)) {
			respuesta.setCompra("Compra no localizada o inexistente");
		}else {
			respuesta.setCompra("ID Compra: "+peticion.getCompra());
			respuesta.setUsuario("Usuario: "+objCompra.getUsuario());
			respuesta.setNombreLinea("Linea De Metro: "+objCompra.getNombreLinea());
			respuesta.setOrigen("Origen: "+objCompra.getOrigen());
			respuesta.setFecha("Fecha: "+objCompra.getFecha());
			respuesta.setPrecio("Precio: "+objCompra.getPrecio());
			respuesta.setTypePago("Pago: "+objCompra.getTypePago());
			respuesta.setTypeVagon("Tipo de vagon: "+objCompra.getTypeVagon());
		}
		
		return respuesta;
	}
	
	@PayloadRoot(localPart="UsuarioRequest", namespace="http://www.uvMetro.me/MetroV2_1")
	@ResponsePayload
	public UsuarioResponse getUsuarioExitoso(@RequestPayload UsuarioRequest peticion) {
		UsuarioResponse respuesta=new UsuarioResponse();
		Usuario objUsuario=new Usuario();
		objUsuario.setNombreUsuario(peticion.getNombreUsuario());
		objUsuario.setFechaDeNacimiento(peticion.getFechaDeNacimiento());
		objUsuario.setCorreo(peticion.getCorreo());
		objUsuario.setMetodoPago(peticion.getMetodoPago());
		objUsuario.setNumeroTarjeta(peticion.getNumeroTarjeta());
		objIusuario.save(objUsuario);
		respuesta.setRespuesta("Usuario: "+peticion.getNombreUsuario()+" Agregado con exito");
		return respuesta;
	}
	
	@PayloadRoot(localPart="ActualizarUsuarioRequest", namespace="http://www.uvMetro.me/MetroV2_1")
	@ResponsePayload
	public ActualizarUsuarioResponse getCompraExitosa(@RequestPayload ActualizarUsuarioRequest peticion) {
		ActualizarUsuarioResponse respuesta=new ActualizarUsuarioResponse();
		respuesta.setRespuesta("Usuario: "+peticion.getNombreUsuario()+" Actualizado Correctamente");
		return respuesta;
	}
	
	@PayloadRoot(localPart="EliminarUsuarioRequest", namespace="http://www.uvMetro.me/MetroV2_1")
	@ResponsePayload
	public EliminarUsuarioResponse getCompraExitosa(@RequestPayload EliminarUsuarioRequest peticion) {
		EliminarUsuarioResponse respuesta=new EliminarUsuarioResponse();
		objIusuario.deletebyNombre(peticion.getIdUsuario());
		
		respuesta.setRespuesta("Usuario: "+peticion.getIdUsuario()+" eliminado correctamente");
		return respuesta;
	}
	
	@PayloadRoot(localPart="LineasMetroRequest", namespace="http://www.uvMetro.me/MetroV2_1")
	@ResponsePayload
	public LineasMetroResponse getCompraExitosa(@RequestPayload LineasMetroRequest peticion) {
		LineasMetroResponse respuesta=new LineasMetroResponse();
		LineaMetro objMetro=new LineaMetro();
		
		objMetro.setNombreLinea(peticion.getNombreLinea());
		objMetro.setHorario(peticion.getHorario());
		objMetro.setOrigen(peticion.getOrigen());
		objMetro.setDestino(peticion.getOrigen());
		objMetro.setPrecio(peticion.getPrecio());
		
		objIMetro.save(objMetro);
		
		respuesta.setRespuesta("Linea de Metro: "+peticion.getNombreLinea()+" Se guardo correctamente");
		return respuesta;
	}
	
	@PayloadRoot(localPart="ActualizarLineaMetroResponse", namespace="http://www.uvMetro.me/MetroV2_1")
	@ResponsePayload
	public ActualizarLineaMetroResponse getCompraExitosa(@RequestPayload ActualizarLineaMetroRequest peticion) {
		ActualizarLineaMetroResponse respuesta=new ActualizarLineaMetroResponse();
		respuesta.setRespuesta("Linea del metro: "+peticion.getNombreLinea()+" actualizada correctamente");
		return respuesta;
	}
	
	@PayloadRoot(localPart="EliminarLineaMetroRequest", namespace="http://www.uvMetro.me/MetroV2_1")
	@ResponsePayload
	public EliminarLineaMetroResponse getCompraExitosa(@RequestPayload EliminarLineaMetroRequest peticion) {
		EliminarLineaMetroResponse respuesta=new EliminarLineaMetroResponse();
		
		objIMetro.deletebyNombre(peticion.getNombreLinea());
		
		respuesta.setRespuesta("Linea del metro: "+peticion.getNombreLinea()+" eliminada correctamente");
		return respuesta;
	}
	
	@PayloadRoot(localPart="MostrarLineaMetroRequest", namespace="http://www.uvMetro.me/MetroV2_1")
	@ResponsePayload
	public MostrarLineaMetroResponse getCompraExitosa(@RequestPayload MostrarLineaMetroRequest peticion) {
		MostrarLineaMetroResponse respuesta=new MostrarLineaMetroResponse();
		LineaMetro objMetro=new LineaMetro();
		objMetro=objIMetro.findByNombreLinea(peticion.getNombreLinea());
		
		respuesta.setNombreLinea("Nombre Linea: "+peticion.getNombreLinea());
		respuesta.setHorario("Horario: "+objMetro.getHorario());
		respuesta.setOrigen("Origen: "+objMetro.getOrigen());
		respuesta.setDestino("Destino: "+objMetro.getDestino());
		respuesta.setPrecio("Precio: "+objMetro.getPrecio());
		return respuesta;
	}


}
