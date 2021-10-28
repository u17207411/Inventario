package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.domain.Categoria;

public interface CategoriaService {
    
    public List<Categoria> listarCategorias();
    
    public void guardar(Categoria categoria);
    
    public void eliminar(Categoria categoria);
    
    public Categoria encontrarCategoria(Categoria categoria);
}
