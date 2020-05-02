# Metro🚄

## Descripción

Servicio Web de Metro

[LINK]: http://34.204.7.251:8080/ws/MetroV2_1.wsdl	"Link de Servicio"

## Funcionalidades

- [x] Realizar Compra

  ```xml
  <Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
      <Body>
          <CompraRequest xmlns="http://www.uvMetro.me/MetroV2_1">
              <Compra>CompraPrueba</Compra>
              <Usuario>Angel Emmanuel</Usuario>
              <TypeVagon>VIP</TypeVagon>
              <Origen>Mexico</Origen>
              <NombreLinea>MX-01</NombreLinea>
              <TypePago>Credito</TypePago>
              <Fecha>30/04/2020</Fecha>
              <Precio>400</Precio>
          </CompraRequest>
      </Body>
  </Envelope>
  ```

  

- [x] Actualizar Compra

  ```xml
  <Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
      <Body>
          <ActualizarCompraRequest xmlns="http://www.uvMetro.me/MetroV2_1">
              <Compra>CompraPrueba</Compra>
              <Usuario>Alexis</Usuario>
              <TypeVagon>VIP</TypeVagon>
              <Origen>Mexico</Origen>
              <NombreLinea>mX-01</NombreLinea>
              <TypePago>Efectivo</TypePago>
              <Precio>100</Precio>
              <Fecha>30/04/2020</Fecha>
          </ActualizarCompraRequest>
      </Body>
  </Envelope>
  ```

  

- [x] Mostrar Compra

  ```xml
  <Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
      <Body>
          <MostrarCompraRequest xmlns="http://www.uvMetro.me/MetroV2_1">
              <Compra>CompraPrueba</Compra>
          </MostrarCompraRequest>
      </Body>
  </Envelope>
  ```

  

- [x] Cancelar Compra

  ```xml
  <Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
      <Body>
          <CancelarCompraRequest xmlns="http://www.uvMetro.me/MetroV2_1">
              <Cancelación>PruebaCompra</Cancelación>
          </CancelarCompraRequest>
      </Body>
  </Envelope>
  ```

  

- [x] Registrar Usuario

  ```xml
  <Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
      <Body>
          <UsuarioRequest xmlns="http://www.uvMetro.me/MetroV2_1">
              <NombreUsuario>Angel Emmanuel</NombreUsuario>
              <FechaDeNacimiento>12/03/99</FechaDeNacimiento>
              <Correo>primal@gmail.com</Correo>
              <MetodoPago>Credito</MetodoPago>
              <NumeroTarjeta>123456789123456789</NumeroTarjeta>
          </UsuarioRequest>
      </Body>
  </Envelope>
  ```

  

- [x] Actualizar Usuario

  ```xml
  <Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
      <Body>
          <ActualizarUsuarioRequest xmlns="http://www.uvMetro.me/MetroV2_1">
              <NombreUsuario>Angel Emmanuel</NombreUsuario>
              <FechaDeNacimiento>12/03/99</FechaDeNacimiento>
              <Correo>Primal_angel@outlook.es</Correo>
              <MetodoPago>Efectivo</MetodoPago>
              <NumeroTarjeta>0</NumeroTarjeta>
          </ActualizarUsuarioRequest>
      </Body>
  </Envelope>
  ```

  

- [x] Eliminar Usuario

  ```xml
  <Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
      <Body>
          <EliminarUsuarioRequest xmlns="http://www.uvMetro.me/MetroV2_1">
              <IdUsuario>Angel Emmanuel</IdUsuario>
          </EliminarUsuarioRequest>
      </Body>
  </Envelope>
  ```

  

- [x] Agregar Línea de Metro

  ```xml
  <Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
      <Body>
          <LineasMetroRequest xmlns="http://www.uvMetro.me/MetroV2_1">
              <NombreLinea>MX-02</NombreLinea>
              <Origen>Mexico</Origen>
              <Destino>Toluca</Destino>
              <Horario>10:00</Horario>
              <Precio>400</Precio>
          </LineasMetroRequest>
      </Body>
  </Envelope>
  ```

  

- [x] Actualizar Línea Metro

  ```xml
  <Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
      <Body>
          <ActualizarLineaMetroRequest xmlns="http://www.uvMetro.me/MetroV2_1">
              <NombreLinea>MX-02</NombreLinea>
              <Origen>Mexico</Origen>
              <Destino>Veracruz</Destino>
              <Horario>11:00</Horario>
              <Precio>500</Precio>
          </ActualizarLineaMetroRequest>
      </Body>
  </Envelope>
  ```

  

