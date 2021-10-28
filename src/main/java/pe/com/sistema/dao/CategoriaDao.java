package pe.com.sistema.dao;

import pe.com.sistema.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository<Categoria, Integer>{
    
}
