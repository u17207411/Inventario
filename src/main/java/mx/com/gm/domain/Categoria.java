package mx.com.gm.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
@Table(name = "categoria")
public class Categoria implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcategoria;
    
    @NotEmpty
    private String nombrecategoria;
    
}
