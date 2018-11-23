
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
    private PreparedStatement pst;
    private ResultSet rs;
    private String query;
    private boolean credentials = false;

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
    
    public boolean getConnection(String user, String pass){
        try{
            query = "SELECT * FROM `USUARIO` WHERE username=? and pass=? ";
            pst = con.prepareStatement(query);
            pst.setString(1, user);
            int password = hashPass(user, pass);
            pst.setInt(2, password);
            rs = pst.executeQuery();
            
            if(rs.next()){
                credentials = true;
                return credentials;
            }else{
                credentials = false;
                return credentials;
            }
        }catch(Exception e){
        
        }
        
        return credentials;
    }
    
    public int hashPass(String user, String pass){
        int hash = 1;
        hash = hash * 17 + user.hashCode();
        hash = hash * 31 + pass.hashCode();
        return hash;
    }
}
