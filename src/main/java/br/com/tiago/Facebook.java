package br.com.tiago;

public class Facebook implements SocialMedia {
    private final Usuario usuario;

    public Facebook(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public void post(String message) {
        System.out.println(usuario.getNome() + " está postando no Facebook: " + message);
    }
}