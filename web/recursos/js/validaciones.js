function crearUsuario(){
	var nombre, identificacion, tipo, correo, contra;
	nombre = document.getElementById('nombre').value;
	identificacion = document.getElementById('identificacionUser').value;
	tipo = document.getElementById('tipo').value;
	correo = document.getElementById('correoUsuario').value;
	contra = document.getElementById('contraUser').value;

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
	}else if(identificacion.length>10){
		Swal.fire({
			type: 'error',
			title: 'La identificación no debe ser superior a 10 caracteres',
		})
	}else if(identificacion == ''){
		Swal.fire({
			type: 'error',
			title: 'El campo identificación no ha sido llenado',
		})
	}else if(isNaN(identificacion)){
		Swal.fire({
			type: 'error',
			title: 'La identificación no es válida',
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
	}else if(contra.length>20){
		Swal.fire({
			type: 'error',
			title: 'La contraseña debe estar entre 5 y 20 caracteres',
		})
	}else if(contra == ''){
		Swal.fire({
			type: 'error',
			title: 'El campo contraseña no ha sido llenado',
		})
	}else if(tipo == '...'){
		Swal.fire({
			type: 'error',
			title: 'El campo tipo no ha sido diligenciado',
		})
	}else if (nombre != '' && identificacion != '' && tipo != '...' && correo != '' && contra != '') {
		Swal.fire({
			type: 'success',
			title: 'Se ha creado el usuario exitosamente',
		})
	}
}
function crearHistorial(){
	var identificacion, nombre, fecha, especie, raza;
	identificacion = document.getElementById('identificacion').value;
	nombre = document.getElementById('nombre').value;
	fecha = document.getElementById('fecha').value;
	especie = document.getElementById('especie').value;
	raza = document.getElementById('raza').value;

	expresion = /\w+@\w+\.+[a-z]/;

	if(identificacion.length>10){
		Swal.fire({
			type: 'error',
			title: 'La identificación no debe ser superior a 10 caracteres',
		})
	}else if(identificacion == ''){
		Swal.fire({
			type: 'error',
			title: 'El campo identificación no ha sido llenado',
		})
	}else if(isNaN(identificacion)){
		Swal.fire({
			type: 'error',
			title: 'La identificación no es válida',
		})
	}else if(nombre.length>10){
		Swal.fire({
			type: 'error',
			title: 'El nombre no debe ser superior a 10 caracteres',
		})
	}else if(nombre == ''){
		Swal.fire({
			type: 'error',
			title: 'El campo nombre no ha sido llenado',
		})
	}else if(fecha == ''){
		Swal.fire({
			type: 'error',
			title: 'El campo fecha no ha sido llenado',
		})
	}else if(especie == '...'){
		Swal.fire({
			type: 'error',
			title: 'El campo especie no ha sido llenado',
		})
	}else if(raza.length>10){
		Swal.fire({
			type: 'error',
			title: 'La raza es muy larga',
		})
	}else if(raza == ''){
		Swal.fire({
			type: 'error',
			title: 'El campo raza no ha sido llenado',
		})
	}else if (identificacion != '' && nombre != '' && fecha != '...' && raza != '') {
		Swal.fire({
			type: 'success',
			title: 'Se ha creado el historial exitosamente',
		})
	}
}
function crearControl(){
	var identificacion, nombre, fecha, especie, raza;
	identificacion = document.getElementById('identificacion').value;
	nombre = document.getElementById('nombre').value;
	fecha = document.getElementById('fecha').value;
	especie = document.getElementById('especie').value;
	raza = document.getElementById('raza').value;

	if(identificacion.length>10){
		Swal.fire({
			type: 'error',
			title: 'La identificación no debe ser superior a 10 caracteres',
		})
	}else if(identificacion == ''){
		Swal.fire({
			type: 'error',
			title: 'El campo identificación no ha sido llenado',
		})
	}else if(isNaN(identificacion)){
		Swal.fire({
			type: 'error',
			title: 'La identificación no es válida',
		})
	}else if(nombre.length>10){
		Swal.fire({
			type: 'error',
			title: 'El nombre no debe ser superior a 10 caracteres',
		})
	}else if(nombre == ''){
		Swal.fire({
			type: 'error',
			title: 'El campo nombre no ha sido llenado',
		})
	}else if(fecha == ''){
		Swal.fire({
			type: 'error',
			title: 'El campo fecha no ha sido llenado',
		})
	}else if(especie == '...'){
		Swal.fire({
			type: 'error',
			title: 'El campo especie no ha sido llenado',
		})
	}else if(raza.length>10){
		Swal.fire({
			type: 'error',
			title: 'La raza es muy larga',
		})
	}else if(raza == ''){
		Swal.fire({
			type: 'error',
			title: 'El campo raza no ha sido llenado',
		})
	}else if (identificacion != '' && nombre != '' && fecha != '...' && raza != '') {
		Swal.fire({
			type: 'success',
			title: 'Se ha creado el control de vacunas exitosamente',
		})
	}
}
function crearProducto(){	
	var nombreProducto, cantidad, precio, producto;
	nombreProducto = document.getElementById('nombreProducto').value;
	cantidad = document.getElementById('cantidad').value;
	precio = document.getElementById('precio').value;
	producto = document.getElementById('producto').value;

	if(nombreProducto.length>10){
		Swal.fire({
			type: 'error',
			title: 'El nombre no debe ser superior a 10 caracteres',
		})
	}else if(nombreProducto == ''){
		Swal.fire({
			type: 'error',
			title: 'El campo nombre no ha sido llenado',
		})
	}else if(cantidad.length>3){
		Swal.fire({
			type: 'error',
			title: 'La cantidad es muy larga',
		})
	}else if(cantidad == ''){
		Swal.fire({
			type: 'error',
			title: 'El campo cantidad no ha sido llenado',
		})
	}else if(isNaN(cantidad)){
		Swal.fire({
			type: 'error',
			title: 'La cantidad no es válida',
		})
	}else if(precio == ''){
		Swal.fire({
			type: 'error',
			title: 'El campo precio no has sido llenado',
		})
	}else if(producto == '...'){
		Swal.fire({
			type: 'error',
			title: 'El campo producto no has sido llenado',
		})
	}else if (nombreProducto != '' && cantidad != '' && precio != '' && producto != '...') {
		Swal.fire({
			type: 'success',
			title: 'Se ha creado el producto exitosamente',
		})
	}
}
function modificarUsuario(){	
	var nombre, identificacion, correo, contrasena, tipo;
	nombre = document.getElementById('nombre').value;
	identificacion = document.getElementById('identificacion').value;
	correo = document.getElementById('correo').value;
	contrasena = document.getElementById('contrasena').value;
	tipo = document.getElementById('tipo').value;

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
	}else if(identificacion.length>10){
		Swal.fire({
			type: 'error',
			title: 'La identificación no debe ser superior a 10 caracteres',
		})
	}else if(identificacion == ''){
		Swal.fire({
			type: 'error',
			title: 'El campo identificación no ha sido llenado',
		})
	}else if(isNaN(identificacion)){
		Swal.fire({
			type: 'error',
			title: 'La identificación no es válida',
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
	}else if(contra.length>20){
		Swal.fire({
			type: 'error',
			title: 'La contraseña debe estar entre 5 y 20 caracteres',
		})
	}else if(contra == ''){
		Swal.fire({
			type: 'error',
			title: 'El campo contraseña no ha sido llenado',
		})
	}else if(tipo == '...'){
		Swal.fire({
			type: 'error',
			title: 'El campo tipo no ha sido diligenciado',
		})
	}else if (nombre != '' && identificacion != '' && tipo != '...' && correo != '' && contra != '') {
		Swal.fire({
			type: 'success',
			title: 'Se ha modificado el usuario exitosamente',
		})
	}
}
function modificarControl(){	
	var identificacion, nombre, fecha, especie, raza;
	identificacion = document.getElementById('identificacion').value;
	nombre = document.getElementById('nombre').value;
	fecha = document.getElementById('fecha').value;
	especie = document.getElementById('especie').value;
	raza = document.getElementById('raza').value;

	if(identificacion.length>10){
		Swal.fire({
			type: 'error',
			title: 'La identificación no debe ser superior a 10 caracteres',
		})
	}else if(identificacion == ''){
		Swal.fire({
			type: 'error',
			title: 'El campo identificación no ha sido llenado',
		})
	}else if(isNaN(identificacion)){
		Swal.fire({
			type: 'error',
			title: 'La identificación no es válida',
		})
	}else if(nombre.length>10){
		Swal.fire({
			type: 'error',
			title: 'El nombre no debe ser superior a 10 caracteres',
		})
	}else if(nombre == ''){
		Swal.fire({
			type: 'error',
			title: 'El campo nombre no ha sido llenado',
		})
	}else if(fecha == ''){
		Swal.fire({
			type: 'error',
			title: 'El campo fecha no ha sido llenado',
		})
	}else if(especie == '...'){
		Swal.fire({
			type: 'error',
			title: 'El campo especie no ha sido llenado',
		})
	}else if(raza.length>10){
		Swal.fire({
			type: 'error',
			title: 'La raza es muy larga',
		})
	}else if(raza == ''){
		Swal.fire({
			type: 'error',
			title: 'El campo raza no ha sido llenado',
		})
	}else if (identificacion != '' && nombre != '' && fecha != '...' && raza != '') {
		Swal.fire({
			type: 'success',
			title: 'Se ha modificado el control de vacunas exitosamente',
		})
	}
}
function agregarVacuna(){	
	var nombre, nDosis, fecha;
	nombre = document.getElementById('nombre').value;
	nDosis = document.getElementById('nDosis').value;
	fecha = document.getElementById('fecha').value;

	if(nombre == '...'){
		Swal.fire({
			type: 'error',
			title: 'El campo nombre no ha sido llenado',
		})
	}else if(nDosis>9){
		Swal.fire({
			type: 'error',
			title: 'El número de dosis no debe ser superior a 9',
		})
	}else if(nDosis == ''){
		Swal.fire({
			type: 'error',
			title: 'El campo dosis no ha sido llenado',
		})
	}else if(fecha == ''){
		Swal.fire({
			type: 'error',
			title: 'El campo fecha no ha sido llenado',
		})
	}else if (nombre != '' && nDosis != '' && fecha != '') {
		Swal.fire({
			type: 'success',
			title: 'Se ha agregado la vacuna exitosamente',
		})
	}
}
function agregarProcedimiento(){	
	var fecha, descripcion;
	fecha = document.getElementById('fecha').value;
	descripcion = document.getElementById('descripcion').value;

	if(fecha == ''){
		Swal.fire({
			type: 'error',
			title: 'El campo fecha no ha sido llenado',
		})
	
	}else if(descripcion == ''){
		Swal.fire({
			type: 'error',
			title: 'El campo descripción no ha sido llenado',
		})
	}else if(descripcion>200){
		Swal.fire({
			type: 'error',
			title: 'El campo fecha no ha sido llenado',
		})
	}else if (fecha != '' && descripcion != '') {
		Swal.fire({
			type: 'success',
			title: 'Se ha agregado el procedimiento exitosamente',
		})
	}

}
function modificarHistorial(){	
	var identificacion, nombre, fecha, especie, raza;
	identificacion = document.getElementById('identificacion').value;
	nombre = document.getElementById('nombre').value;
	fecha = document.getElementById('fecha').value;
	especie = document.getElementById('especie').value;
	raza = document.getElementById('raza').value;

	if(identificacion.length>10){
		Swal.fire({
			type: 'error',
			title: 'La identificación no debe ser superior a 10 caracteres',
		})
	}else if(identificacion == ''){
		Swal.fire({
			type: 'error',
			title: 'El campo identificación no ha sido llenado',
		})
	}else if(isNaN(identificacion)){
		Swal.fire({
			type: 'error',
			title: 'La identificación no es válida',
		})
	}else if(nombre.length>10){
		Swal.fire({
			type: 'error',
			title: 'El nombre no debe ser superior a 10 caracteres',
		})
	}else if(nombre == ''){
		Swal.fire({
			type: 'error',
			title: 'El campo nombre no ha sido llenado',
		})
	}else if(fecha == ''){
		Swal.fire({
			type: 'error',
			title: 'El campo fecha no ha sido llenado',
		})
	}else if(especie == '...'){
		Swal.fire({
			type: 'error',
			title: 'El campo especie no ha sido llenado',
		})
	}else if(raza.length>10){
		Swal.fire({
			type: 'error',
			title: 'La raza es muy larga',
		})
	}else if(raza == ''){
		Swal.fire({
			type: 'error',
			title: 'El campo raza no ha sido llenado',
		})
	}else if (identificacion != '' && nombre != '' && fecha != '...' && raza != '') {
		Swal.fire({
			type: 'success',
			title: 'Se ha modificado el historial exitosamente',
		})
	}
}

