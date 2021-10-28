package pe.com.sistema.servicio;

import java.util.List;
import pe.com.sistema.domain.Proveedor;

public interface ProveedorService {
    
    public List<Proveedor> listarProveedores();
    
    public void guardar(Proveedor proveedor);
    
    public void eliminar(Proveedor proveedor);
    
    public Proveedor encontrarProveedor(Proveedor proveedor);
}
