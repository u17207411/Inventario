package pe.com.sistema.web;

import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import pe.com.sistema.domain.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pe.com.sistema.servicio.ProductoService;

@Controller
@Slf4j

public class ControladorProducto {
    
    @Autowired
    private ProductoService productoService;
    
    @GetMapping("/Producto")
    public String inicio(Model model){
        var productos = productoService.listarProductos();
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("productos", productos);
        return "indexProducto";
    }
    
    @GetMapping("/agregarProducto")
    public String agregar(Producto producto){
        return "modificarProducto";
    }
    
    @PostMapping("/guardarProducto")
    public String guardar(@Valid Producto producto, Errors errores){
        if(errores.hasErrors()){
            return "problemas";
        }
        productoService.guardar(producto);
        return "redirect:/Producto";
    }
    
    @GetMapping("/editarProducto/{idproducto}")
    public String editar(Producto producto, Model model){
        producto = productoService.encontrarProducto(producto);
        model.addAttribute("producto", producto);
        return "modificarProducto";
    }
    
    @GetMapping("/eliminarProducto")
    public String eliminar(Producto producto){
        productoService.eliminar(producto);
        return "redirect:/Producto";
    }
}
