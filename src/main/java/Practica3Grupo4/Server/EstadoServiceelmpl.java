package Practica3Grupo4.Server;

import Practica3Grupo4.dao.EstadoDao;
import Practica3Grupo4.domain.Estado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EstadoServiceelmpl implements EstadoService{

    @Autowired
    EstadoDao estadoDao;
            
    @Override
    @Transactional(readOnly = true)
    public List<Estado> getestados() {
       return (List<Estado>)estadoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Estado getEstado(Estado estado) {
       return estadoDao.findById(estado.getIdEstado()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Estado estado) {
        estadoDao.save(estado);
    }

    @Override
    @Transactional
    public void delete(Estado estado) {
       estadoDao.deleteById(estado.getIdEstado());
    }

    @Override
    public Object buscarEstado(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}