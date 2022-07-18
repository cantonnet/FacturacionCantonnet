package com.coderhouse.cantonnet.facturacion.service;

import com.coderhouse.cantonnet.facturacion.CDatos.Datos;
import com.coderhouse.cantonnet.facturacion.model.Cliente;
import com.coderhouse.cantonnet.facturacion.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService{
    int edad;
    Cliente cliente;
    List<Cliente> copiadelista;
    List<Datos> MostrarLista = new ArrayList<>();

    @Autowired
    private ClienteRepository repository;
    @Override
    public List<Cliente> buscarTodosLosClientes() {return repository.findAll();}

    /*@Override
    public Datos buscarPorDni(int dni){
        cliente = repository.findById(dni).orElse(null);
        if(cliente!=null){
            edad = calcularedad(cliente);
            Datos muestrocliente = new Datos(cliente.getIDcliente(), cliente.getDni(), cliente.getNombre(), cliente.getApellido(), edad);
            return muestrocliente;
        }
        return null;
    }
*/
    @Override
    public Datos buscarPorID(int IDcliente){
        cliente = repository.findById(IDcliente).orElse(null);
        if(cliente!=null){
            edad = calcularedad(cliente);
            Datos muestrocliente = new Datos(cliente.getIDcliente(), cliente.getDni(), cliente.getNombre(), cliente.getApellido(), edad);
            return muestrocliente;
        }
        return null;
    }

    @Override
    public List<Datos> ListarEdad() {
        copiadelista=repository.findAll();
        int finalLista = copiadelista.size();
        for(int i=0;i<finalLista;i++){
            cliente=copiadelista.get(i);
            edad=calcularedad(cliente);
            Datos MostrarCliente = new Datos(cliente.getIDcliente(), cliente.getDni(), cliente.getNombre(), cliente.getApellido(), edad);
            MostrarLista.add(MostrarCliente);
        }
        return MostrarLista;
    }

    private int calcularedad(Cliente cliente) {
        Date fecha = cliente.getFechanacimiento();
        String fechaString = fecha.toString();
        int age = Integer.parseInt(fechaString.substring(0,4));
        int mes = Integer.parseInt(fechaString.substring(5,7));
        int dia = Integer.parseInt(fechaString.substring(8,10));
        int edad = Period.between(LocalDate.of(age,mes,dia),LocalDate.now()).getYears();
        return edad;
    }
}
