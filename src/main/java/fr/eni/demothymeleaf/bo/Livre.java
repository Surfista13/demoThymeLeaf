package fr.eni.demothymeleaf.bo;

public class Livre {
    private long id;
    private String titre;
    private String auteur;
    private int nbPages;

    public Livre() {
    }
    public Livre(String titre, String auteur, int nbPages,long id) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbPages = nbPages;
        this.id = id;
    }

    public Livre(String titre, String auteur, int nbPages) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbPages = nbPages;
    }

    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getNbPages() {
        return nbPages;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }
}
