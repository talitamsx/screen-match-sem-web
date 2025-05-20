package br.com.alura.screenmatch.service;

public interface IConverteDados {
    //em java podemos usar <T> quando iremos retornar um tipo de dado, do qual não sabemos
    <T> T obterDados(String json, Class<T> classe);
}

//essa interface é um cabeçalho
//IConverteDados irá receber um json que é uma String
//Vai receber uma classe
//No conversor de dados, ira transformar o json na classe indicada