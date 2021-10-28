package pe.com.sistema.servicio;

import java.util.List;
import pe.com.sistema.domain.Unidadmedida;

public interface UnidadmedidaService {
    
    public List<Unidadmedida> listarUnidadesmedida();
    
    public void guardar(Unidadmedida unidadmedida);
    
    public void eliminar(Unidadmedida unidadmedida);
    
    public Unidadmedida encontrarUnidadmedida(Unidadmedida unidadmedida);
}
