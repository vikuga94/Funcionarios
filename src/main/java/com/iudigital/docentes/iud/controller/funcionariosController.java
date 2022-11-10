package com.iudigital.docentes.iud.controller;

import com.iudigital.docentes.iud.dao.docentesDao;
import com.iudigital.docentes.iud.domain.funcionarios;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;
/**
 *
 * @author SEvguzman
 */
public class funcionariosController {
    private docentesDao DocentesDao;
    
    public funcionariosController(){
      DocentesDao = new docentesDao();
    }
    
    public List<funcionarios> getfuncionarios() throws SQLException{
       return DocentesDao.getfuncionarios();
    }
    
    public void create(funcionarios Funcionario) throws SQLException{
        Funcionario.setFecha_creacion(LocalDateTime.now());
        DocentesDao.create(Funcionario);
    }
    
    public funcionarios getfuncionarios (int id) throws SQLException{
        return DocentesDao.getfuncionarios(id);
    }
    
    public void updatefuncionarios(int id, funcionarios Funcionario) throws SQLException {
        Funcionario.setFecha_creacion(LocalDateTime.now());
        DocentesDao.updatefuncionarios(id, Funcionario);
    }
    
    public void deletefuncionarios(int id) throws SQLException {
        DocentesDao.deletefuncionarios(id);
    }
    
}
