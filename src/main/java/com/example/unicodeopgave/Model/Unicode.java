package com.example.unicodeopgave.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Unicode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int unicode;
    private char bogstav;
    private String description;

    public Unicode() {}

    public Unicode(int unicode, char bogstav, String description) {
        this.unicode = unicode;
        this.bogstav = bogstav;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public int getUnicode() {
        return unicode;
    }

    public void setUnicode(int unicode) {
        this.unicode = unicode;
    }

    public char getBogstav() {
        return bogstav;
    }

    public void setBogstav(char bogstav) {
        this.bogstav = bogstav;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
