package com.cursodeprueba.java.controller;


import com.cursodeprueba.java.entity.UsuarioEntity;
import com.cursodeprueba.java.service.UsuarioService;
import org.hibernate.type.descriptor.java.UUIDTypeDescriptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Convert;
import java.util.ArrayList;

@RestController
@RequestMapping("/usuarios")
public class usuarioController {


    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/lista")
    public ArrayList<UsuarioEntity> listadoTodos(){
        return usuarioService.obtenerUsuario();

    }
    @PostMapping()
    public UsuarioEntity guardarUsuario(@RequestBody UsuarioEntity usuario){
        return usuarioService.guardarUsuario(usuario);
    }
@RequestMapping("/h")
    public String holanda() {

        return "dadasdsdassa";
}
}
