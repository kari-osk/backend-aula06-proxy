package service;

import java.util.Locale;

public class Serie implements ISerie{

    public String getSerie(String nome) {
        String link;
        link = "www."+ nome.replace(" ", "").toLowerCase();
        return link;
    }
}
