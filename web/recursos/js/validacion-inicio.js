function entrada(){
	
	var usuario=document.getElementById("usuario").value; 
	var contrasena=document.getElementById("contrasena").value;
	expresion = /\w+@\w+\.+[a-z]/;
	
	if (usuario=='supervi@correo.com' && contrasena=='123456') {
		window.location.href='SI/index-supervisor.html';


	}else if(usuario=='cliente@correo.com' && contrasena=='1234569'){
		window.location.href='SI/index-cliente.html';

	}else if (usuario=='veteri@correo.com' && contrasena=="1234568") {
		window.location.href='../../app/modulos/index-veterinario.html';
	}else if (usuario == '' && contrasena == ''){
		Swal.fire({
			type: 'error',
			title: '¡Lo sentimos!',
			text: 'Todos los campos deben estar llenos'
		})
	}else if(!expresion.test(usuario)){
		Swal.fire({
			type: 'error',
			title: '¡Lo sentimos!',
			text: 'El correo ingresado no es válido'
		})

	}else if (usuario != '' && contrasena == '') {
		Swal.fire({
			type: 'error',
			title: '¡Lo sentimos!',
			text: 'Falta ingresar la contraseña'
		})

	}else if(contrasena != '123456' || contrasena != '1234569' || contrasena != '1234568'){
		Swal.fire({
			type: 'error',
			title: 'La contraseña es incorrecta',
		})

	}else if(usuario != 'supervi@correo.com' || usuario != 'veteri@correo.com' || usuario != 'cliente@correo.com'){
		Swal.fire({
			type: 'error',
			title: 'El correo ingresado no existe',
		})
	}
}
