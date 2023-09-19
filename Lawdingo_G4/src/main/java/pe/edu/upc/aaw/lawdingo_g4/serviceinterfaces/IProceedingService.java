package pe.edu.upc.aaw.lawdingo_g4.serviceinterfaces;

import pe.edu.upc.aaw.lawdingo_g4.entities.Proceeding;

import java.util.List;

public interface IProceedingService {
    public void insert(Proceeding proceeding);

    public List<Proceeding> list();
    public List<String[]> proceedingSummary();
}
