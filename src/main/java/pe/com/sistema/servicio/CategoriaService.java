package pe.com.sistema.servicio;

import java.util.List;
import pe.com.sistema.domain.Categoria;

public interface CategoriaService {
    
    public List<Categoria> listarCategorias();
    
    public void guardar(Categoria categoria);
    
    public void eliminar(Categoria categoria);
    
    public Categoria encontrarCategoria(Categoria categoria);
}
