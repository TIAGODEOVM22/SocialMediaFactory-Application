package br.com.tiago;

public class Twitter implements SocialMedia {
    private final Usuario usuario;

    public Twitter(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public void post(String message) {
        System.out.println(usuario.getNome() + " está postando no Twitter: " + message);
    }
}