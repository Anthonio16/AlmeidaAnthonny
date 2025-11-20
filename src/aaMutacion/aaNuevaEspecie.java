package aaMutacion;

public class aaNuevaEspecie {

    private String aaNombreEspecie;

    public aaNuevaEspecie(String aaNombreEspecie) {
        this.aaNombreEspecie = aaNombreEspecie;
    }

    public String getAaNombreEspecie() {
        return aaNombreEspecie;
    }

    @Override
    public String toString() {
        return aaNombreEspecie;
    }
}


