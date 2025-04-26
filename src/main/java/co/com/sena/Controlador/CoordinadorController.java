package co.com.sena.Controlador;

import co.com.sena.Entities.Coordinador;
import co.com.sena.Services.ServiceCoordinador;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Service
@RestController
@RequestMapping("coordinador")
public class CoordinadorController {
    public static final Logger logger = LoggerFactory.getLogger(CoordinadorController.class);

    @Autowired
    private ServiceCoordinador serviceCoordinador;

    //http://localhost:8080/coordinador/listaCoordinadores
    @GetMapping("ListaCoordinadores")
    public List<Coordinador> obtenerCoordinadores() {
        List<Coordinador> listaDeCoordinadores = this.obtenerCoordinadores();
        logger.info("Lista de Coordinadores");
        listaDeCoordinadores.forEach(coordinador -> logger.info(coordinador.toString()));
        return listaDeCoordinadores;
    }
}
