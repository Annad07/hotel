function conta() {
	var nombre, correo, mensaje;
	nombre = document.getElementById('form3').value;
	correo = document.getElementById('form2').value;
	mensaje = document.getElementById('form8').value;

	if (nombre != '' && correo != '' && mensaje != '') {
		Swal.fire({
			type: 'success',
			title: 'Correcto',
			text: 'Su mensaje ha sido enviado con éxito'
		})
	}else{
		Swal.fire({
			type: 'error',
			title: 'Incorrecto',
			text: 'Todos los campos deben estar llenos'
		})
	}
}