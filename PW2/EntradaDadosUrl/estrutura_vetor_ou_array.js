/* Estrutura de vetor ou array
    Ranking de livros
*/

export function vetor_array(livro) {
  let hollow = [];

  let ranking = livro.split(",");

  for (let i = 0; i < 3; i++) {
    hollow[i] = "O top " + (i + 1) + " é: " + ranking[i];
  }
  return hollow;
}
