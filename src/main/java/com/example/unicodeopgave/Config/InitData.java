package com.example.unicodeopgave.Config;

import com.example.unicodeopgave.Repository.UnicodeRepo;
import com.example.unicodeopgave.Model.Unicode;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class InitData implements CommandLineRunner {

    private final UnicodeRepo unicodeRepository;

    public InitData(UnicodeRepo unicodeRepository) {
        this.unicodeRepository = unicodeRepository;
    }

    @Override
    public void run(String... args) {
        Set<Character> chars = Set.of('Æ', 'ø', 'å', 'Ω', '你');

        saveUnicodeChars(chars);
    }

    // Metoden som gemmer alle karakterer i databasen
    public void saveUnicodeChars(Set<Character> chars) {
        for (Character c : chars) {
            Unicode u = new Unicode(
                    (int) c,
                    c,
                    "Mit yndlingsbogstav: " + c
            );
            unicodeRepository.save(u);
        }
    }
}
