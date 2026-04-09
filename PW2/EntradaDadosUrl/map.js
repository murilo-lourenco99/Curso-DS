/* Map
   Uso de map como vetor copiador para fazer o cubo de números
*/

export function uso_map(numeros) {
  let jojo = [];
  let i = 0;

  let cubos = numeros.split(",").map(function (numero) {
    jojo[i] = numero * numero * numero;
    i++;
  });

  return jojo;
}
