/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.regional.xyz;

import java.util.ArrayList;

/**
 *
 * @author UCF20418
 */
public class PacienteContoller {
         ArrayList<Paciente> lista = new ArrayList();
     
     public void agregarPersonas(Paciente nuevopaciente){
        lista.add(nuevopaciente);
    }
     
     public void listarPersonas(){
        for(int i=0; i<lista.size(); i++){
            Paciente p  = lista.get(i);
            p.verDatos();
        }
    }
}
