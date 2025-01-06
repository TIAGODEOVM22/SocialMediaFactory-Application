# SocialMediaFactory-Application
Este repositório demonstra a aplicação do padrão Factory em Java para a criação de instâncias de diferentes redes sociais, como Facebook, LinkedIn e Twitter, de forma flexível e escalável.

## Descrição

O padrão Factory é usado para centralizar a criação de objetos em uma única classe, conhecida como Factory, que cria instâncias de classes com base em uma entrada fornecida. Nesta aplicação, temos uma `SocialMediaFactory` que retorna diferentes implementações da interface `SocialMedia` dependendo do tipo de rede social solicitado.

### Estrutura do Projeto

- **SocialMedia**: Interface que define o método `post` para fazer publicações.
- **Facebook, LinkedIn, Twitter**: Classes que implementam a interface `SocialMedia`, cada uma com uma implementação específica do método `post`.
- **SocialMediaFactory**: Classe que recebe um tipo de rede social e retorna a instância correspondente de `SocialMedia`.
- **Usuario**: Classe que representa o usuário que está utilizando as redes sociais.
- **Main**: Ponto de entrada da aplicação, onde a lógica de uso da `SocialMediaFactory` é demonstrada.

## Como Usar

1. Clone este repositório:

   ```bash
   git clone https://github.com/seu-usuario/socialmedia-factory.git
   ```

2. Navegue até o diretório do projeto:

   ```bash
   cd socialmedia-factory
   ```

3. Compile e execute a aplicação:

   ```bash
   javac *.java
   java Main
   ```

## Exemplo de Uso

O código a seguir demonstra como usar a `SocialMediaFactory` para criar diferentes redes sociais e fazer publicações:

```java
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
```

## Tecnologias Utilizadas

- Java
- Padrão de Projeto Factory

## Contribuição

Sinta-se à vontade para abrir issues e pull requests para melhorar esta aplicação. Toda contribuição é bem-vinda!

## Licença

Este projeto é de domínio público e pode ser usado, modificado e distribuído livremente por qualquer pessoa.

## Contato

- **Autor**: Tiago de Oliveira Villalva Morel
- **E-mail**: tiagodeoliveiravillalva@gmail.com
- **LinkedIn**: [Seu Perfil]https://www.linkedin.com/in/tiago-oliveira-java/

---

Esperamos que este exemplo ajude a compreender a implementação do padrão Factory em Java!


