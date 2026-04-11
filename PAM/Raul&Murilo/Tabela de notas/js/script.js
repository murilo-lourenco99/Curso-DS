import { calculo_media } from './calculo_media.js';
import { verifica_aprovacao } from './verifica_aprovacao.js';

let body = document.querySelector('body');
console.log(body);
let linhas = document.querySelectorAll('tr');

linhas.forEach(function (linha) {
  let notaInputs = linha.querySelectorAll('.nota input');
  let media = linha.querySelector('.media');
  let statusNota = linha.querySelector('.status');

  let botaoCalculo = document.getElementById('botaoCalculo');
  botaoCalculo.addEventListener('click', function () {
    let mediaValor = calculo_media(notaInputs);
    media.textContent = mediaValor.toFixed(2);
    statusNota.textContent = verifica_aprovacao(mediaValor);

  if(statusNota.textContent == "Reprovado"){
    statusNota.style.color = '#801515';
    statusNota.style.fontWeight = 'bold';
  }
  else if(statusNota.textContent == "Em recuperação"){
    statusNota.style.fontSize = '15px';
    statusNota.style.backgroundColor = '#43434e';
  }
  else if(statusNota.textContent == "Aprovado"){
    statusNota.style.borderColor = "#2CB40F"
  }
  });
});