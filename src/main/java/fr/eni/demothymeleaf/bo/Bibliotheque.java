package fr.eni.demothymeleaf.bo;

import java.util.List;

public class Bibliotheque {
    private List<Livre> livres;

    public Bibliotheque() {
    }

    public Bibliotheque(List<Livre> livres) {
        this.livres = livres;
    }

    public List<Livre> getLivres() {
        return livres;
    }

    public void setLivres(List<Livre> livres) {
        this.livres = livres;
    }
    public void ajoutLivre(Livre livre){
        this.livres.add(livre);
    }
}
