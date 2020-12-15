
package proyectofinalhotel;
import javax.swing.JOptionPane;

public class quitarReserva {
    ReservacionPiscina rp =new ReservacionPiscina();
    ReservaDia rd =new ReservaDia();
    reservaHabitacion rh =new reservaHabitacion();
    Turismo t = new Turismo();
    int menuAdmin;
    int contraseña;
    
    public void administrador(){
        
        contraseña=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la conreaseña para acceder al modo administrador: "));
        if (contraseña==12345){
            
             while (menuAdmin != 8) {
            
           
            
            menuAdmin = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "***MENÚ ADMINISTRADOR***\n\n"
                            
                    + "1.Quitar reserva de habitación.\n"
                    + "2.Quitar reserva de día.\n"      
                            + "3.Quitar reserva de piscina.\n"
                            + "4.Quitar reserva de tour.\n"
                                                
                    + "5.Salir\n\n"
                    + "Digite su opción:"));
            
            switch (menuAdmin) {
                case 1: {
                    rh.resetearHabitaciones();
                    break;
                    
                }
                case 2: {
                    rd.resetearDia();
                    break;
                }
                case 3:{
                    rp.resetearDia();
                    break;
                }
                case 4:{
                    t.resetearTour();
                }
                case 5:{
                    return;
             }
                
                
                
                
            }
                }
             
             
             
             
             
            
        }else{
            JOptionPane.showMessageDialog(null,"ACCESO DENEGADO");
        }
        
        
        
        
    }
            
    
    
    
}
