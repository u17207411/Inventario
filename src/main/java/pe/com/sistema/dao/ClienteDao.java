package pe.com.sistema.dao;

import pe.com.sistema.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDao extends JpaRepository<Cliente, Integer>{
    
}
