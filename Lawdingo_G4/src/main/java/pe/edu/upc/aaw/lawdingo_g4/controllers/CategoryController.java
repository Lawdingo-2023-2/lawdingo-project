package pe.edu.upc.aaw.lawdingo_g4.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.lawdingo_g4.dtos.CategoryDTO;
import pe.edu.upc.aaw.lawdingo_g4.entities.Category;
import pe.edu.upc.aaw.lawdingo_g4.serviceinterfaces.ICategoryService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private ICategoryService aS;

    @PostMapping
    public void insert(@RequestBody CategoryDTO dto) {
        ModelMapper m = new ModelMapper();
        Category a = m.map(dto, Category.class);
        aS.insert(a);
    }


    @GetMapping
    @PreAuthorize("hasAuthority('USER')")
    public List<CategoryDTO> list() {
        return aS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, CategoryDTO.class);

        }).collect(Collectors.toList());
    }
}
