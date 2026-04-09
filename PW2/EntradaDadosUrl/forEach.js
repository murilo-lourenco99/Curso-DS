/* For_each
   Uso de for_each como vetor para identificar as cores
*/

export function vetor_forEach(cores) {
  let hornet = [];

  // converte a string cores em um array, separando as cores por virgula
  let colorido = cores.split(",");

  colorido.forEach(function (cor) {
    hornet.push(cor);
  });

  return hornet;
}
