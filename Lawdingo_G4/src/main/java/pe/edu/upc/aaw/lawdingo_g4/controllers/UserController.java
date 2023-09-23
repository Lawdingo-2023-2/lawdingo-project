package pe.edu.upc.aaw.lawdingo_g4.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
=======
import org.springframework.web.bind.annotation.*;
>>>>>>> parent of eade7df (intento de Web Deployment)
import pe.edu.upc.aaw.lawdingo_g4.dtos.CourtDTO;
import pe.edu.upc.aaw.lawdingo_g4.dtos.UserDTO;
import pe.edu.upc.aaw.lawdingo_g4.entities.Users;
import pe.edu.upc.aaw.lawdingo_g4.serviceinterfaces.IUserService;

<<<<<<< HEAD
import javax.validation.Valid;
=======
>>>>>>> parent of eade7df (intento de Web Deployment)
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
<<<<<<< HEAD
    private PasswordEncoder bcrypt;
    @Autowired
    private IUserService uS;


    @PostMapping("/save")
    public String saveUser(@Valid Users user, BindingResult result, Model model, SessionStatus status, @RequestBody UserDTO dto)
            throws Exception {
        if (result.hasErrors()) {
            return "usersecurity/user";
        } else {
//            String bcryptPassword = bcrypt.encode(user.getPassword());
//            user.setPassword(bcryptPassword);
//            int rpta = uS.insert(user);
//            if (rpta > 0) {
//                model.addAttribute("mensaje", "Ya existe");
//                return "usersecurity/user";
//            } else {
//                model.addAttribute("mensaje", "Se guardó correctamente");
//                status.setComplete();
//            }
            ModelMapper m = new ModelMapper();
            Users u = m.map(dto, Users.class);
            String bcryptPassword = bcrypt.encode(u.getPassword());
            u.setPassword(bcryptPassword);
            uS.insert(u);
            return "Usuario creado";
        }

//        model.addAttribute("listaUsuarios", uS.list());
//
//        return "usersecurity/listUser";
    }

    //PROBAR

    @GetMapping("/list")
    public String listUser(Model model) {
        try {
            model.addAttribute("user", new Users());
            model.addAttribute("listaUsuarios", uS.list());
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return "usersecurity/listUser";
    }



=======
    private IUserService uS;

    @PostMapping
    public void registrar(@RequestBody CourtDTO dto){
        ModelMapper m = new ModelMapper();
        Users c=m.map(dto,Users.class);
        uS.insert(c);
    }

>>>>>>> parent of eade7df (intento de Web Deployment)
    @GetMapping("/startsWith/{letter}")
    public List<Users> getUsersWhoseNameStartsWith(@PathVariable String letter) {
        return uS.getUsersWhoseNameStartsWith(letter);
    }

<<<<<<< HEAD
//    @GetMapping("/name")
//    public List<UserDTO> list(@RequestBody String name){
//        return uS.list(name).stream().map(x -> {
//            ModelMapper m = new ModelMapper();
//            return m.map(x, UserDTO.class);
//        }).collect(Collectors.toList());
//    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id){
        uS.delete(id);
    }

    @GetMapping
    public List<UserDTO> list(){
        return uS.list().stream().map(x -> {
=======
    @PostMapping("/name")
    public List<UserDTO> list(@RequestBody String name){
        return uS.list(name).stream().map(x -> {
>>>>>>> parent of eade7df (intento de Web Deployment)
            ModelMapper m = new ModelMapper();
            return m.map(x, UserDTO.class);
        }).collect(Collectors.toList());
    }
<<<<<<< HEAD
=======

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        uS.delete(id);
    }


>>>>>>> parent of eade7df (intento de Web Deployment)
}



