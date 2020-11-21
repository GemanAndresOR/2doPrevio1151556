/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROL;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DTO.Cliente;
/**
 *
 * @author german
 */
public class Controlador extends HttpServlet {

 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        String pr=request.getParameter("action");
        try {
        switch (pr) {
            case "crear":
                mostrar(request, response);
                break;
            default:
                break;
        }
        }catch (SQLException e) {
			e.getStackTrace();
        }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Hola Servlet..");
		doGet(request, response);
	}
    
    
    private void crear(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException , ServletException{
         RequestDispatcher dispatcher = request.getRequestDispatcher("./index.html");
            Facade fa=new Facade();
             String codigo=request.getParameter("cedu");
             Cliente c = new Cliente();
             fa.CrearCliente(Cliente);
             List<Empleado> listaEmpleados = new LinkedList <>();
                     listaEmpleados.add(fa.getEmpleado(codigo));
             System.out.println("llego");  
              request.setAttribute("lista",  listaEmpleados);
            dispatcher.forward(request, response);
           
         
           
             
    }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
  


    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
   

