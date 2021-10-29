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
import pe.com.sistema.domain.Proveedor;
import pe.com.sistema.servicio.ProveedorService;

/**
 *
 * @author alons
 */
@Controller
@Slf4j
public class ControladorProveedor {
    @Autowired
    private ProveedorService proveedorService;
    
    @GetMapping("/Proveedor")
    public String inicio(Model model){
        var proveedores = proveedorService.listarProveedores();
        log.info("ejecutando el controlador Proveedor");
        model.addAttribute("proveedores", proveedores);
        
        model.addAttribute("totalProveedores", proveedores.size());
        return "indexProveedor";
    }
    
    @GetMapping("/agregarProveedor")
    public String agregar(Proveedor proveedor){
        return "modificarProveedor";
    }
    
    @PostMapping("/guardarProveedor")
    public String guardar(@Valid Proveedor proveedor, Errors errores){
        if(errores.hasErrors()){
            return "modificarProveedor";
        }
        proveedorService.guardar(proveedor);
        return "redirect:/Proveedor";
    }
    
    @GetMapping("/editarProveedor/{idproveedor}")
    public String editar(Proveedor proveedor, Model model){
        proveedor = proveedorService.encontrarProveedor(proveedor);
        model.addAttribute("proveedor", proveedor);
        return "modificarProveedor";
    }
    
    @GetMapping("/eliminarProveedor")
    public String eliminar(Proveedor proveedor){
        proveedorService.eliminar(proveedor);
        return "redirect:/Proveedor";
    }
}
