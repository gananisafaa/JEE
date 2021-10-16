package metier;

import java.util.Date;

public class Compte {
    private Long code;
    private double solde;
    private Date dateCreation;

    public Compte(Long code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public Compte() {
    }

    public Long getCode() {
        return code;
    }
}
