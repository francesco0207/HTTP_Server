package es_serverhttp;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaMySQL {
    
    private ArrayList <Calciatori> arrCalciatori = new ArrayList<>();

    public ArrayList<Calciatori> getArrCalciatori() {
        return arrCalciatori;
    }
    
    public void datiDB () {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connessione = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_http?useSSL=false&serverTimezone=UTC", "root", "scuolaMeucci");
            Statement statement = connessione.createStatement();
            ResultSet resultset = statement.executeQuery("SELECT Calciatori.* FROM Calciatori");
            while(resultset.next())
            {
                String nome = resultset.getString("Nome");
                String cognome = resultset.getString("Cognome");
                arrCalciatori.add(new Calciatori(nome, cognome));
            }
        } catch (ClassNotFoundException e)
        {
            System.out.println("Errore classe non trovata");
        } catch (SQLException ex) {
            System.out.println("Errore eccezzione di sql");
            Logger.getLogger(JavaMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}