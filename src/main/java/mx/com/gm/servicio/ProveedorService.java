package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.domain.Proveedor;

public interface ProveedorService {
    
    public List<Proveedor> listarProveedores();
    
    public void guardar(Proveedor proveedor);
    
    public void eliminar(Proveedor proveedor);
    
    public Proveedor encontrarProveedor(Proveedor proveedor);
}
