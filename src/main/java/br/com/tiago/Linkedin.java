package br.com.tiago;

public class Linkedin implements SocialMedia {
    private final Usuario usuario;

    public Linkedin(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public void post(String message) {
        System.out.println(usuario.getNome() + " está postando no Linkedin: " + message);
    }
}