
let body = document.querySelector('body');
console.log(body);

let linhas = document.querySelectorAll('tr');

// Vetor analizando cada linha
linhas.forEach(function (linha) {
  let notaInputs = linha.querySelectorAll('.nota input');

  let media = linha.querySelector('.media');
  let statusNota = linha.querySelector('.status');

  // Funcionalidade e evento do botão
  let botaoCalculo = document.getElementById('botaoCalculo');
  botaoCalculo.addEventListener('click', function () {
    // Inicializar a soma das notas
    let somaNotas = 0;

    //Incrementação do contador
    notaInputs.forEach(function (input) {
      // Adicionar a nota à soma
      somaNotas += Number(input.value);
    });

    // Calcular a média
    let mediaValor = somaNotas / notaInputs.length;

    // Apresentar média
    media.textContent = mediaValor.toFixed(2);

    // Verificar aprovação
    if (mediaValor < 4) {
      statusNota.textContent = 'Reprovado';
    } else if (mediaValor < 5) {
      statusNota.textContent = 'Em recuperação';
    } else {
      statusNota.textContent = 'Aprovado';
    }
  });
});
