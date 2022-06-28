package entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
public class Adresse {

    @Column(name = "NUMERO", length = 30, nullable = false)
    private int numero;
    @Column(name = "RUE", length = 30, nullable = false)
    private String rue;
    @Column(name = "CODE_POSTAL", length = 5, nullable = false)
    private int CodePostal;
    @Column(name = "VILLE", length = 30, nullable = false)
    private String ville;


    public Adresse() {
    }

    public Adresse(int numero, String rue, int codePostal, String ville) {
        this.numero = numero;
        this.rue = rue;
        CodePostal = codePostal;
        this.ville = ville;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public int getCodePostal() {
        return CodePostal;
    }

    public void setCodePostal(int codePostal) {
        CodePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Adresse{");
        sb.append("numero=").append(numero);
        sb.append(", rue='").append(rue).append('\'');
        sb.append(", CodePostal=").append(CodePostal);
        sb.append(", ville='").append(ville).append('\'');
        sb.append(", codePostal=").append(getCodePostal());
        sb.append('}');
        return sb.toString();
    }
}
