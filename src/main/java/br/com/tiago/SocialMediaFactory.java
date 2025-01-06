package br.com.tiago;

public class SocialMediaFactory {
    private final Usuario usuario;

    public SocialMediaFactory(Usuario usuario) {
        this.usuario = usuario;
    }

    public SocialMedia getSocialMedia(String type) {
        return switch (type.toLowerCase()) {
            case "facebook" -> new Facebook(usuario);
            case "linkedin" -> new Linkedin(usuario);
            case "twitter" -> new Twitter(usuario);
            default -> throw new IllegalArgumentException("Tipo de rede social desconhecida");
        };
    }
}