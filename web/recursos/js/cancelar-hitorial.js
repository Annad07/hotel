function entrada(){
	Swal.fire({
  title: '¿Está seguro?',
  text: "¿Desea cancelar este historial clínico?",
  type: 'warning',
  showCancelButton: true,
  confirmButtonColor: '#3085d6',
  cancelButtonColor: '#d33',
  confirmButtonText: 'Sí, cancelar!',
  cancelButtonText: 'Volver',
}).then((result) => {
  if (result.value) {
    Swal.fire(
      '¡Cancelado!',
      'El historial clínico ha sido cancelado correctamente',
      'success',
    )
  }
})
}