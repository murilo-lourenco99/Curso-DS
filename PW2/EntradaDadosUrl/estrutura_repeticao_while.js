/* Estrutura derepeticao while
   Contar de 1 a 100
*/

export function laco_while(i) {
    let vazio = [];
    i = 0;

    while (i <= 100) {
        vazio [i] = i + " ";
        i++
    }
    return vazio;
}
