package pe.edu.upc.aaw.lawdingo_g4.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.lawdingo_g4.dtos.CommentDTO;
import pe.edu.upc.aaw.lawdingo_g4.entities.Comment;
import pe.edu.upc.aaw.lawdingo_g4.serviceinterfaces.ICommentService;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comments")
public class CommentController {
    @Autowired
    private ICommentService cS;
    @PostMapping
    public void registrar(@RequestBody CommentDTO dto){
        ModelMapper m = new ModelMapper();
        Comment c = m.map(dto, Comment.class);
        cS.insert(c);
    }
    @GetMapping
    public List<CommentDTO> listar(){
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CommentDTO.class);
        }).collect(Collectors.toList());
    }
}
