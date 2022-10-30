/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectouni.insertar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class idalum {
    public int id_incrementable(){
        int id= 1;
        PreparedStatement ps= null;
        ResultSet rs = null;
        conexion db=new conexion();
        
        try{
            ps = db.conectar().prepareStatement("SELECT MAX(idalumno) FROM alumno");
            rs = ps.executeQuery();
            while(rs.next()){
                id = rs.getInt(1)+1;
            }
            
        }catch(Exception ex){
            System.out.println("Error");
        }
        return id;
    }
     
}
