function entrada(){
	Swal.fire({
  title: '¿Esta seguro?',
  text: "¿Desea cancelar este control de vacunas?",
  type: 'warning',
  showCancelButton: true,
  confirmButtonColor: '#3085d6',
  cancelButtonColor: '#d33',
  confirmButtonText: 'Si, cancelar!',
  cancelButtonText: 'Volver',
}).then((result) => {
  if (result.value) {
    Swal.fire(
      '¡Cancelado!',
      'El control de vacunas ha sido cancelado correctamente',
      'success',
    )
  }
})
}
