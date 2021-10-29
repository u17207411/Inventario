package pe.com.sistema.servicio;

import java.util.List;
import pe.com.sistema.dao.UnidadmedidaDao;
import pe.com.sistema.domain.Unidadmedida;
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
    public void guardar(Unidadmedida unidadmedida) {
        unidadmedidaDao.save(unidadmedida);
    }

    @Override
    @Transactional
    public void eliminar(Unidadmedida unidadmedida) {
        unidadmedidaDao.delete(unidadmedida);
    }

    @Override
    @Transactional(readOnly = true)
    public Unidadmedida encontrarUnidadmedida(Unidadmedida unidadmedida) {
        return unidadmedidaDao.findById(unidadmedida.getIdunidadmedida()).orElse(null);
    }
}
