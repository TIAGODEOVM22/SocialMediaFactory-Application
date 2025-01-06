package br.com.tiago;

public class Main {

    public static void main(String[] args) {

        // Criando um usuário
        Usuario usuario = new Usuario("Maria");

        // Criando a fábrica com o usuário injetado
        SocialMediaFactory factory = new SocialMediaFactory(usuario);

        // Criando instâncias das redes sociais
        SocialMedia linkedin = factory.getSocialMedia("linkedin");
        linkedin.post("Atualização profissional!");

        SocialMedia facebook = factory.getSocialMedia("facebook");
        facebook.post("Compartilhando momentos!");

        SocialMedia twitter = factory.getSocialMedia("twitter");
        twitter.post("Comentando sobre notícias!");
    }
}

    //Esse padrão é útil para encapsular a lógica de criação e facilitar a adição de novas redes sociais
    // no futuro sem alterar o código do cliente
    // sempre que eu precisar adicionar uma nova rede social eu venho aqui.

