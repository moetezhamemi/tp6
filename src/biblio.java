public class biblio {
    private document[] listdoc;
    private int nbdoc;
    private int capacite;

    public biblio(int cap) {
        capacite = cap;
        nbdoc = 0;
        listdoc = new document[cap];
    }

    public document[] getListdoc() {
        return listdoc;
    }

    public int getNbdoc() {
        return nbdoc;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public void setListdoc(document[] listdoc) {
        this.listdoc = listdoc;
    }
    void ajoutdoc(document d) {
        if (nbdoc == capacite) {
            System.out.println("La capacité maximale est atteinte. Impossible d'ajouter plus de documents.");
            return;
        }
        int i = 0;
        while (i < nbdoc && listdoc[i].getId() < d.getId()) {
            i++;
        }
        for (int j = nbdoc; j > i; j--) {
            listdoc[j] = listdoc[j - 1];
        }
        listdoc[i] = d;
        nbdoc++;
    }
    void suppdoc(int n) {
        int i = 0;
        boolean trouve = false;
        while (i < nbdoc && !trouve) {
            if (listdoc[i].getId() == n) {
                trouve = true;
            } else {
                i++;
            }
        }

        if (trouve) {
            for (int j = i; j < nbdoc - 1; j++) {
                listdoc[j] = listdoc[j + 1];
            }
            nbdoc--;
        } else {
            System.out.println("Document non trouvé.");
        }
    }
    void inventairedoc() {
        for (int i = 0; i < nbdoc; i++) {
            listdoc[i].edition();
        }
    }
    biblio listelivre() {
        biblio b = new biblio(1000);
        for (int i = 0; i < nbdoc; i++) {
            if (listdoc[i] instanceof livre) {
                b.ajoutdoc(listdoc[i]);
            }
        }
        return b;
    }
    biblio listearticle() {
        biblio b = new biblio(1000);
        for (int i = 0; i < nbdoc; i++) {
            if (listdoc[i] instanceof article && !(listdoc[i] instanceof livre)) {
                b.ajoutdoc(listdoc[i]);
            }
        }
        return b;
    }
    biblio listedocsimple() {
        biblio b = new biblio(1000);
        for (int i = 0; i < nbdoc; i++) {
            if (listdoc[i] instanceof document && !(listdoc[i] instanceof article || listdoc[i] instanceof livre)) {
                b.ajoutdoc(listdoc[i]);
            }
        }
        return b;
    }
    biblio listeper() {
        biblio b = new biblio(1000);
        for (int i = 0; i < nbdoc; i++) {
            if (listdoc[i] instanceof periodique) {
                b.ajoutdoc(listdoc[i]);
            }
        }
        return b;
    }
}
