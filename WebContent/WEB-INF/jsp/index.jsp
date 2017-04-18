<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" charset="UTF-8" />
<title>Codigo do Cardoso</title>

<script src="https://code.jquery.com/jquery-3.2.1.min.js"
	integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
	crossorigin="anonymous"></script>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>

<link
	href="https://fonts.googleapis.com/css?family=Lobster|UnifrakturCook:700"
	rel="stylesheet">

<script src="https://use.fontawesome.com/74ca2ac1e8.js"></script>

<link rel="stylesheet" type="text/css" href="css/style.css">

<script type="text/javascript" src="js/script.js"></script>

</head>
<body>
	<script type="text/javascript">
		function finalizaAgora(id) {
			var resposta = $('#resposta' + id).val();
			$.get('ActionServlet', {
				'id' : id,
				'resposta' : resposta
			}, function(responseText) {
				$('#Correcao' + id).text(responseText);
				if(responseText === "Resposta Correta!"){
					$('#cadeado'+(id+1)).fadeOut();
				}
			});
		}
	</script>
	<div class="container-fluid">
		<section id="inicio">
			<div class="row">
				<h1 class="text-center title">Código de Cardoso</h1>
			</div>
			<div class="row">
				<p class="text-center">
					Olá, tudo bem?<br> Bem vinda ao meu jogo e espero que goste!!
					<br> <br> Para resolver os desafios será necessário usar
					os mais diversos tipos de recursos como: Google maps, instagram,
					facebook, twitter, etc... <br> Lembre de anotar as respostas
					que utilizar, isso será de grande valia
				</p>
			</div>
		</section>
		<c:forEach items="${tarefas}" var="tarefa">
			<hr>
			<section id="perguntaNumero${tarefa.id}">
				<h3 class="text-center title">Desafio ${tarefa.id}</h3>
				<c:choose>
					<c:when test="${tarefa.situacao}">
						<div class="form-group">
							<h4 class="text-center">${tarefa.pergunta}</h4>
							<input type="number" class="text-center form-control"
								name="resposta" required id="resposta1" placeholder="Resposta">
							<input type="hidden" name="id" value="${tarefa.id}" name="">
						</div>
						<button id="submit" name="" onClick="finalizaAgora(${tarefa.id})"
							value="" class="btn btn-primary center-block">Enviar</button>
						<div id="Correcao${tarefa.id}"></div>
					</c:when>
					<c:otherwise>
						<i class="text-center fa fa-lock center-block" id="cadeado${tarefa.id}" aria-hidden="true"></i>
					</c:otherwise>
				</c:choose>
			</section>
		</c:forEach>
	</div>
</body>
</html>