package com.company;

import java.time.LocalDate;

public class Rolex {
    LocalDate modellJahr;
    String modell;
    int garantie;
    boolean mitDatumsAnzeige;



    public Rolex(LocalDate modellJahr, String modell,int garantie,boolean mitDatumsAnzeige) {
        System.out.println(modellJahr);
        System.out.println(modell);
        System.out.println(garantie);
        System.out.println(mitDatumsAnzeige);
    }


}
