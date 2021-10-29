/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.sistema.web;

import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pe.com.sistema.domain.Unidadmedida;
import pe.com.sistema.servicio.UnidadmedidaService;

/**
 *
 * @author alons
 */
@Controller
@Slf4j
public class ControladorUnidadmedida {
    
    @Autowired
    private UnidadmedidaService unidadmedidaService;
    
    @GetMapping("/Unidadmedida")
    public String inicio(Model model){
        var unidadesmedida = unidadmedidaService.listarUnidadesmedida();
        log.info("ejecutando el controlador Unidadmedida");
        model.addAttribute("unidadesmedida", unidadesmedida);
        return "indexUnidadmedida";
    }
    
    @GetMapping("/agregarUnidadmedida")
    public String agregar(Unidadmedida unidadmedida){
        return "modificarUnidadmedida";
    }
    
    @PostMapping("/guardarUnidadmedida")
    public String guardar(@Valid Unidadmedida unidadmedida, Errors errores){
        if(errores.hasErrors()){
            return "modificarUnidadmedida";
        }
        unidadmedidaService.guardar(unidadmedida);
        return "redirect:/Unidadmedida";
    }
    
    @GetMapping("/editarUnidadmedida/{idunidadmedida}")
    public String editar(Unidadmedida unidadmedida, Model model){
        unidadmedida = unidadmedidaService.encontrarUnidadmedida(unidadmedida);
        model.addAttribute("unidadmedida", unidadmedida);
        return "modificarUnidadmedida";
    }
    
    @GetMapping("/eliminarUnidadmedida")
    public String eliminar(Unidadmedida unidadmedida){
        unidadmedidaService.eliminar(unidadmedida);
        return "redirect:/Unidadmedida";
    }
}
