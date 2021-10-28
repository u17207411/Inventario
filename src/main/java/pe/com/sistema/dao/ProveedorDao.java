package pe.com.sistema.dao;

import pe.com.sistema.domain.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProveedorDao extends JpaRepository<Proveedor, Integer>{
    
}
