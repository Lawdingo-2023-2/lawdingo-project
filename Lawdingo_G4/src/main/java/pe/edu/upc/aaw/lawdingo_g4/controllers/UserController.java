package pe.edu.upc.aaw.lawdingo_g4.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.lawdingo_g4.dtos.CourtDTO;
import pe.edu.upc.aaw.lawdingo_g4.dtos.UserDTO;
import pe.edu.upc.aaw.lawdingo_g4.entities.Users;
import pe.edu.upc.aaw.lawdingo_g4.serviceinterfaces.IUserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService uS;

    @PostMapping
    public void registrar(@RequestBody CourtDTO dto){
        ModelMapper m = new ModelMapper();
        Users c=m.map(dto,Users.class);
        uS.insert(c);
    }

    @GetMapping("/startsWith/{letter}")
    public List<Users> getUsersWhoseNameStartsWith(@PathVariable String letter) {
        return uS.getUsersWhoseNameStartsWith(letter);
    }

    @PostMapping("/name")
    public List<UserDTO> list(@RequestBody String name){
        return uS.list(name).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UserDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        uS.delete(id);
    }


}



