/* Estrutura de repeticao do-while
   Calculo fatorial
*/

export function do_while(numero) {
    let i = 1;
    let fatorial = 1;
    do {
        fatorial = fatorial * i;
        i++;
    } while (i <= numero);

    return "O fatorial deste número é: " + fatorial

}
