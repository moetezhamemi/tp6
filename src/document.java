public class document {
    private String titre;
    private int id;
    private int nbpages;
    public document(String t,int id,int nb)
    {
        titre = t;
        this.id = id;
        nbpages = nb;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbpages() {
        return nbpages;
    }

    public void setNbpages(int nbpages) {
        this.nbpages = nbpages;
    }
    public void edition()
    {
        System.out.println(("type:document "));
        System.out.println("titre:"+getTitre()+" id:"+getId()+" nbpages = "+ getNbpages());

    }
}
