import { calculoImc, classImc } from "./opp.js";

let trs = document.querySelectorAll("tbody tr");
console.log(trs);

for (let i = 0; i < trs.length; i++) {
  let pessoa = trs[i].children;

  let altura = parseFloat(pessoa[2].textContent);
  let peso = parseInt(pessoa[3].textContent);
  let tdImc = pessoa[4];
  let tdClassi = pessoa[5];

  let imc = calculoImc(altura, peso);
  tdImc.textContent = imc.toFixed(1);
  console.log(tdImc);

  let classificacao = classImc(imc, tdClassi);
}
