import { classificacao } from "./classificacao.js";
import { calculo_imc } from "./calculo_imc.js";

let linhas = document.querySelectorAll('tbody tr');

for (let i = 0; i < linhas.length; i++) {

    let linha = linhas[i].children;

    let altura = Number(linha[2].textContent);
    let peso = Number(linha[3].textContent);

    let imc = calculo_imc(altura, peso);
    linha[4].textContent = imc.toFixed(1);

    let classificacao_valor = classificacao(imc);
    linha[5].textContent = classificacao_valor;

}