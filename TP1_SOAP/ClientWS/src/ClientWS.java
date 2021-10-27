import proxy.BanqueService;
import proxy.BanquesWS;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy = new BanquesWS().getBanqueServicePort();
        System.out.println(proxy.conversionEuroToDH(800));
        Compte cp=proxy.getCompte(2L);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
        List<Compte> cpts=proxy.listComptes();
        cpts.forEach(compte -> {
            System.out.println("------------------------------");
            System.out.println("Code: "+ compte.getCode());
            System.out.println("Solde:  " +compte.getSolde());
        });
    }
}
