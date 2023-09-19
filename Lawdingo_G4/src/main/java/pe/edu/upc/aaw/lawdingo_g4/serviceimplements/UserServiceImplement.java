package pe.edu.upc.aaw.lawdingo_g4.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.lawdingo_g4.entities.Users;
import pe.edu.upc.aaw.lawdingo_g4.repositories.IUsersRepository;
import pe.edu.upc.aaw.lawdingo_g4.serviceinterfaces.IUserService;

import java.util.List;

@Service
public class UserServiceImplement implements IUserService {
    @Autowired
    private IUsersRepository uR;


    @Override
    public List<Users> getUsersWhoseNameStartsWith(String startsWith) {
        return  uR.findByStartingLetter(startsWith);
    }

    @Override
    public void insert(Users users) {
         uR.save(users);
    }


    public List <Users> list( String name){
        return uR.findByName(name);
    }


    @Override
    public void  delete(Long idUser) {
        uR.deleteById(idUser);
    }

}
