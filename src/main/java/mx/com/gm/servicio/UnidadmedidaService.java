package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.domain.Unidadmedida;

public interface UnidadmedidaService {
    
    public List<Unidadmedida> listarUnidadesmedida();
    
    public void guardar(Unidadmedida unidadmedida);
    
    public void eliminar(Unidadmedida unidadmedida);
    
    public Unidadmedida encontrarUnidadmedida(Unidadmedida unidadmedida);
}
