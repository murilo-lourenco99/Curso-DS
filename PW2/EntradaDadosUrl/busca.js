/*
 realizando a busca em um vetor
*/

export function vetor_busca(numeros, busca) {
  let vetor = numeros.split(",");
  let encontrado = false;

  for (let i = 0; i < vetor.length; i++) {
    if (vetor[i] == busca) {
      encontrado = true;
      break;
    }
  }

  if (encontrado) {
    return ("O numero " + busca + " foi encontrado");
  } else {
    return ("O numero " + busca + " não foi encontrado");
  }
}
