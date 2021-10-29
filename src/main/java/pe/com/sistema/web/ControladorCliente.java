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
import pe.com.sistema.domain.Cliente;
import pe.com.sistema.servicio.ClienteService;

@Controller
@Slf4j

public class ControladorCliente {
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping("/Cliente")
    public String inicio(Model model){
        var clientes = clienteService.listarClientes();
        log.info("ejecutando el controlador Cliente");
        model.addAttribute("clientes", clientes);
        
        model.addAttribute("totalClientes", clientes.size());
        return "indexCliente";
    }
    
    @GetMapping("/agregarCliente")
    public String agregar(Cliente cliente){
        return "modificarCliente";
    }
    
    @PostMapping("/guardarCliente")
    public String guardar(@Valid Cliente cliente, Errors errores){
        if(errores.hasErrors()){
            return "modificarCliente";
        }
        clienteService.guardar(cliente);
        return "redirect:/Cliente";
    }
    
    @GetMapping("/editarCliente/{idcliente}")
    public String editar(Cliente cliente, Model model){
        cliente = clienteService.encontrarCliente(cliente);
        model.addAttribute("cliente", cliente);
        return "modificarCliente";
    }
    
    @GetMapping("/eliminarCliente")
    public String eliminar(Cliente cliente){
        clienteService.eliminar(cliente);
        return "redirect:/Cliente";
    }
}
