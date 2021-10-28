package mx.com.gm.dao;

import mx.com.gm.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository<Categoria, Integer>{
    
}
