
package Practica3Grupo4.controller;

import Practica3Grupo4.dao.EstadoDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class IndexController {
    
    @Autowired
    EstadoDao estadoDao;
            
    @GetMapping("/")
    public String page(Model model) {
        
        var Estados = estadoDao.findAll();
        model.addAttribute("Estados", Estados);
        return "index";
    }
    
}
