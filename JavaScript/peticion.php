//Asegurate de agregar la biblioteca en tu pagina
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<script>
  // Realizar solicitud AJAX al servidor
  $.ajax({
    url: 'https://www.google.com.mx/?hl=es',
    method: 'GET',
    success: function(response) {
      console.log(response);
    },
    error: function(xhr, status, error) {
      console.log(status + ': ' + error);
    }
  });
</script>