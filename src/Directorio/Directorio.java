package Directorio;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EL MEGAS
 */
public class Directorio {
    private HashMap<String,Cliente> directorio;

    public Directorio() {
        this.directorio = new HashMap<>();
    }
    
    public HashMap<String, Cliente> getDirectorio(){
        return directorio;
    }
    
    public void agregarCliente(String telefono, String nombre, String apellido, String dni, String ciudad, String domicilio){
        directorio.put(telefono, new Cliente(nombre, apellido, dni, ciudad, domicilio));
    }
    
    public Cliente buscarCliente(String telefono){
        
        Cliente cliente;
        
        if(!telefono.equals("")){
            if(directorio.containsKey(telefono)){
                
                cliente = directorio.get(telefono);
            
            } else {
            
                System.out.println("El telefono ingresado no está emparejado a ningún Cliente.");
                return null;
                
            }
            
        } else {
            
            System.out.println("El campo telefono está vacío.");
            return null;
            
        }
        
        return cliente;
        
    }
    
    public ArrayList<String> buscarTelefono(String apellido) {
        
        ArrayList<String> telefonosSegunApellido = new ArrayList<>();
                
        if (apellido instanceof String) {
            
            if(!apellido.equals("")){
                
                for (Map.Entry<String, Cliente> e:directorio.entrySet()) {
                    
                    if(e.getValue().getApellido().equals(apellido)){
                        
                        telefonosSegunApellido.add(e.getKey());
                        
                    }
                }
            } else{
                
                System.out.println("No se ingreso un apellido.");
                return null;
                
            }
        }
        
        if(telefonosSegunApellido.isEmpty()){
            
            System.out.println("No se encontró ningún telefono para ese apellido.");
            return null;
            
        }else{
            
            return telefonosSegunApellido;
            
        }        
    }
    
    public ArrayList<Cliente> buscarClientes(String ciudad){
        
        ArrayList<Cliente> clientes = new ArrayList<>();
        
        if(!ciudad.equals("")){
            
            for (Map.Entry<String, Cliente> e:directorio.entrySet()) {
                
                if(e.getValue().getCiudad().equals(ciudad)){
                    
                    clientes.add(e.getValue());
                    
                }
            }
        } else {
            
            System.out.println("No se ingreso una ciudad.");
            return null;
            
        }
        
        if(clientes.isEmpty()){
            
            System.out.println("No se encontraron clientes para esa ciudad.");
            return null;
            
        }else{
            
            return clientes;
            
        }
    }
    
    public void borrarCliente(String key){
        
        if(!key.equals("")){
            
            directorio.remove(key);
            
            
        } else {
            
            System.out.println("No se ingreso un dni.");
            
        }
    }
}
