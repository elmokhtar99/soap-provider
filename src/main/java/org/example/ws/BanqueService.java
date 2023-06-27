package org.example.ws;


import org.example.metier.Compte;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.Date;
import java.util.List;
@WebService(name = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "ConvertionEuroToDH")
    public double conversion(@WebParam(name = "montant") double mt){
        return mt * 2;
    }
    @WebMethod(operationName = "getCompte")
    public Compte getCompte(@WebParam(name = "code") int code){
        return new Compte(code,Math.random() * 9999, new Date());
    }
    @WebMethod
    public List<Compte> listeCompte(){
        return  List.of(
                new Compte(1,Math.random() * 9999, new Date()),
                new Compte(2,Math.random() * 9999, new Date()),
                new Compte(3,Math.random() * 9999, new Date())
        );
    }
}
