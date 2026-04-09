/* Estrutura de repeticao for
   Tabuada
*/

export function laco_for() {
    let print_resultado = [];
    
    for (let i = 1; i <= 10; i++) {
        for (let n = 1; n <= 10; n++) {
            let resultado = n * i;
            print_resultado.push(i + " x " + n + " = " + resultado);
        }

        print_resultado.push("-------"); // isso aqui adiciona uma linha ao final da tabuada
    }
    
    return print_resultado;
}