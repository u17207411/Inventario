package pe.com.sistema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.sistema.domain.Producto;

public interface ProductoDao extends JpaRepository<Producto, Integer>{
    
}
