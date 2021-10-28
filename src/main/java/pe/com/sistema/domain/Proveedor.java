/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.sistema.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import lombok.Data;

/**
 *
 * @author alons
 */
@Data
@Entity
@Table(name = "proveedor")
public class Proveedor implements Serializable{
    
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idproveedor;
    
    @NotEmpty
    private String ruc;
    
    @NotEmpty
    private String razonsocial;
    
    @NotEmpty
    private int telefono;
    
    @NotEmpty
    @Email
    private String correo;
    
    @NotEmpty
    private String contacto;
    
    @NotEmpty
    private String direccion;

}
