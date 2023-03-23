package fr.eni.demothymeleaf.controller;

import fr.eni.demothymeleaf.bo.Bibliotheque;
import fr.eni.demothymeleaf.bo.Livre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class LivreController {

    private final Bibliotheque bibliotheque;

    @Autowired
    public LivreController(Bibliotheque bibliotheque) {
        this.bibliotheque = bibliotheque;
    }


    @GetMapping("/")
    public String accueil() {
        return "accueil";
    }

    @GetMapping ("/livres")
    public String livres(Model model) {
        model.addAttribute("livres", bibliotheque.getLivres());
        return "livres";
    }

    @GetMapping ("/pasdelivre")
    public String pasdelivre(Model model) {
        model.addAttribute("livres", new ArrayList<Livre>());
        return "livres";
    }

}
