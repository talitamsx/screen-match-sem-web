package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//do tipo Recor, porque só quero pegar e dados e repassar
//JasonAlias é como se fosse o apelido, a aplicação busca o nome dentro da api e retorna com o nome que foi dado
//no caso na API esta title, e na minha aplicação mostra como titulo

//Ignora tudo o que não estiver mapeado
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao,
                         @JsonAlias("Genre") String genero,
                         @JsonAlias("Actors") String atores,
                         @JsonAlias("Poster") String poster,
                         @JsonAlias("Plot") String sinopse) {
}
