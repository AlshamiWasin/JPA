package BO;

public class Marque {

    private String nom;

    public Marque() {
    }

    public Marque(String nom) {
        this.nom = nom;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Marque{");
        sb.append("nom='").append(nom).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
