/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FACADE;

import DAO.ClienteJpaController;
import DAO.Conexion;
import DTO.Cliente;
import java.util.List;

/**
 *
 * @author german
 */
public class Facade {
     private List<Cliente> cliente;
     Conexion c=Conexion.getConexion();
      public Facade(){
       
          
        ClienteJpaController pl=new ClienteJpaController(c.getBd());
        this.cliente=pl.findClienteEntities();
    }
    
      public void CrearCliente (Cliente usuario){
      
         ClienteJpaController pl=new ClienteJpaController(c.getBd());
         pl.create(usuario);
          
      }
      
}
