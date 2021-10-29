package pe.com.sistema.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "producto")
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idproducto;

    @NotEmpty
    private String codigoproducto;

    @NotEmpty
    private String nombreproducto;

    @NotNull
    private int idmarca;

    @NotNull
    private int idcategoria;

    @NotNull
    private int idlocalizacion;

    @NotNull
    private int idunidadmedida;

    @NotNull
    private double costoproducto;

    @NotNull
    private double precioproducto;

    @NotNull
    private double cantidadminproducto;

    @NotNull
    private double cantidadmaxproducto;

    @NotEmpty
    private String tipomoneda;

    @NotEmpty
    private String comentarioproducto;

    @NotNull
    private double stock;
}
