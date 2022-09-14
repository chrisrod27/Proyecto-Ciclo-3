package test;

import beans.Espacio;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {
    
    public static void main(String[] args) {
        
        //listarEspacio();
        //actualizarEspacio(1, "Sur");
    }
    
    public static void actualizarEspacio(int id, String zona) { 
        
        DBConnection con = new DBConnection();
        
        String sql = "UPDATE espacio SET zona = '" + zona + "' WHERE id = " + id;
        
        try {
           Statement st = con.getConnection().createStatement();
           st.executeUpdate(sql);
        } 
        
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        finally {
            con.desconectar();
        }
    }
    
    public static void listarEspacio() { 
        
        DBConnection con = new DBConnection();
        
        String sql = "SELECT * FROM espacio" ;
        
        try {
           Statement st = con.getConnection().createStatement();
           ResultSet rs = st.executeQuery(sql);
           
           while(rs.next()){
               
               int id = rs.getInt("id");
               String zona = rs.getString("zona");
               double tamaño = rs.getDouble("tamaño");
               boolean disponibilidad = rs.getBoolean("disponibilidad");
               double precio = rs.getDouble("precio");
               String tipo_espacio = rs.getString("tipo espacio");
               int aforo = rs.getInt("aforo");
               
               Espacio espacio = new Espacio(id, zona, tamaño, disponibilidad, precio, tipo_espacio, aforo);
               System.out.println(espacio.toString());
           }
           st.executeQuery(sql);
        } 
        
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        finally {
            con.desconectar();
        }
    }  
}
