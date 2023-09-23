package pe.edu.upc.aaw.lawdingo_g4.serviceinterfaces;

import pe.edu.upc.aaw.lawdingo_g4.entities.rUsers;

import java.util.List;

public interface IrUserService {
    public Integer insert(rUsers ruser);

    List<rUsers> list();
}
