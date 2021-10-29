package pe.com.sistema.servicio;

import java.util.List;
import pe.com.sistema.domain.Producto;

public interface ProductoService {
    
    public List<Producto> listarProductos();
    
    public void guardar(Producto producto);
    
    public void eliminar(Producto producto);
    
    public Producto encontrarProducto(Producto producto);
}
