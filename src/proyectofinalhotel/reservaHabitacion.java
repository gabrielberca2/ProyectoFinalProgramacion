
package proyectofinalhotel;
import javax.swing.JOptionPane;

public class reservaHabitacion {
    
     
    int reservaHabitacion;
    String condicionHabitacion;
    int contraseña;
    String nosi;
    

    private int habitacion []=new int [115];
  
  
    
    public void resetearHabitaciones(){
        int x;
        x=Integer.parseInt(JOptionPane.showInputDialog(null,"Que habitación desea liberar(115 habitaciones):"));
        habitacion[x]=0;
    }
    
    
    
    public void reservaHabit(){
        
        
       do{               
        reservaHabitacion=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la habitación que desea reservar (poseemos 115 habitaciones): "));
        
        
        if (habitacion[reservaHabitacion]==0){
            habitacion[reservaHabitacion]= 1 ;
            
            nosi="si";
        }
        else {
            JOptionPane.showMessageDialog(null,"Esta habitación está ocupado, ingrese otra: ");
            nosi="no";
        }
        
        
    } while(nosi=="no");
    
    
    
    
}
    
    public void impresionReservaHabitacion(){
        JOptionPane.showMessageDialog(null,"Usted ha realizado una reserva en la habitación: "+reservaHabitacion);
        
    }
   
     String resultado="";
    
   
    
}
    


