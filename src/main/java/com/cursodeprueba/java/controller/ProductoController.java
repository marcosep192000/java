package com.cursodeprueba.java.controller;

import com.cursodeprueba.java.entity.ProductoEntity;
import com.cursodeprueba.java.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    ProductoService productoService;

    @GetMapping("/listar")
    public ArrayList<ProductoEntity> listar(){
        return productoService.ListarProducto();
    }
     @PostMapping("/nuevo")
    public ProductoEntity nuevo (@RequestBody ProductoEntity producto)
    {
        return productoService.nuevoProducto(producto);

    }

    @GetMapping("/buscar/{categoria}")
    public ArrayList<ProductoEntity> buscarId (@PathVariable("categoria") String categoria){
        return  this.productoService.FiltrarCategoria(categoria);
    }





@DeleteMapping(path = "/eliminar/{id}")
    public String eliminarId(@PathVariable("id") Long id){
        boolean ok = this.productoService.eliminarProducto(id);
        if (ok){
            return "se elimino el usuario" + id;
        }
        else{
            return "Usuario no encontrado";

        }


}
}
