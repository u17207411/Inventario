package pe.com.sistema.web;

import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import pe.com.sistema.domain.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pe.com.sistema.servicio.CategoriaService;

@Controller
@Slf4j
public class ControladorCategoria {
    
    @Autowired
    private CategoriaService categoriaService;
    
    @GetMapping("/Categoria")
    public String inicio(Model model){
        var categorias = categoriaService.listarCategorias();
        log.info("ejecutando el controlador Categoria");
        model.addAttribute("categorias", categorias);
        return "indexCategoria";
    }
    
    @GetMapping("/agregarCategoria")
    public String agregar(Categoria categoria){
        return "modificarCategoria";
    }
    
    @PostMapping("/guardarCategoria")
    public String guardar(@Valid Categoria categoria, Errors errores){
        if(errores.hasErrors()){
            return "modificarCategoria";
        }
        categoriaService.guardar(categoria);
        return "redirect:/Categoria";
    }
    
    @GetMapping("/editarCategoria/{idcategoria}")
    public String editar(Categoria categoria, Model model){
        categoria = categoriaService.encontrarCategoria(categoria);
        model.addAttribute("categoria", categoria);
        return "modificarCategoria";
    }
    
    @GetMapping("/eliminarCategoria")
    public String eliminar(Categoria categoria){
        categoriaService.eliminar(categoria);
        return "redirect:/Categoria";
    }
}
