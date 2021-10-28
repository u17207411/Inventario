package pe.com.sistema.servicio;

import java.util.List;
import pe.com.sistema.domain.Cliente;

public interface ClienteService {
    
    public List<Cliente> listarClientes();
    
    public void guardar(Cliente cliente);
    
    public void eliminar(Cliente cliente);
    
    public Cliente encontrarCliente(Cliente cliente);
}
