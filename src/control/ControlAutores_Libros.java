/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import java.util.LinkedList;
import modelo.Autor;
import modelo.Autores_Libros;/**
 *
 * @author Home
 */
public class ControlAutores_Libros {

    public boolean insertarAutores_Libros( Autores_Libros objAL) {
        boolean t = false;
        Autores_Libros objpU = new Autores_Libros();

        String sql = "insert into autores_libros(id_autorAF,id_audiolibroAF) value (?,?)";

        t = objpU.insertarAutoresLibros(objAL,sql);

        return t;
    }

    public LinkedList<Autores_Libros> consultarAutores_Libros() {
        LinkedList<Autores_Libros> lpu = new LinkedList<>();
        String sql = "select * from autores_libros";
        Autores_Libros objpu= new Autores_Libros();
        lpu = objpu.consultarAutoresLibros(sql);
    
        return lpu;
    }
    
  
    public boolean modificarAutoresLibros(String select,int  idAutor2,int IdAudioL2) {

        boolean t1 = false;
        Autores_Libros objmpa = new Autores_Libros();
        String sql = "update autores_libros set id_autorAF = '" + idAutor2 + "',id_audiolibroAF = '"+IdAudioL2+ "'where id_AutorL =" + select;
        t1 = objmpa.modificarAutoresLibros(sql);
        return t1;

    }

    public boolean eliminarAutores_Libro(String selected) {
        
        boolean t2 = false;
        Autores_Libros objepa = new Autores_Libros();
        String sql = "delete from autores_libros where id_AutorL =" + selected;
        t2 = objepa.eliminarAutoresLibros(sql);
        return t2;
        
    }

}
