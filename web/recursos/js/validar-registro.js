function registrar(){
	
	var nombre=document.getElementById("nombre").value; 
	var apellido=document.getElementById("apellido").value;
	var correo=document.getElementById("correo").value;
	var contrasena2=document.getElementById("contrasena2").value;
	var celular=document.getElementById("celular").value;

	
	expresion = /\w+@\w+\.+[a-z]/;

	if(nombre.length>10){
		Swal.fire({
			type: 'error',
			title: 'El nombre no debe ser superior a 10 caracteres',
		})
	}else if(nombre == ''){
		Swal.fire({
			type: 'error',
			title: 'El campo nombre no ha sido llenado',
		})
	}else if(apellido.length>15){
		Swal.fire({
			type: 'error',
			title: 'El apellido no debe ser superior a 15 caracteres',
		})
	}else if(apellido == ''){
		Swal.fire({
			type: 'error',
			title: 'El campo apellido no ha sido llenado',
		})
	}else if(!expresion.test(correo)){
		Swal.fire({
			type: 'error',
			title: 'El correo no es válido',
		})
	}else if(correo == ''){
		Swal.fire({
			type: 'error',
			title: 'El campo correo no ha sido llenado',
		})
	}else if(contrasena2.length>20){
		Swal.fire({
			type: 'error',
			title: 'La contraseña debe estar entre 5 y 20 caracteres',
		})
	}else if(contrasena2 == ''){
		Swal.fire({
			type: 'error',
			title: 'El campo contraseña no ha sido llenado',
		})
	}else if(celular.length>10){
		Swal.fire({
			type: 'error',
			title: 'El celular no debe ser mayor a 10 caracteres',
	})
	}else if(celular == ''){
		Swal.fire({
			type: 'error',
			title: 'El campo celular no ha sido diligenciado',
		})
	}else if (nombre != '' && apellido != '' && correo != '...' && contrasena2 != '' && celular != '') {
		Swal.fire({
			type: 'success',
			title: 'Se ha creado el usuario exitosamente',
		})
	}
}
