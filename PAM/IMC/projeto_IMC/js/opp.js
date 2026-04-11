export function calculoImc(peso, altura) {
  let imc = peso / (altura * altura)
  return imc;
}

export function classImc(imc, Classi) {
  if (imc < 18.5) {
    Classi.textContent = "Abaixo do Peso";
  } else if (imc >= 18.5 && imc < 24.9) {
    Classi.textContent = "Peso Normal";
  } else if (imc >= 25 && imc < 29.9) {
    Classi.textContent = "Sobrepeso";
  } else if (imc >= 30 && imc < 34.9) {
    Classi.textContent = "Obesidade Grau I";
  } else if (imc >= 35 && imc < 39.9) {
    Classi.textContent = "Obesidade Grau II";
  } else if (imc >= 40) {
    Classi.textContent = "Obesidade Grau III (mórbida)";
  }
}