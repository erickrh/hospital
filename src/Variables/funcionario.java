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
public class funcionario extends usuario {
    public String cargo;

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public funcionario(String cargo, String cedula, String nombres, String apellidos, String edad, String vacuna, String categoria) {
        super(cedula, nombres, apellidos, edad, vacuna, categoria);
        this.cargo = cargo;
    }
    
    private static ConexionDB conex = new ConexionDB();
    
    public void insertaFuncionario() throws SQLException {
        conex.establecerconexion();
        String seleccion="INSERT INTO `funcionario` (`cedula`, `nombres`, `apellidos`, `edad`, `vacuna`, `categoria`, `cargo`)"+"values (?,?,?,?,?,?,?)";
        PreparedStatement ps = conex.con.prepareStatement(seleccion);
        ps.setString(2, cedula);
        ps.setString(3, nombres);
        ps.setString(4, apellidos);
        ps.setString(5, edad);
        ps.setString(6, vacuna);
        ps.setString(7, categoria);
        ps.setString(1, cargo);
        ps.executeUpdate();
    }
    
}
