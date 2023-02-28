package Practica3Grupo4.Server;

import Practica3Grupo4.domain.Estado;
import java.util.List;


public interface EstadoService {
    
    public List<Estado> getestados();
    public Estado getEstado(Estado estado);
    public void save (Estado estado);
    public void delete (Estado estado);

    public Object buscarEstado(Long id);
    
   
}