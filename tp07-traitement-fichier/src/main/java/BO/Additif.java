package BO;

public class Additif {

    private String code;

    private String nom;

    public Additif() {
    }

    public Additif(String code, String nom) {
        this.code = code;
        this.nom = nom;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Additif{");
        sb.append("code='").append(code).append('\'');
        sb.append(", nom='").append(nom).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
