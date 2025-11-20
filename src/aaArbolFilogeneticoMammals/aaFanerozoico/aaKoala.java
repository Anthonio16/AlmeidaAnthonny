package aaArbolFilogeneticoMammals.aaFanerozoico;

import aaArbolFilogeneticoMammals.aaProterozoico.aaAmniota;

public class aaKoala extends aaAmniota implements aaIMammals, aaISaludable {

    private String aaName;

    public aaKoala(String aaName) {
        super();
        this.aaName = aaName;

        System.out.println("               |");
        System.out.println("               |-- ::aaMammals");

        System.out.println("                  |");
        System.out.println("                  |-- ::" + aaName);
    }

    public String getAaName() {
        return aaName;
    }

    // De aaIMammals
    @Override
    public String aaGetClase() {
        return "Mammals";
    }

    // De aaISaludable
    @Override
    public String aaSaludar() {
        return aaName + " saludando a todos";
    }

    @Override
    public String aaSaludar(String aaReceptor) {
        return aaName + " saludando a " + aaReceptor;
    }

    public void aaImprimirJerarquia() {
        new aaKoala(this.aaName);
    }
}


