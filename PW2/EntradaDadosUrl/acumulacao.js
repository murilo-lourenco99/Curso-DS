/* acumulação de vetor
  Potencia
*/

export function vetor_acumulacao(numeros) {
  let vetor = numeros.split(",").map(Number);

  for (let i = 0; i < vetor.length; i++) {
    vetor[i] = vetor[i] * vetor[i];
  }

  return vetor;
}
