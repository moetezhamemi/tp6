public class livre extends  article {
    private  String editeur;
    public livre(String t,int id , int nbp,String nom,String e)
    {
        super(t,id,nbp,nom);
        editeur = e;
    }
    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }
    public void edition()
    {
        System.out.println(" type : livre"+" titre:"+getTitre()+" id:"+getId()+" nbpages = "+ getNbpages());
        System.out.println(" nom auteur:"+getNoma());
        System.out.println(" editeur:"+getEditeur());
    }
}
