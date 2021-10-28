package mx.com.gm.dao;

import mx.com.gm.domain.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProveedorDao extends JpaRepository<Proveedor, Integer>{
    
}
