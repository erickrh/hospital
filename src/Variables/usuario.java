/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Variables;

import Conexion.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author erick
 */
public class usuario {
    public String cedula;
    public String nombres;
    public String apellidos;
    public String edad;
    public String vacuna;
    public String categoria;

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setVacuna(String vacuna) {
        this.vacuna = vacuna;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public String getVacuna() {
        return vacuna;
    }

    public String getCategoria() {
        return categoria;
    }

    public usuario(String cedula, String nombres, String apellidos, String edad, String vacuna, String categoria) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.vacuna = vacuna;
        this.categoria = categoria;
    }
    
    private static ConexionDB conex = new ConexionDB();
    
    public void insertaUsuario() throws SQLException {
        conex.establecerconexion();
        String seleccion="INSERT INTO `usuario` (`cedula`, `nombres`, `apellidos`, `edad`, `vacuna`, `categoria`)"+"values (?,?,?,?,?,?)";
        PreparedStatement ps = conex.con.prepareStatement(seleccion);
        ps.setString(1, cedula);
        ps.setString(2, nombres);
        ps.setString(3, apellidos);
        ps.setString(4, edad);
        ps.setString(5, vacuna);
        ps.setString(6, categoria);
        ps.executeUpdate();
    }

}
