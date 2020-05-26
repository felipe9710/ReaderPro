/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class Audio {

    private int id_Audio;
    private String archivo_Audio;
    private int id_audiolibroF;

    /**
     * Get the value of id_Audio
     *
     * @return the value of id_Audio
     */
    public int getId_Audio() {
        return id_Audio;
    }

    /**
     * Set the value of id_Audio
     *
     * @param id_Audio new value of id_Audio
     */
    public void setId_Audio(int id_Audio) {
        this.id_Audio = id_Audio;
    }

    /**
     * Get the value of archivo_Audio
     *
     * @return the value of archivo_Audio
     */
    public String getArchivo_Audio() {
        return archivo_Audio;
    }

    /**
     * Set the value of archivo_Audio
     *
     * @param archivo_Audio new value of archivo_Audio
     */
    public void setArchivo_Audio(String archivo_Audio) {
        this.archivo_Audio = archivo_Audio;
    }

    public int getId_audiolibroF() {
        return id_audiolibroF;
    }

    /**
     * Set the value of id_audiolibroF
     *
     * @param id_audiolibroF new value of id_audiolibroF
     */
    public void setId_audiolibroF(int id_audiolibroF) {
        this.id_audiolibroF = id_audiolibroF;
    }

    public Audio() {
    }

    public Audio(String archivo_Audio, int id_audiolibroF) {
        this.archivo_Audio = archivo_Audio;
        this.id_audiolibroF = id_audiolibroF;
    }

    public Audio(int id_Audio, String archivo_Audio, int id_audiolibroF) {
        this.id_Audio = id_Audio;
        this.archivo_Audio = archivo_Audio;
        this.id_audiolibroF = id_audiolibroF;
    }

    public boolean insertarAudio(Audio objau, String sql) {

        boolean t = false;
        BaseDatos objb = new BaseDatos();
        PreparedStatement ps = null;

        try {
            if (objb.crearConexion()) {
                objb.getConexion().setAutoCommit(false);
                ps = objb.getConexion().prepareStatement(sql);

                ps.setString(1, objau.getArchivo_Audio());
                ps.setInt(2, objau.getId_audiolibroF());

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

    public boolean eliminarAudio(String sql) {

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

    public LinkedList<Audio> consultarAudio(String sql) {

        ResultSet rs = null;
        LinkedList<Audio> lu = new LinkedList<>();
        BaseDatos objCon = new BaseDatos();

        String id_Audio = "";
        String archivo_Audio = "";
        String id_audiolibroF = "";

        if (objCon.crearConexion()) {
            try {
                Statement sentencia = objCon.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {

                    id_Audio = rs.getString("id_Audio");
                    archivo_Audio = rs.getString("archivo_Audio");
                    id_audiolibroF = rs.getString("id_audiolibroF");

                    lu.add(new Audio(Integer.parseInt(id_Audio), archivo_Audio, Integer.parseInt(id_audiolibroF)));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return lu;

    }

    public boolean modificarAudio(String sql) {

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

}
