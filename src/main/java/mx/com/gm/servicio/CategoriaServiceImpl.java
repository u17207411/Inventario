package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.domain.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mx.com.gm.dao.CategoriaDao;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaDao categoriaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Categoria> listarCategorias() {
        return (List<Categoria>) categoriaDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Categoria categoria) {
        categoriaDao.save(categoria);
    }

    @Override
    @Transactional
    public void eliminar(Categoria categoria) {
        categoriaDao.delete(categoria);
    }

    @Override
    @Transactional(readOnly = true)
    public Categoria encontrarCategoria(Categoria categoria) {
        return categoriaDao.findById(categoria.getIdcategoria()).orElse(null);
    }
}
