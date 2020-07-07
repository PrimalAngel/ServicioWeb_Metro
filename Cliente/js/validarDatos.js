function validarUpdateLinea(){
  var NombreLineaUpdate,OrigenUpdate,DestinoUpdate,HorarioUpdate,PrecioUpdate;

  NombreLineaUpdate = document.getElementById('NombreLineaUpdate').value;
  OrigenUpdate = document.getElementById('OrigenUpdate').value;
  DestinoUpdate = document.getElementById('DestinoUpdate').value;
  HorarioUpdate = document.getElementById('HorarioUpdate').value;
  PrecioUpdate = document.getElementById('PrecioUpdate').value;

  if (NombreLineaUpdate === "" || OrigenUpdate=== "" || DestinoUpdate === "" || HorarioUpdate === "" | PrecioUpdate === "") {
    Swal.fire({
      title: "Completa los Campos",
      text: "Todos los campos son Obligatorios",
      icon: 'info',
      timer: 10000,
      timerProgressBar: true
    });
    return false;
  }
}

function validarLinea(){
  var NombreLinea,OrigenUpdate,DestinoUpdate,HorarioUpdate,PrecioUpdate;

  NombreLinea = document.getElementById('NombreLinea').value;
  Origen = document.getElementById('Origen').value;
  Destino = document.getElementById('Destino').value;
  Horario = document.getElementById('Horario').value;
  Precio = document.getElementById('Precio').value;

  if (NombreLinea === "" || Origen=== "" || Destino === "" || Horario === "" | Precio === "") {
    Swal.fire({
      title: "Completa los Campos",
      text: "Todos os campos son Obligatorios",
      icon: 'info',
      timer: 10000,
      timerProgressBar: true
    });
    return false;
  }
}

function validarDeleteLinea(){
  var NombreLinea;

  NombreLinea = document.getElementById('NombreLineaDelete').value;

  if (NombreLinea === "") {
    Swal.fire({
      title: "Completa los Campos",
      text: "Todos os campos son Obligatorios",
      icon: 'info',
      timer: 10000,
      timerProgressBar: true
    });
    return false;
  }
}
