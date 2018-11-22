
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ronaldvega
 */
public class DBConection {
    
    private Connection con;
    private Statement st;
    private ResultSet rs;

    public DBConection() {
        try{
            Class.forName("com.mysql.jdbc.Driver"); 
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProjectSED","root", "");
            st = con.createStatement();
            
        }catch(Exception e){
            System.out.println("Error: "+ e);
        }
    }
    
    
    public void getUsers(){
        try{
            String query = "SELECT * FROM `USUARIO`";
            rs = st.executeQuery(query);
            System.out.println("ALL THE USERS ON DB");
            while(rs.next()){
                String user = rs.getString("username");
                String pass = rs.getString("pass");
                System.out.println("Usuario: "+ user + "\n" + "pass: " + pass);
            }
            
            
            
        }catch(Exception e){
            System.out.println("Error: "+ e);
        }
        
        
    }
    
}
