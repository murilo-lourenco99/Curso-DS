export function calculo_media(notaInputs) {
    let somaNotas = 0;
    notaInputs.forEach(function (input) {
        somaNotas += Number(input.value);
    });
    return somaNotas / notaInputs.length;
}