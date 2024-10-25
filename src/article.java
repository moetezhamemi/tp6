public class article extends document {
     private String noma;
     public  article(String t,int id , int nbp,String nom)
     {
         super(t,id,nbp);
         this.noma = nom;
     }

    public String getNoma() {
        return noma;
    }

    public void setNoma(String noma) {
        this.noma = noma;
    }
    public void edition()
    {
        System.out.println(" type: article:"+" titre:"+getTitre()+" id:"+getId()+" nbpages = "+ getNbpages());
        System.out.println(" nom auteur:"+getNoma());
    }
}


