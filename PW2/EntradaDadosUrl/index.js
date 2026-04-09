import express, { request, response } from "express";
import { concatenacao_string } from "./concatenacao_string.js";
import { declaracao_variaveis } from "./declaracao_de_variveis.js";
import { switch_case } from "./estrutura_condicional_case.js";
import { if_else } from "./estrutura_condicional_if_else.js";
import { do_while } from "./estrutura_repeticao_do_while.js";
import { laco_for } from "./estrutura_repeticao_for.js";
import { laco_while } from "./estrutura_repeticao_while.js";
import { vetor_array } from "./estrutura_vetor_ou_array.js";
import { vetor_forEach } from "./forEach.js";
import { uso_map } from "./map.js";
import { soma } from "./soma.js";
import { subtracao } from "./subtracao.js";
import { divisao } from "./divisao.js";
import { multiplicacao } from "./multiplicacao.js";
import { resto } from "./resto.js";
import { raiz } from "./raiz.js";
import { potencia } from "./potencia.js";
import { vetor_busca } from "./busca.js";
import { vetor_adicao } from "./vetor_adicao.js";
import { vetor_remocao } from "./vetor_remocao.js";
import { vetor_acumulacao } from "./acumulacao.js";

const app = express();

// PARAMS
// localhost:67/concatenacao_string/Ramera

app.get("/concatenacao_string/:nome", (req, res) => {
  let { nome } = req.params;
  let apresenta_string = concatenacao_string(nome);

  res.send(apresenta_string);
});

//IMC
// localhost:67/declaracao_variaveis/12/1.81/Caca/1234567890

app.get("/declaracao_variaveis/:peso/:altura/:nome/:cpf", (req, res) => {
  let { peso, altura, nome, cpf } = req.params;
  let apresentar_variavel = declaracao_variaveis(peso, altura, nome, cpf);

  res.send(apresentar_variavel);
});

//Switch Case
// localhost:67/switch_case/2

app.get("/switch_case/:placa", (req, res) => {
  let { placa } = req.params;
  let show_case = switch_case(placa);

  res.send(show_case);
});

// if-else
// localhost:67/if_else/gato

app.get("/if_else/:animal", (req, res) => {
  let { animal } = req.params;
  let apresentar_animal = if_else(animal);

  res.send(apresentar_animal);
});

// QUERY-STRING

// do-while
// localhost:67/do_while?numero=3

app.get("/do_while", (req, res) => {
  let { numero } = req.query;
  let apresenta_do_while = do_while(numero);

  res.send(apresenta_do_while);
});

// for
// localhost:67/laco_for?resultado=5

app.get("/laco_for", (req, res) => {
  let { resultado } = req.query;
  let apresenta_for = laco_for(resultado);

  res.send(apresenta_for);
});

// while: 1 a 100
// localhost:67/laco_while

app.get("/laco_while", (req, res) => {
  let { i = 1 } = req.query;
  let apresenta_while = laco_while(i);

  res.send(apresenta_while);
});

// array: ranking livros
// localhost:67/vetor_array?livro=HarryPotter,GuiaMochileiro,Fnaf

app.get("/vetor_array", (req, res) => {
  let { livro } = req.query;
  let apresenta_array = vetor_array(livro);

  res.send(apresenta_array);
});

// ForEach: cores
// localhost:67/vetor_forEach?cores=Azul,Vermelho,Rosa

app.get("/vetor_forEach", (req, res) => {
  let { cores } = req.query;
  let apresenta_forEach = vetor_forEach(cores);

  res.send(apresenta_forEach);
});

// map: calculo de numeros ao cubo
// localhost:67/uso_map?numeros=9,2,3,4,5

app.get("/uso_map", (req, res) => {
  let { numeros } = req.query;
  let apresentar_map = uso_map(numeros);

  res.send(apresentar_map);
});

// operações aritmeticas: soma
// localhost:67/soma?num1=5&num2=10

app.get("/soma", (req, res) => {
  let { num1, num2 } = req.query;
  let apresentar_soma = soma(num1, num2);

  res.send(apresentar_soma);
});

// subtração
// localhost:67/subtracao?num1=100&num2=50

app.get("/subtracao", (req, res) => {
  let { num1, num2 } = req.query;
  let apresenta_subtracao = subtracao(num1, num2);
  res.send(apresenta_subtracao);
});

// divisão
// localhost:67/divisao?num1=20&num2=5

app.get("/divisao", (req, res) => {
  let { num1, num2 } = req.query;
  let apresenta_divisao = divisao(num1, num2);
  res.send(apresenta_divisao);
});

// multiplicação
// localhost:67/multiplicacao?num1=2&num2=5

app.get("/multiplicacao", (req, res) => {
  let { num1, num2 } = req.query;
  let apresenta_multiplicacao = multiplicacao(num1, num2);
  res.send(apresenta_multiplicacao);
});

// resto
// localhost:67/resto?num1=10&num2=3

app.get("/resto", (req, res) => {
  let { num1, num2 } = req.query;
  let apresenta_resto = resto(num1, num2);
  res.send(apresenta_resto);
});

// raiz
// localhost:67/raiz?numero=16

app.get("/raiz", (req, res) => {
  let { numero } = req.query;
  let apresenta_raiz = raiz(numero);
  res.send(apresenta_raiz);
});

// potencia
// localhost:67/potencia?base=2&expoente=3

app.get("/potencia", (req, res) => {
  let { base, expoente } = req.query;
  let apresenta_potencia = potencia(base, expoente);
  res.send(apresenta_potencia);
});

// vetor busca
// localhost:67/vetor_busca?numeros=1,2,3,4,5&busca=2

app.get("/vetor_busca", (req, res) => {
  let { numeros, busca } = req.query;
  let apresenta_vetor_busca = vetor_busca(numeros, busca);
  res.send(apresenta_vetor_busca);
});

// vetor de adição
// localhost:67/vetor_adicao?numeros=1,2,3&adiciona=4

app.get("/vetor_adicao", (req, res) => {
  let { numeros, adiciona } = req.query;
  let apresenta_vetor_adicao = vetor_adicao(numeros, adiciona);
  res.send(apresenta_vetor_adicao);
});

// vetor de remoção
// localhost:67/vetor_remocao?numeros=1,2,3,4,5&remove=3

app.get("/vetor_remocao", (req, res) => {
  let { numeros, remove } = req.query; 
  let apresenta_vetor_remocao = vetor_remocao(numeros, remove);
  res.send(apresenta_vetor_remocao);
});

// vetor de acumulação
// localhost:67/vetor_acumulacao?numeros=2,3,4

app.get("/vetor_acumulacao", (req, res) => {
  let { numeros } = req.query;
  let apresenta_vetor_acumulacao = vetor_acumulacao(numeros);
  res.send(apresenta_vetor_acumulacao);
});

app.listen(67, () => {
  console.log("\nServidor rodando normalmente");
});

// Holter
