//mensagem de alerta
alert('Hello world');

let msg = 'Hello world 2.0';
console.log(msg);

//Entrada direto no navegador
let nome = prompt('olá, diga seu nome');
console.log('Seja bem vindo' + nome);

// seletor de tag
let body = document.querySelector('body');
console.log(body);
// seletor de class (.)
let titulo = document.querySelector('.titulo');
// seletor de id (#)
let texto = document.querySelector('#texto');

// inserir texto em variavel
titulo.textContent = 'Minha primeira aula em js';