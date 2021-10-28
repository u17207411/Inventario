package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.domain.Cliente;

public interface ClienteService {
    
    public List<Cliente> listarClientes();
    
    public void guardar(Cliente cliente);
    
    public void eliminar(Cliente cliente);
    
    public Cliente encontrarCliente(Cliente cliente);
}
