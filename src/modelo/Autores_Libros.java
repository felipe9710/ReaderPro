/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.mysql.cj.protocol.Resultset;
import control.BaseDatos;
import java.io.FileInputStream;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Home
 */
public class Autores_Libros {

    private int id_AutorLibro;
    private int id_autorAF;
    private int id_audiolibroAF;

    public Autores_Libros() {
    }

    public Autores_Libros(int id_AutorLibro, int id_autorAF, int id_audiolibroAF) {
        this.id_AutorLibro = id_AutorLibro;
        this.id_autorAF = id_autorAF;
        this.id_audiolibroAF = id_audiolibroAF;
    }

    public Autores_Libros(int id_autorAF, int id_audiolibroAF) {
        this.id_autorAF = id_autorAF;
        this.id_audiolibroAF = id_audiolibroAF;
    }

    public int getId_AutorLibro() {
        return id_AutorLibro;
    }

    public void setId_AutorLibro(int id_AutorLibro) {
        this.id_AutorLibro = id_AutorLibro;
    }

    public int getId_autorAF() {
        return id_autorAF;
    }

    public void setId_autorAF(int id_autorAF) {
        this.id_autorAF = id_autorAF;
    }

    public int getId_audiolibroAF() {
        return id_audiolibroAF;
    }

    public void setId_audiolibroAF(int id_audiolibroAF) {
        this.id_audiolibroAF = id_audiolibroAF;
    }

    @Override
    public String toString() {
        return "Autores_Libros{" + "id_AutorLibro=" + id_AutorLibro + ", id_autorAF=" + id_autorAF + ", id_audiolibroAF=" + id_audiolibroAF + '}';
    }

    
   
    public boolean insertarAutoresLibros(Autores_Libros objAL,String sql) {
        boolean t = false;
        BaseDatos objb = new BaseDatos();
        PreparedStatement ps = null;
        try {
            if (objb.crearConexion()) {
                objb.getConexion().setAutoCommit(false);
                ps = objb.getConexion().prepareStatement(sql);
                ps.setInt(1, objAL.getId_autorAF());
                ps.setInt(2, objAL.getId_audiolibroAF());
                

                ps.executeUpdate();
                objb.getConexion().commit();
                t = true;
            }
        } catch (Exception ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            t = false;
        }

        return t;

    }

    public LinkedList<Autores_Libros> consultarAutoresLibros(String sql) {
        LinkedList<Autores_Libros> lp = new LinkedList<>();
        BaseDatos objb = new BaseDatos();

        int id_autorLF2 = 0;
        int id_AudioLF2 = 0;
        String idu;

        ResultSet rs = null;
        if (objb.crearConexion()) {
            try {
                rs = objb.getSt().executeQuery(sql);
                while (rs.next()) {
                    idu = rs.getString("id_AutorL");
                    id_autorLF2 = rs.getInt("id_autorAF");
                    id_AudioLF2 = rs.getInt("id_audiolibroAF");
                    lp.add(new Autores_Libros(Integer.parseInt(idu),id_autorLF2, id_AudioLF2));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Autor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lp;

    }
    
    public boolean modificarAutoresLibros(String sql) {

        boolean t1 = false;
        BaseDatos objCon = new BaseDatos();

        if (objCon.crearConexion()) {

            try {
                Statement sentencia = objCon.getConexion().createStatement();
                sentencia.executeUpdate(sql);
                t1 = true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                t1 = false;
            }
        }
        return t1;

    }

    public boolean eliminarAutoresLibros(String sql) {

        boolean t2 = false;
        BaseDatos objCon = new BaseDatos();

        if (objCon.crearConexion()) {

            try {
                Statement sentencia = objCon.getConexion().createStatement();
                sentencia.executeUpdate(sql);
                t2 = true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                t2 = false;
            }
        }
        return t2;

    }
    
}
