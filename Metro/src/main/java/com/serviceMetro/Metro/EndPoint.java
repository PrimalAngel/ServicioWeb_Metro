package com.serviceMetro.Metro;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


import me.uvmetro.metro.CompraExitosaResponse;
import me.uvmetro.metro.CompraTicketRequest;
import me.uvmetro.metro.SeleccionBagonRequest;
import me.uvmetro.metro.SeleccionBagonResponse;
import me.uvmetro.metro.SeleccionDestinoRequest;
import me.uvmetro.metro.SeleccionDestinoResponse;
import me.uvmetro.metro.TipoPagoRequest;
import me.uvmetro.metro.TipoPagoResponse;


@Endpoint
public class EndPoint {
	
	@PayloadRoot(localPart="CompraTicketRequest", namespace="http://www.uvMetro.me/metro")
	@ResponsePayload
	public CompraExitosaResponse getCompraExitosa(@RequestPayload CompraTicketRequest peticion) {
		CompraExitosaResponse respuesta=new CompraExitosaResponse();
		respuesta.setRespuesta("Hola Compra Exitosa por "+peticion.getRespuesta());
		return respuesta;
	}
	
	@PayloadRoot(localPart="SeleccionBagonRequest", namespace="http://www.uvMetro.me/metro")
	@ResponsePayload
	public SeleccionBagonResponse getSelectBagon(@RequestPayload SeleccionBagonRequest peticion) {
		SeleccionBagonResponse respuesta=new SeleccionBagonResponse();
		respuesta.setRespuesta("Hola acabas de seleccionar :"+peticion.getRespuesta()+" para tu viaje");
		return respuesta;
	}
	
	@PayloadRoot(localPart="SeleccionDestinoRequest", namespace="http://www.uvMetro.me/metro")
	@ResponsePayload
	public SeleccionDestinoResponse getSelectDestino(@RequestPayload SeleccionDestinoRequest peticion) {
		SeleccionDestinoResponse respuesta=new SeleccionDestinoResponse();
		respuesta.setRespuesta("Hola tu destino es :"+peticion.getRespuesta()+" feliz viaje :)");
		return respuesta;
	}
	
	@PayloadRoot(localPart="TipoPagoRequest", namespace="http://www.uvMetro.me/metro")
	@ResponsePayload
	public TipoPagoResponse getSelectTypePago(@RequestPayload TipoPagoRequest peticion) {
		TipoPagoResponse respuesta=new TipoPagoResponse();
		respuesta.setRespuesta("Hola tu destino es :"+peticion.getRespuesta()+" feliz viaje :)");
		return respuesta;
	}
	
}
