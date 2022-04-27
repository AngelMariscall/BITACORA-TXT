package BITACORA;

public class Deporte {
    private String NOMBREDELDEPORTE;
    private int NUMERODEJUGADORES;
    private String CANCHA;
    private String HORA;

    public String getNOMBREDELDEPORTE() {
        return NOMBREDELDEPORTE;
    }

    public void setNOMBREDELDEPORTE(String NOMBREDELDEPORTE) {
        this.NOMBREDELDEPORTE = NOMBREDELDEPORTE;
    }

    public int getNUMERODEJUGADORES() {
        return NUMERODEJUGADORES;
    }

    public void setNUMERODEJUGADORES(int NUMERODEJUGADORES) {
        this.NUMERODEJUGADORES = NUMERODEJUGADORES;
    }

    public String getCANCHA() {
        return CANCHA;
    }

    public void setCANCHA(String CANCHA) {
        this.CANCHA = CANCHA;
    }

    public String getHORA() {
        return HORA;
    }

    public void setHORA(String HORA) {
        this.HORA = HORA;
    }
}
