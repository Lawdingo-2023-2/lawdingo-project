package pe.edu.upc.aaw.lawdingo_g4.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import pe.edu.upc.aaw.lawdingo_g4.entities.rUsers;
import pe.edu.upc.aaw.lawdingo_g4.serviceinterfaces.IrUserService;

import javax.validation.Valid;

@RestController

@RequestMapping("/rusers")
public class rUsersController {
    @Autowired
    private PasswordEncoder bcrypt;
    @Autowired
    private IrUserService uService;

    @PostMapping("/save")
    public String saveUser(@Valid rUsers ruser, BindingResult result, Model model, SessionStatus status, @RequestBody rUsers user)
            throws Exception {
        if (result.hasErrors()) {
            return "usersecurity/user";
        } else {
            String bcryptPassword = bcrypt.encode(user.getPassword());
            user.setPassword(bcryptPassword);
            int rpta = uService.insert(user);
            if (rpta > 0) {
                model.addAttribute("mensaje", "Ya existe");
                return "usersecurity/user";
            } else {
                model.addAttribute("mensaje", "Se guardó correctamente");
                status.setComplete();
            }
        }
        model.addAttribute("listaUsuarios", uService.list());

        return "usersecurity/listUser";
    }

    @GetMapping("/list")
    public String listUser(Model model) {
        try {
            model.addAttribute("user", new rUsers());
            model.addAttribute("listaUsuarios", uService.list());
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return "usersecurity/listUser";
    }
}
