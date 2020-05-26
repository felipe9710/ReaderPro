/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.Audio;

/**
 *
 * @author usuario
 */
public class ControlAudio {

    public boolean insertarAudio(Audio objau) {
        
        boolean t = false;
        Audio objaud = new Audio();
        String sql = "";
        sql = "insert into audios (archivo_Audio,id_audiolibroF) values (?,?)"; 
        t = objaud.insertarAudio(objau,sql);
        return t;
    }

    public boolean eliminarAudio(String select) {
        
        boolean t = false;
        Audio objAudio = new Audio();
        String sql = "";
        sql = "delete from audios where id_Audio =" + select;
        t = objAudio.eliminarAudio(sql);
        return t;
    }

    public LinkedList<Audio> consultarAudio() {
        
        String sql = "Select * from audios;";
        Audio objcu = new Audio();
        LinkedList<Audio> listaAu = objcu.consultarAudio(sql);

        return listaAu;
        
    }

    public boolean modificarAudio(String select, String archivo, int idAL) {
        
        boolean t1 = false;
        Audio objma = new Audio();
        String sql = "update audios set archivo_Audio = '" + archivo + "',id_audiolibroF = '"+idAL +"'where id_Audio =" + select;
        t1 = objma.modificarAudio(sql);
        return t1;
        
    }
    
}
