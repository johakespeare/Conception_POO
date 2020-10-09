package personne;

import java.util.GregorianCalendar;

public class TestPersonne {

    public static void main(String[] args){

      Adresse Ad1 = new Adresse(20,"Allée des Jambons","20600","Bastia");
      Adresse Ad2 = new Adresse(10,"Rue des Lilas","28400","Aitbas");
      Adresse Ad3 = new Adresse(16,"Place des Roses","14500","Mortyr");
      Adresse Ad4 = new Adresse(8,"Marche de la rue verte","29630","Polytuc");


      Manager M = new Manager("Lyniac","Cyril", new GregorianCalendar(1990,10,19),Ad2,3600,new GregorianCalendar(2019,10,19));
      Manager M2 = new Manager("Malodes","Patrick", new GregorianCalendar(1994,10,19),Ad2,3600,new GregorianCalendar(2016,10,19));
      Secretaire S = new Secretaire("Lokal","Sebastiens", new GregorianCalendar(1995,10,19),Ad2,3600,new GregorianCalendar(2016,10,19));

      System.out.println(S);
      System.out.println(M);
      System.out.println(M2+"\n");
      System.out.println(S.getManagers());
      S.addManager(M);
      System.out.println(S.getManagers());
      S.addManager(M2);
      System.out.println(S.getManagers());
      S.delManager(M2);
      System.out.println(S.getManagers());
      System.out.println(S.getSalaire());
      S.augmenterLeSalaire(50);
      System.out.println(S.getSalaire());


    }
}
