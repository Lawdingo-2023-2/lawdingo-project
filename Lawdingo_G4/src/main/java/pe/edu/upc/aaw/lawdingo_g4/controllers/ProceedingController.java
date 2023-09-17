package pe.edu.upc.aaw.lawdingo_g4.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.lawdingo_g4.dtos.CommentDTO;
import pe.edu.upc.aaw.lawdingo_g4.dtos.ProceedingDTO;
import pe.edu.upc.aaw.lawdingo_g4.entities.Comment;
import pe.edu.upc.aaw.lawdingo_g4.entities.Proceeding;
import pe.edu.upc.aaw.lawdingo_g4.serviceinterfaces.IProceedingService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/proceedings")
public class ProceedingController {
    @Autowired
    private IProceedingService pS;
    @PostMapping
    public void registrar(@RequestBody ProceedingDTO dto){
        ModelMapper m = new ModelMapper();
        Proceeding p = m.map(dto, Proceeding.class);
        pS.insert(p);
    }
    @GetMapping
    public List<ProceedingDTO> listar(){
        return pS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ProceedingDTO.class);
        }).collect(Collectors.toList());
    }
}
