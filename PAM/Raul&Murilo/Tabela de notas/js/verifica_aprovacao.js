export function verifica_aprovacao(mediaValor) {
  if (mediaValor <= 4) {
    return "Reprovado";
  } else if (mediaValor <= 6) {
    return "Em recuperação";
  } else {
    return "Aprovado";
  }
}
