package main.charts;
import main.charts.OperationJSONUtente;

public class TestJson {
    
    public static void proviamo() {
        OperationJSONUtente prova = new OperationJSONUtente();

        if (prova.userExist("Gin")==true) {
            System.out.println("utente esiste");
            System.out.println("controllo riuscito");
        } else {
            System.out.println("controllo fallito");
        }
        if (prova.userPasswordCheck("Gin","cacca")==true) {
            System.out.println("utente password corretti");
            System.out.println("controllo riuscito");
        } else {
            System.out.println("controllo fallito");
        }
        if (prova.userPasswordCheck("Gin","merda")==false) {
            System.out.println("utente corretto password sbagliata ");
            System.out.println("controllo riuscito");
        } else {
            System.out.println("controllo fallito");
        }
        //prova.initializeUser("mario", "super", "luigi", "super@mario.cart", "marioEluigi");
        if (prova.userPasswordCheck("luigi","marioEluigi")==true) {
            System.out.println("il file è cambiato ma non lo leggo ");
            System.out.println("controllo riuscito");
        } else {
            System.out.println("controllo fallito");
        }
        prova.initializeUser("han", "solo", "jedy", "han@solo.jedy", "starwars");
        if (prova.userPasswordCheck("luigi","marioEluigi")==true) {
            System.out.println("il file è cambiato ma non lo leggo ");
            System.out.println("controllo riuscito");
        } else {
            System.out.println("controllo fallito");
        }
        if (prova.userPasswordCheck("jedy","starwars")==true) {
            System.out.println("il file è cambiato ma non lo leggo ");
            System.out.println("controllo riuscito");
        } else {
            System.out.println("controllo fallito");
        }
        System.out.println("nuovo conto");
        prova.newBanckAccount("jedy","STAR BANK");
        System.out.println("altro nuovo conto");
        prova.newBanckAccount("jedy","banca dei ribelli");
        System.out.println("nuova operazione");
        prova.newBanckTransaction("jedy","STAR BANK", "acquisto millennium falco", -10000.56, "16/08/2022", "04:22");
        System.out.println("altra nuova operazione");
        prova.newBanckTransaction("jedy","STAR BANK", "blaster", -100, "17/08/2022", "00:22");
    }

    

}