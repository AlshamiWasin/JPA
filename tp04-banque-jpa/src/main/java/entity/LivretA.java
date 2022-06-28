package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="livretA")
public class LivretA extends Compte{

    @Column(name = "TAUX", length = 30, nullable = false)
    private Double taux;


    public LivretA(String numero, Double solde, List<Client> clients, List<Operation> operations, Double taux) {
        super(numero, solde, clients, operations);
        this.taux = taux;
    }
}
