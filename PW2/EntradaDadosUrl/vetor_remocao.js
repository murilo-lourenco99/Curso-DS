/* Vetores
   Vetor de remoção
*/

export function vetor_remocao(numeros, remove) {
    let vetor_numeros = numeros.split(",").map(Number);

    let removido = vetor_numeros.filter(function (numero) {
        return numero !== parseInt(remove);
    });

    return removido;
}
