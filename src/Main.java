//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        document d = new document("hhh",1,10);
        document d1 = new document("bbb",2,15);
        article a = new article("aaa",3,10,"ahmed");
        article a1 = new article("ttt",4,5,"tez");
        livre l = new livre("poo",5,20,"ahmed","tez");
        periodique p =new periodique("bdd",6,15,156);
        biblio b = new biblio(1000);
        int n = b.getCapacite();
        System.out.println("capacite de biblio = "+n);
        b.ajoutdoc(d);
        b.ajoutdoc(d1);
        b.ajoutdoc(a);
        b.ajoutdoc(a1);
        b.ajoutdoc(l);
        b.ajoutdoc(p);
        int nbdoc = b.getNbdoc();
        System.out.println("nb doc = "+nbdoc);
        biblio b1 = new biblio(1000);
        b1 = b.listelivre();
        System.out.println("liste livre:");
        b1.inventairedoc();
        b1 = b.listedocsimple();
        System.out.println("liste des doc");
        b1.inventairedoc();
        b1 = b.listearticle();
        System.out.println("liste article");
        b1.inventairedoc();
        System.out.println("liste des periodiques");
        b1 = b.listeper();
        b1.inventairedoc();



    }
}