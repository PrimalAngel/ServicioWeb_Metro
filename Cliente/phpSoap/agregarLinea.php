<?php
$client=new SoapClient("http://34.204.7.251:8080/ws/MetroV2_1.wsdl");

$NombreLinea=$_POST['NombreLinea'];
$Origen=$_POST['Origen'];
$Destino=$_POST['Destino'];
$Horario=$_POST['Horario'];
$Precio=$_POST['Precio'];

$parametros= array("NombreLinea" =>$NombreLinea,"Origen"=>$Origen, "Destino"=>$Destino, "Horario"=>$Horario, "Precio"=>$Precio);

$response= $client->__soapCall('LineasMetro', array($parametros));

$Param1= $response->{'respuesta'};

#$mensaje = $response->{'Compra'}.$response->{'Usuario'}.$response->{'TypeVagon'}.$response->{'Origen'}.$response->{'NombreLinea'}.$response->{'TypePago'}.$response->{'Fecha'}.$response->{'Precio'};

#echo $mensaje;
echo $Param1;

?>
