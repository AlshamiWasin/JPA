package BO;

public class Allergene {

    private String nom;

    public Allergene() {
    }

    public Allergene(String nom) {
        this.nom = nom;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Allergene{");
        sb.append("nom='").append(nom).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
