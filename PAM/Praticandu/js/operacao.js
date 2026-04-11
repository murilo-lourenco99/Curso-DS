export function calculoMedia(nota1, nota2, nota3) {
  let media = (nota1 + nota2 + nota3) / 3;
  return media;
}

export function statusAluno(media, Status) {
  if (media < 4) {
    Status.textContent = "Reprovado";
  } else if (media < 6) {
    Status.textContent = "Recuperação";
  } else {
    Status.textContent = "Aprovado";
  }
}
