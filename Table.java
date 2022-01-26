package com.company;

public class Table {

    double hight;
    double width;
    double depth;
    double area;
    private static int nrTableObjects=0;

    public Table(double hight, double width, double depth, int nrLegs) {

        desktopArea(hight, width);
        wieVielTisch();

    }

    public double desktopArea(double hight, double width) {

        area = hight*width;
        System.out.println(area+"m²");
        maximumSeats(area);
        return area;
    }

    public int maximumSeats(double area) {
        double platz = area/1;
        int platze = (int)Math.ceil(platz);
        System.out.println("Dieser Tisch hat platz für "+platze+" Personen.");
        return (int) Math.ceil(platz);
    }
    public int wieVielTisch() {
        nrTableObjects++;
        if(nrTableObjects<=1)
        System.out.println(nrTableObjects+" Tisch");
        else {
            System.out.println(nrTableObjects + " Tische");
        }
            return nrTableObjects;
    }



}
