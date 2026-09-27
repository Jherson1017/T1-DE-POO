/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospital.regional.xyz;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author UCF20418
 */
public class HospitalRegionalXYZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
          String rpta = "s";
         PacienteContoller controla = new PacienteContoller();
        while(rpta.equalsIgnoreCase("s")){   
            Paciente p1 = new Paciente();
            
            System.out.println("Ingrese tipo de documento");
            String tipo = sc.nextLine();
            p1.setTipo_documento(tipo);

            System.out.println("Ingrese numero de documento");
            String nro = sc.nextLine();
            p1.setNro_documento(nro);

            System.out.println("Ingrese su nombre");
            String nomb = sc.nextLine();
            p1.setNombre(nomb);

            System.out.println("Ingrese apellido paterno");
            String pat = sc.nextLine();
            p1.setPaterno(pat);

            System.out.println("Ingrese apellido materno");
            String mat = sc.nextLine();
            p1.setMaterno(mat);

            System.out.println("Ingrese fecha de nacimiento");
            String nacimiento = sc.nextLine();
            p1.setFecha_nacimiento(LocalDate.parse(nacimiento));

            p1.verDatos();
             controla.agregarPaciente(p1);
                System.out.println("Desea ingresar otra persona? s/n ");
                rpta = sc.nextLine();
            }
        controla.listarPersonas();       
    }
}
