function entradaolvido(){
	var usuario=document.getElementById("usuario").value; 
	var contrasena=document.getElementById("contrasena").value;
	if (usuario=='admi@correo.com') {
		alert('REVISA TU CORREO')
	}
	if(usuario=='cliente@correo.com' ){
		alert('REVISA TU CORREO')

	}
	if (usuario=='veterinario@correo.com') {
		alert('REVISA TU CORREO')
	if(usuario==false){
		alert('NO EXISTE NINGúN CORREO CON ESTAS CARACTERISTICAS')
	}
}
}
