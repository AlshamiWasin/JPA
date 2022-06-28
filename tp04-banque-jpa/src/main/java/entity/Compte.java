package entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="compte")
public class Compte {

    @Id
    @Column(name = "numero", length = 30, nullable = false)
    private String numero;

    @Column(name = "SOLDE_COMPTE", length = 30, nullable = false)
    private Double solde;

    @ManyToMany(mappedBy="comptes" ,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<Client> clients;

    @ManyToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<Operation> operations;


    public Compte() {
    }

    public Compte(String numero, Double solde, List<Client> clients, List<Operation> operations) {
        this.numero = numero;
        this.solde = solde;
        this.clients = clients;
        this.operations = operations;
    }

    public Compte(Double solde, List<Client> clients, List<Operation> operations) {
        this.setSolde(solde);
        this.setClients(clients);
        this.setOperations(operations);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Compte{");
        sb.append(", numero='").append(numero).append('\'');
        sb.append(", solde=").append(solde);
        sb.append(", clients=").append(clients);
        sb.append('}');
        return sb.toString();
    }
}
