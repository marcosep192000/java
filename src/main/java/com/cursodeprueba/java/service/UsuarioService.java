package com.cursodeprueba.java.service;

import com.cursodeprueba.java.entity.UsuarioEntity;
import com.cursodeprueba.java.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    public ArrayList<UsuarioEntity>obtenerUsuario(){
        return (ArrayList<UsuarioEntity>) usuarioRepository.findAll();
    }
    public UsuarioEntity guardarUsuario(UsuarioEntity usuario){
        return usuarioRepository.save(usuario);
    }
}

