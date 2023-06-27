package org.example.metier;


import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
@XmlRootElement(name = "compte")
public class Compte {
    private int code;
    private double solde;
    private Date dateCreation;

    public Compte(){
        super();
    }

    public Compte(int code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public double getSolde() {
        return solde;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
