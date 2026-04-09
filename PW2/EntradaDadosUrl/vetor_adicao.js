/* Vetores
   Vetor de adição
*/

export function vetor_adicao(numeros, adiciona) {
  let vetor = numeros.split(",").map(Number);

  if (adiciona) {
    vetor.push(Number(adiciona));
  }

  return vetor;
}
