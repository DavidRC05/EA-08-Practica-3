package Practica3Grupo4.controller;

import Practica3Grupo4.Server.EstadoService;
import Practica3Grupo4.domain.Estado;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class IndexController {

    @Autowired
    EstadoService estadoService;

    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora Utilizando MVC");
        var estados = estadoService.getestados();
        model.addAttribute("estados", estados);
        return "index";
    }

    @GetMapping("/nuevoEstado")
    public String nuevoEstado(Estado estado) {
        return "ActualizarEstado";
    }

    @PostMapping("/nuevoEstado")
    public String guardarEstado(Estado estado) {
        estadoService.save(estado);
        return "redirect:/";
    }

     @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("estado", estadoService.buscarEstado(id));
        return "form-estado";
    }
    
    @GetMapping("/eliminarEstado/{idEstado}")
    public String eliminarCliente(Estado estado){
        estadoService.delete(estado);
        return "redirect:/";
    }
}
