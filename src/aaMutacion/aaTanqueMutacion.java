package aaMutacion;

import java.util.Random;

public class aaTanqueMutacion implements aaIA {

    @Override
    public String aaMutar(String aaNombreAnimal) {
        // Nuevo nombre = Animal + Apellido
        return aaNombreAnimal + "Almeida";
    }

    // Ahora devuelve una aaNuevaEspecie
    public aaNuevaEspecie aaProcesarMutacion(String aaNombreAnimal, Runnable aaJerarquia) {

        Random aaRandom = new Random();
        int aaRadiacion = aaRandom.nextInt(901) + 100; // 100–1000

        System.out.println("\nMutación en proceso: __________________  "
                + aaRadiacion + " de 876 (mSv)");

        if (aaRadiacion <= 876) {

            // Mostrar nuevamente el árbol
            aaJerarquia.run();

            // Nombre de la nueva especie
            String aaNombreNueva = aaMutar(aaNombreAnimal);

            // Crear objeto de nueva especie
            aaNuevaEspecie aaEspecie = new aaNuevaEspecie(aaNombreNueva);

            // Mostrar en la jerarquía
            System.out.println("                     |-- " + aaEspecie);

            return aaEspecie;

        } else {
            System.out.println("Mutación fallida");
            return null;   // No hay nueva especie
        }
    }
}

