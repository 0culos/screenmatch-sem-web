package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/*
 * Record para receber os dados da série
 * 
 * A anotação @JsonAlias mapeia o valor do campo do json recebido no parâmetro ao atributo de 
 * classe desejado ao desserializar (ex.: @JsonAlias("Title") -> String titulo)
 * 
 * Já a anotação @JsonProperty define um novo nome para o campo do json que será serializado 
 * (ex.: String titulo -> @JsonProperty("Title"))
 * 
 * 
 * A anotação @JsonIgnoreProperties ignora tudo o que não foi mapeado pela classe/record
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
        @JsonAlias("totalSeasons") Integer totalTemporadas,
        @JsonAlias("imdbRating") String avaliacao) {
}
