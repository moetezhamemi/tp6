public class periodique extends document {
    private float freq;
    public periodique(String t,int id,int nb,float f)
    {
        super(t,id,nb);
        freq = f;
    }
    public float getFreq() {
        return freq;
    }

    public void setFreq(float freq) {
        this.freq = freq;
    }
    public void edition()
    {
        System.out.println((" type:periodique"));
        System.out.println(" titre:"+getTitre()+" id:"+getId()+" nbpages = "+ getNbpages());
        System.out.println(" freq:"+getFreq());
    }
}
