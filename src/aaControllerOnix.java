import aaArbolFilogeneticoMammals.aaFanerozoico.aaKoala;
import aaMutacion.aaTanqueMutacion;
import aaMutacion.aaNuevaEspecie;

public class aaControllerOnix {

    public void aaRun() throws InterruptedException {

        System.out.println("== Iniciando sistema aaAppOnix ==");

        aaWaitingAnimation(); // animación o0o 0%–100%

        // Crear koala
        aaKoala aaMiKoala = new aaKoala("Koala");

        // Polimorfismo
        System.out.println("\n--- POLIMORFISMO ---");
        System.out.println(aaMiKoala.aaSaludar());
        System.out.println(aaMiKoala.aaSaludar("Anthonny"));

        // Mutación
        aaTanqueMutacion aaTanque = new aaTanqueMutacion();

        aaNuevaEspecie aaEspecie = aaTanque.aaProcesarMutacion(
                aaMiKoala.getAaName(),
                () -> aaMiKoala.aaImprimirJerarquia()
        );

        if (aaEspecie != null) {
            System.out.println("\nNueva especie creada: "
                    + aaEspecie.getAaNombreEspecie());
        } else {
            System.out.println("\nNo se creó una nueva especie.");
        }

        System.out.println("\n== Fin de aaAppOnix ==");
    }

    // Animación o0o de 0% a 100% (cédula impar)
    private void aaWaitingAnimation() throws InterruptedException {

        String[] aaFrames = {"o0o", "0o0"};  // ida y vuelta

        for (int aaPorcentaje = 0; aaPorcentaje <= 100; aaPorcentaje += 10) {
            String aaFrame = aaFrames[(aaPorcentaje / 10) % aaFrames.length];
            System.out.print("\r" + aaFrame + "   " + aaPorcentaje + "%");
            Thread.sleep(200);
        }
        System.out.println();
    }
}
