jQuery(document).ready(function($) {
	var estadoSelecionado = $('#estadoSelecionado').val();

	$('#uf').val(estadoSelecionado);
	
		
	$('#formClient').submit(function() {
		if (!$('#name').val()) {
			alert('Campo nome é obrigatório');
			return false;
		} else if (!$('#email').val()) {
			alert('Campo email é obrigatório');
			return false;
		} else {
			return true;
		}

	});

});