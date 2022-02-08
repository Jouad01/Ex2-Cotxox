package Conductores;

import java.util.ArrayList;
import java.util.List;

public class PoolConductores {
    private List<Conductor> poolConductores = new ArrayList<Conductor>();

    public PoolConductores(List<Conductor> poolConductores) {
        this.poolConductores = poolConductores;
    }

    public List<Conductor> getPoolConductores() {
        return this.poolConductores;
    }

    public Conductor asignarConductor() {
        for (Conductor conductor: this.poolConductores){
            if (conductor != null) {     // Si conductor es diferente a nulo da true y devuelve el
                conductor.setOcupado(true); // conductor con su valor
                return conductor;
            }
        }
        return null;
    }
}
