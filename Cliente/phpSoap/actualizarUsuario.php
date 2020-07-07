<?php
  $client=new SoapClient("http://34.204.7.251:8080/ws/MetroV2_1.wsdl");

  $NombreUsuario=$_GET['NombreUsuarioUpdate'];
  $FechaDeNacimiento=$_GET['FechaDeNacimientoUpdate'];
  $Correo=$_GET['CorreoUpdate'];
  $MetodoPagoUsuario=$_GET['MetodoPagoUsuarioUpdate'];
  $NumeroTarjeta=$_GET['NumeroTarjetaUpdate'];

  $parametros= array("NombreUsuario"=>$NombreUsuario, "FechaDeNacimiento"=>$FechaDeNacimiento, "Correo"=>$Correo, "MetodoPagoUsuario"=>$MetodoPagoUsuario, "NumeroTarjeta"=>$NumeroTarjeta);

  $response= $client->__soapCall('ActualizarUsuario', array($parametros));

  $Param1= $response->{'Respuesta'};

  #$mensaje = $response->{'Compra'}.$response->{'Usuario'}.$response->{'TypeVagon'}.$response->{'Origen'}.$response->{'NombreLinea'}.$response->{'TypePago'}.$response->{'Fecha'}.$response->{'Precio'};

  #echo $mensaje;
  echo $Param1;

?>
