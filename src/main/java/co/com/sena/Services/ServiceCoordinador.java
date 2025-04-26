package co.com.sena.Services;

import co.com.sena.Entities.Coordinador;
import co.com.sena.Repositories.IRepositoryCoordinador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ServiceCoordinador implements IServiceCoordinador{

    @Autowired
    private IRepositoryCoordinador iRepositoryCoordinador;

    @Override
    public List<Coordinador> obtenerCoordinadores(){
        List<Coordinador> listaCoordinadores = this.iRepositoryCoordinador.findAll();
        return listaCoordinadores;
    }

}
