package entity;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {

    private int numero;
    private String rue;
    private int CodePostal;
    private String ville;


}
