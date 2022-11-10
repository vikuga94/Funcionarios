package com.iudigital.docentes.iud.view;
import com.iudigital.docentes.iud.controller.funcionariosController;
import com.iudigital.docentes.iud.domain.funcionarios;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author SEvguzman
 */
public class MainConsola {
    
    public static void getfunciona (funcionariosController FuncionarioController){
        try {
            List<funcionarios> Funcionari = FuncionarioController.getfuncionarios();
            if (Funcionari.isEmpty()){
                System.out.println("No hay datos");
            } else {
                Funcionari.forEach(Funcionario  -> {
                    System.out.println("id: " + Funcionario.getId());
                    System.out.println("Cedula: " + Funcionario.getCedula());
                    System.out.println("Nombres: " + Funcionario.getNombres());
                    System.out.println("Apellidos: " + Funcionario.getApellidos());
                    System.out.println("Estado civil: " + Funcionario.getEstado_civil());
                    System.out.println("Sexo: " +  Funcionario.getSexo());
                    System.out.println("Dirección: " + Funcionario.getDireccion());
                    System.out.println("Celular: " + Funcionario.getCelular());
                    System.out.println("Fecha nacimiento: " + Funcionario.getFecha_nacimiento());
                    System.out.println("Fecha creacion: " + Funcionario.getFecha_creacion());
                    
                    System.out.println("-----------------");
                });
            }
        }  catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void create (funcionariosController FuncionarioController){
    
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite cedula: ");
            String cedula = sc.nextLine();
            System.out.println("Cedula: " + cedula);
            System.out.println("----------------------- ");
            
            System.out.println("Digite nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Nombres: " + nombre);
            System.out.println("----------------------- ");
            
            System.out.println("Digite apellidos: ");
            String apellidos = sc.nextLine();
            System.out.println("Apellidos: " + apellidos);
            System.out.println("----------------------- ");
            
            System.out.println("Digite estado civil: ");
            String estado_civil = sc.nextLine();
            System.out.println("Estado civil: " + estado_civil);
            System.out.println("----------------------- ");
            
            System.out.println("Digite Sexo: ");
            String sexo = sc.nextLine();
            System.out.println("Sexo: " + sexo);
            System.out.println("----------------------- ");
            
            System.out.println("Digite dirección: ");
            String direccion = sc.nextLine();
            System.out.println("Dirección: " + direccion);
            System.out.println("----------------------- ");
            
            System.out.println("Digite celular: ");
            String celular = sc.nextLine();
            System.out.println("Celular: " + celular);
            System.out.println("----------------------- ");
            
            System.out.println("Digite fecha nacimiento en formato DD/MM/AAAA: ");
            String fecha_nacimiento = sc.nextLine();
            System.out.println("Fecha namiciento: " + fecha_nacimiento);
            System.out.println("----------------------- ");
            
            funcionarios Funcionario = new funcionarios();
            
            Funcionario.setCedula(cedula);
            Funcionario.setNombres(nombre);
            Funcionario.setApellidos(apellidos);
            Funcionario.setEstado_civil(estado_civil);
            Funcionario.setSexo(sexo);
            Funcionario.setDireccion(direccion);
            Funcionario.setCelular(celular);
            Funcionario.setFecha_nacimiento(fecha_nacimiento);
            
            FuncionarioController.create(Funcionario);
            
            System.out.println("Se ha registrado un nuevo docente");
            
            getfunciona(FuncionarioController);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void getFuncionario (funcionariosController FuncionarioController){
        
        try {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Digite el ID: ");
            int id = sc.nextInt();
            System.out.println("ID: " + id);
            System.out.println("----------");
            
            funcionarios Funcionario = FuncionarioController.getfuncionarios(id);
            System.out.println("Funcionario = " + Funcionario);
            System.out.println("-----------------");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    
    public static void editfuncionario (funcionariosController FuncionarioController){
        try{
            Scanner sc = new Scanner (System.in);
            
            System.out.println("Digite ID del Funcionario a actualizar");
            int id = sc.nextInt();
            System.out.println("el ID es: " + id);
            System.out.println("------------------");
            
            funcionarios Funcionario = FuncionarioController.getfuncionarios(id);
            if (Funcionario == null){
                System.out.println("No existe registro");
                return;
            }
            
            Scanner c = new Scanner(System.in);
            
            System.out.println("Digite cedula: ");
            String cedula = c.nextLine();
            System.out.println("Cedula: " + cedula);
            System.out.println("----------------------- ");
            
            Scanner n = new Scanner(System.in);
            
            System.out.println("Digite nombre: ");
            String nombre = n.nextLine();
            System.out.println("Nombre: " + nombre);
            System.out.println("----------------------- ");
            
            Scanner a = new Scanner(System.in);
            
            System.out.println("Digite apellidos: ");
            String apellidos = a.nextLine();
            System.out.println("Apellidos: " + apellidos);
            System.out.println("----------------------- ");
            
            Scanner e = new Scanner(System.in);
            
            System.out.println("Digite estado civil: ");
            String estado_civil = e.nextLine();
            System.out.println("Estado civil: " + estado_civil);
            System.out.println("----------------------- ");
            
            Scanner s = new Scanner(System.in);
            
            System.out.println("Digite Sexo: ");
            String sexo = s.nextLine();
            System.out.println("Sexo: " + sexo);
            System.out.println("----------------------- ");
            
            Scanner d = new Scanner(System.in);
            
            System.out.println("Digite dirección: ");
            String direccion = d.nextLine();
            System.out.println("Dirección: " + direccion);
            System.out.println("----------------------- ");
            
            Scanner ce = new Scanner(System.in);
            
            System.out.println("Digite celular: ");
            String celular = ce.nextLine();
            System.out.println("Celular: " + celular);
            System.out.println("----------------------- ");
            
            Scanner fn = new Scanner(System.in);
            
            System.out.println("Digite fecha nacimiento: ");
            String fecha_nacimiento = fn.nextLine();
            System.out.println("Celular: " + fecha_nacimiento);
            System.out.println("----------------------- ");
            
            funcionarios Funcionari = new funcionarios();
            
            Funcionari.setCedula(cedula);
            Funcionari.setNombres(nombre);
            Funcionari.setApellidos(apellidos);
            Funcionari.setEstado_civil(estado_civil);
            Funcionari.setSexo(sexo);
            Funcionari.setDireccion(direccion);
            Funcionari.setCelular(celular);
            Funcionari.setFecha_nacimiento(fecha_nacimiento);
            
            FuncionarioController.updatefuncionarios(id, Funcionari);
            
            System.out.println("Datos actualizados");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    
            public static void deleteFuncionario(funcionariosController FuncionarioController){
        
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite el id del registro a eliminar");
                int id = sc.nextInt();
                System.out.println("el id del registro es: " + id);
                funcionarios Funcionario = FuncionarioController.getfuncionarios(id);
                if (Funcionario == null){
                    System.out.println("No existe registro");
                    return;
                }
                
                FuncionarioController.deletefuncionarios(id);
                System.out.println("Registro eliminado con exito ");
                System.out.println("-----------------------------");
                
                getfunciona(FuncionarioController);
            } catch(SQLException ex){
                ex.printStackTrace();
            }
        }
            public static void main(String[] args){
            
                var opcion  = -1;
                var Scanner = new Scanner(System.in);
                
                funcionariosController FuncionarioController = new funcionariosController ();
                while (opcion != 0){
                    System.out.println("Elige una opción: ");
                    
                    System.out.println("1. Listar funcionarios "  );        
                    System.out.println("2. Agregar funcionario");
                    System.out.println("3. Listar por Id");
                    System.out.println("4. Editar funcionario");
                    System.out.println("5. Eliminar funcionario");
                    
                    opcion = Integer.parseInt(Scanner.nextLine());
                    switch(opcion){
                        case 0:
                            System.out.println("Ha salido de la Aplicación");
                            break;
                        case 1:
                            getfunciona(FuncionarioController);
                            break;
                        case 2: 
                            create(FuncionarioController);
                            break;
                        case 3:
                            getFuncionario(FuncionarioController);
                            break;
                        case 4:
                            editfuncionario(FuncionarioController);
                            break;
                        case 5:
                            deleteFuncionario(FuncionarioController);
                            break;
                        default:
                            System.out.println("Opción inválida");                         
                    }
                }
            }
}