- [x] Mostrar Línea Metro

  ```xml
  <Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
      <Body>
          <MostrarLineaMetroRequest xmlns="http://www.uvMetro.me/MetroV2_1">
              <NombreLinea>MX-02</NombreLinea>
          </MostrarLineaMetroRequest>
      </Body>
  </Envelope>
  ```

  

- [x] Eliminar Línea de Metro

  ```xml
  <Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
      <Body>
          <EliminarLineaMetroRequest xmlns="http://www.uvMetro.me/MetroV2_1">
              <NombreLinea>MX-01</NombreLinea>
          </EliminarLineaMetroRequest>
      </Body>
  </Envelope>
  ```




## Mensajes

| Función               | Parámetros                                                   | Respuestas                                                   |
| --------------------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| Agregar Compra        | Compra(Nombre), Usuario, Fecha, NombreLinea, Origen, TypeVagon, TypePago, Precio | Compra=""<br />Usuario=""<br />Fecha=""<br />NombreLinea=""<br />Origen=""<br />TYpeVagon=""<br />TypePago=""<br />Precio="" |
| Cancelar Compra       | Compra(Nombre)                                               | Compra "NombreCompra" ah sido cancelada exitosamente         |
| Mostrar Compra        | Compra(Nombre)                                               | Compra=""<br />Usuario=""<br />Fecha=""<br />NombreLinea=""<br />Origen=""<br />TYpeVagon=""<br />TypePago=""<br />Precio="" |
| Actualizar Compra     | Compra(Nombre), Usuario, Fecha, NombreLinea, Origen, TypeVagon, TypePago, Precio | Compra=""<br />Usuario=""<br />Fecha=""<br />NombreLinea=""<br />Origen=""<br />TYpeVagon=""<br />TypePago=""<br />Precio="" |
| LineaMetro            | IdLinea, NombreLinea, Origen, Destino, Horario, Precio       | NombreLinea=""<br />Origen=""<br />Destino=""<br />Horario=""<br />Precio=""<br /> |
| EliminarLineaMetro    | idLinea                                                      | linea de metro "Nombre de la Linea" ah sido eliminada correctamente. |
| Actualizar LineaMetro | IdLinea, NombreLinea, Origen, Destino, Horario, Precio       | NombreLinea=""<br />Origen=""<br />Destino=""<br />Horario=""<br />Precio=""<br /> |
| Mostrar LineaMetro    | IdLinea                                                      | NombreLinea=""<br />Origen=""<br />Destino=""<br />Horario=""<br />Precio=""<br /> |
| Usuario               | IdUsuario, Correo, NombreUsuario, FechaDeNacimiento, MetodoDePago, NumeroTarjeta | Correo=""<br />NombreUsuario=""<br />FechaDeNacimiento=""<br />MetodoDePago=""<br />NumeroDeTarjeta="" |
| EliminarUsuario       | IdUsuario                                                    | Usuario "NombreUsuario" ah sido eliminado con éxito.         |
| Actualizar Usuario    | IdUsuario, Correo, NombreUsuario, FechaDeNacimiento, MetodoDePago, NumeroTarjeta | Correo=""<br />NombreUsuario=""<br />FechaDeNacimiento=""<br />MetodoDePago=""<br />NumeroDeTarjeta="" |

## Clases

![image-20200501151146550](https://github.com/PrimalAngel/ServicioWeb_Metro/blob/master/Diagramas/Clases.png?raw=true)

## Casos de Uso

![image-20200501151308325](https://github.com/PrimalAngel/ServicioWeb_Metro/blob/master/Diagramas/CU.png?raw=true)

## Diagrama de Actividad

![image-20200501151521255](https://github.com/PrimalAngel/ServicioWeb_Metro/blob/master/Diagramas/Actividad.png?raw=true)

## Diagrama de Componentes

![](https://github.com/PrimalAngel/ServicioWeb_Metro/blob/master/Diagramas/DiagramaDeComponentes.png?raw=true)

## Diagrama de secuencia

![](https://github.com/PrimalAngel/ServicioWeb_Metro/blob/master/Diagramas/secuenciaAdministrador.jpg?raw=true)

![](https://github.com/PrimalAngel/ServicioWeb_Metro/blob/master/Diagramas/SecuenciaUsuario.jpg?raw=true)
