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
@Table(name = "cliente")
public class Cliente implements Serializable{
    
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcliente;
    
    @NotEmpty
    private String ruccliente;
    
    @NotEmpty
    private String razonsocialcliente;
    

    private String telefonocliente;
    
    @NotEmpty
    @Email
    private String email;
    
    @NotEmpty
    private String contactocliente;
    
    @NotEmpty
    private String direccioncliente;

}
