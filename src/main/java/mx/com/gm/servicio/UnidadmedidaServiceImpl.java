package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.dao.UnidadmedidaDao;
import mx.com.gm.domain.Unidadmedida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UnidadmedidaServiceImpl implements UnidadmedidaService {

    @Autowired
    private UnidadmedidaDao unidadmedidaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Unidadmedida> listarUnidadesmedida() {
        return (List<Unidadmedida>) unidadmedidaDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Unidadmedida persona) {
        unidadmedidaDao.save(persona);
    }

    @Override
    @Transactional
    public void eliminar(Unidadmedida persona) {
        unidadmedidaDao.delete(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Unidadmedida encontrarUnidadmedida(Unidadmedida unidadmedida) {
        return unidadmedidaDao.findById(unidadmedida.getIdunidadmedida()).orElse(null);
    }
}
