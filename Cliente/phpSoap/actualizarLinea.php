<?php
$client=new SoapClient("http://34.204.7.251:8080/ws/MetroV2_1.wsdl");

$NombreLinea=$_GET['NombreLineaUpdate'];
$Origen=$_GET['OrigenUpdate'];
$Destino=$_GET['DestinoUpdate'];
$Horario=$_GET['HorarioUpdate'];
$Precio=$_GET['PrecioUpdate'];

$parametros= array("NombreLinea" =>$NombreLinea,"Origen"=>$Origen, "Destino"=>$Destino, "Horario"=>$Horario, "Precio"=>$Precio);

$response= $client->__soapCall('ActualizarLineaMetro', array($parametros));

$Param1= $response->{'Respuesta'};

#$mensaje = $response->{'Compra'}.$response->{'Usuario'}.$response->{'TypeVagon'}.$response->{'Origen'}.$response->{'NombreLinea'}.$response->{'TypePago'}.$response->{'Fecha'}.$response->{'Precio'};

#echo $mensaje;
echo $Param1;

?>
