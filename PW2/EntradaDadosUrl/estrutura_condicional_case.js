/* Estrutura condicional case
   Rodizio de placas de carro
*/

export function switch_case(placa) {
  switch (placa) {
    case 1:
    case 2:
      return "Você não pode circular na segunda-feira";
      break;
    case 3:
    case 4:
      return "Você não pode circular na terça-feira";
      break;
    case 5:
    case 6:
      return "Você não pode circular na quarta-feira";
      break;
    case 7:
    case 8:
      return "Você não pode circular na quinta-feira";
      break;
    case 9:
      return "Você não pode circular na sexta-feira";
      break;
    default:
      return "Número invalido";
  }

  return placa;
}