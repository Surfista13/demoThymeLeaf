package fr.eni.demothymeleaf.config;

import fr.eni.demothymeleaf.bo.Bibliotheque;
import fr.eni.demothymeleaf.bo.Livre;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BiblioConfig {
    @Bean
    public Bibliotheque bibliotheque() {
        Livre livre1 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", 688,1);
        Livre livre2 = new Livre("Fleur du mal", "Baudelaire", 500,2);
        List<Livre> liste = new ArrayList<>();
        liste.add(livre1);
        liste.add(livre2);
        return new Bibliotheque(liste);
    }

}
