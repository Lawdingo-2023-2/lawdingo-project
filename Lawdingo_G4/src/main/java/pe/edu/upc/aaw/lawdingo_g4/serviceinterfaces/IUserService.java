package pe.edu.upc.aaw.lawdingo_g4.serviceinterfaces;

import pe.edu.upc.aaw.lawdingo_g4.entities.Users;

import java.util.List;

public interface IUserService {

    public List <Users> getUsersWhoseNameStartsWith(String startsWith);
    public void insert (Users users);
    public List <Users> list(String name);


}
