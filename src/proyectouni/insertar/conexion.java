/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectouni.insertar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {
    Connection conectar=null;
    public Connection conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectouni", "root", "root");
            
        }catch(ClassNotFoundException | SQLException e){
           JOptionPane.showMessageDialog(null,"Conexion fallida"+e, "Conexion",JOptionPane.ERROR_MESSAGE); 
        }
        return conectar;
    }
    
}