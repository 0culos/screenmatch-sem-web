package br.com.alura.screenmatch.service;

public interface IConverteDados {
    
    /*
     * Aqui é usada a implementalção do Generics do Java, onde o tipo que é devolvido no retorno pode ser qualquer um.
     * Esse padrão é definido pelas indicações <T> T, representando a generalidade do tipo e também é declarado
     * como parâmetro uma Classe de tipo genérica (Classe <T>), representando a generalidade da classe que será utilizada
     */
    <T> T obterDados(String json, Class<T> classe);
}
