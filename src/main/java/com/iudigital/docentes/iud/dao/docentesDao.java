package com.iudigital.docentes.iud.dao;

import com.iudigital.docentes.iud.domain.funcionarios;
import com.iudigital.docentes.iud.util.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author SEvguzman
 */
public class docentesDao {
    private static final String GET_FUNCIONARIOS = "select F.func_id, F.cedula, F.nombres, F.apellidos, F.estado_civil, F.sexo, F.direccion, F.celular, F.fecha_nacimiento, F.fecha_creacion from funcionarios as F;";
    
private static final String CREATE_FUNCIONARIOS = "INSERT INTO docentesiud.funcionarios (cedula, nombres, apellidos, estado_civil, sexo, direccion, celular, fecha_nacimiento, fecha_creacion) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

private static final String GET_MOVIE_BY_ID = "select F.func_id, F.cedula, F.nombres, F.apellidos, F.estado_civil, F.sexo, F.direccion, F.celular, F.fecha_nacimiento, F.fecha_creacion from funcionarios as F where func_id = ?";

private static final String UPDATE_FUNCIONARIOS = "update funcionarios as F set F.cedula = ?, F.nombres = ?, F.apellidos = ?, F.estado_civil = ?, F.sexo = ?, F.direccion = ?, F.celular = ?, F.fecha_nacimiento = ?, F.fecha_creacion = ? where F.func_id = ?";

private static final String DELETE_FUNCIONARIOS = "delete from funcionarios where func_id = ?";


    public List<funcionarios> getfuncionarios() throws SQLException {
    Connection connection = null;
    PreparedStatement preparedStatement  = null;
    ResultSet resultSet = null;
    List<funcionarios> Funcionarios = new ArrayList<>();
    
    try {
        connection = ConnectionUtil.getConnection();
        preparedStatement = connection.prepareStatement(GET_FUNCIONARIOS);
        resultSet = preparedStatement.executeQuery();
        
        while (resultSet.next()){
              funcionarios Funcionario = new funcionarios();
              Funcionario.setId(resultSet.getInt("func_id"));
              Funcionario.setCedula(resultSet.getString("cedula"));
              Funcionario.setNombres(resultSet.getString("nombres"));
              Funcionario.setApellidos(resultSet.getString("apellidos"));
              Funcionario.setEstado_civil(resultSet.getString("estado_civil"));
              Funcionario.setSexo(resultSet.getString("sexo"));
              Funcionario.setDireccion(resultSet.getString("direccion"));
              Funcionario.setCelular(resultSet.getString("celular"));
              Funcionario.setFecha_nacimiento(resultSet.getString("fecha_nacimiento"));
              Funcionario.setFecha_creacion(resultSet.getObject("fecha_creacion", LocalDateTime.class));
              Funcionarios.add(Funcionario);
        }
        return Funcionarios;
    } finally {

            if (connection != null) {
                connection.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (resultSet != null) {
                resultSet.close();
            }
        }
   }
    
   public void create(funcionarios Funcionario) throws SQLException {
       Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        try {
      
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareCall(CREATE_FUNCIONARIOS);
            preparedStatement.setString(1, Funcionario.getCedula());
            preparedStatement.setString(2, Funcionario.getNombres());
            preparedStatement.setString(3, Funcionario.getApellidos());
            preparedStatement.setString(4, Funcionario.getEstado_civil());
            preparedStatement.setString(5, Funcionario.getSexo());
            preparedStatement.setString(6, Funcionario.getDireccion());
            preparedStatement.setString(7, Funcionario.getCelular());
            preparedStatement.setString(8, Funcionario.getFecha_nacimiento());
            preparedStatement.setObject(9, LocalDateTime.now());
            preparedStatement.executeUpdate();
        } finally {

            if (connection != null) {
                connection.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
        
   }
   
   public funcionarios getfuncionarios (int id) throws SQLException {
   
       Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        funcionarios Funcionario = null;
       
        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(GET_MOVIE_BY_ID);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                
                Funcionario = new funcionarios();
                Funcionario.setId(resultSet.getInt("func_id"));
                Funcionario.setCedula(resultSet.getString("cedula"));
                Funcionario.setNombres(resultSet.getString("nombres"));
                Funcionario.setApellidos(resultSet.getString("apellidos"));
                Funcionario.setEstado_civil(resultSet.getString("estado_civil"));
                Funcionario.setSexo(resultSet.getString("sexo"));
                Funcionario.setDireccion(resultSet.getString("direccion"));
                Funcionario.setCelular(resultSet.getString("celular"));
                Funcionario.setFecha_nacimiento(resultSet.getString("fecha_nacimiento"));
                Funcionario.setFecha_creacion(resultSet.getObject("fecha_creacion", LocalDateTime.class));
            }
            return Funcionario;
        } finally {

            if (resultSet != null) {
                resultSet.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (connection != null) {
                connection.close();
            }
        }
   }
   
   public void updatefuncionarios(int id, funcionarios Funcionario) throws SQLException {
   
       Connection connection = null;
       PreparedStatement preparedStatement = null;
       
       try {
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(UPDATE_FUNCIONARIOS);
            preparedStatement.setString(1, Funcionario.getCedula());
            preparedStatement.setString(2, Funcionario.getNombres());
            preparedStatement.setString(3, Funcionario.getApellidos());
            preparedStatement.setString(4, Funcionario.getEstado_civil());
            preparedStatement.setString(5, Funcionario.getSexo());
            preparedStatement.setString(6, Funcionario.getDireccion());
            preparedStatement.setString(7, Funcionario.getCelular());
            preparedStatement.setString(8, Funcionario.getFecha_nacimiento());
            preparedStatement.setObject(9, LocalDateTime.now());
            preparedStatement.setInt(10, id);
            preparedStatement.executeUpdate();
       } finally {

            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (connection != null) {
                preparedStatement.close();
            }
        }
       
       
       
   }
    
   public void deletefuncionarios(int id) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(DELETE_FUNCIONARIOS);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (connection != null) {
                connection.close();
            }
        }
    }
}