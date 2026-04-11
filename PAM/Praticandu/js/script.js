import { calculoMedia, statusAluno } from "./operacao.js"

// aqui o codigo seleciona somente o que ele vai usar, no caso os elementos da tabela
let tr = document.querySelectorAll("tbody tr")
console.log(tr)

for (let i = 0; i < tr.length; i++) {
  // criação do vetor do aluno com nota1,2,3 media e status
  let aluno = tr[i].children

  let nota1 = parseFloat(aluno[1].textContent)
  let nota2 = parseFloat(aluno[2].textContent)
  let nota3 = parseFloat(aluno[3].textContent)

  let tdStatus = aluno[5]

  // calculo da media e status do aluno usando import/export
  let media = calculoMedia(nota1, nota2, nota3)
  let tdMedia = aluno[4]
  console.log(media)
  tdMedia.textContent = media.toFixed(2)

  let status = statusAluno(media, tdStatus)
}
