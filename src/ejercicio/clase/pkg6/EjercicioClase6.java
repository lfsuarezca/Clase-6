/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.clase.pkg6;

import java.util.*;

/**
 *
 * @author Estudiante
 */
public class EjercicioClase6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Empresa empresa = new Empresa("xxx", 123);

        int continuar = 0, opcion = 0;

        do {
            System.out.println("1. Crear Departamento");
            System.out.println("2. Crear Empleado");
            System.out.println("3. Listar Departamento");
            opcion = in.nextInt();

            if (opcion == 1) {

                System.out.println("Nombre Departamento");
                String nombre = in.next();
                Departamento nuevo = new Departamento(nombre);
                if (empresa.addDepartamento(nuevo)) {
                    System.out.println("Se agrego satisfactoriamente");
                } else {
                    System.out.println("Problemas al registrar el departamento");
                }

            } else if (opcion == 2) {

            } else if (opcion == 3) {
                ArrayList<Departamento> departamentos = empresa.listarDepartamentos();
                for (Departamento departamento : departamentos) {
                    System.out.println(departamento.getNombre());
                }
            } else {
                System.out.println("1. Listar Departamento");
            }

        } while (continuar == 0);
    }

    }
