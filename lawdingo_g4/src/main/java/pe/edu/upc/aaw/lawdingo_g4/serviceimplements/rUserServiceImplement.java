package pe.edu.upc.aaw.lawdingo_g4.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.lawdingo_g4.entities.rUsers;
import pe.edu.upc.aaw.lawdingo_g4.repositories.IrUsersRepository;
import pe.edu.upc.aaw.lawdingo_g4.serviceinterfaces.IrUserService;

import java.util.List;
@Service
public class rUserServiceImplement implements IrUserService {
    @Autowired
    private IrUsersRepository uR;

    @Override
    public Integer insert(rUsers ruser) {
        int rpta = uR.buscarUsername(ruser.getUsername());
        if (rpta == 0) {
            uR.save(ruser);
        }
        return rpta;
    }

    @Override
    public List<rUsers> list() {
        //TODO Auto-generated method stub
        return uR.findAll();
    }

}
