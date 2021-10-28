package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.domain.Proveedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mx.com.gm.dao.ProveedorDao;

@Service
public class ProveedorServiceImpl implements ProveedorService {

    @Autowired
    private ProveedorDao proveedorDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Proveedor> listarProveedores() {
        return (List<Proveedor>) proveedorDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Proveedor proveedor) {
        proveedorDao.save(proveedor);
    }

    @Override
    @Transactional
    public void eliminar(Proveedor proveedor) {
        proveedorDao.delete(proveedor);
    }

    @Override
    @Transactional(readOnly = true)
    public Proveedor encontrarProveedor(Proveedor proveedor) {
        return proveedorDao.findById(proveedor.getIdproveedor()).orElse(null);
    }
}
