package pe.com.sistema.dao;

import pe.com.sistema.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository<Producto, Integer>{
    
}
