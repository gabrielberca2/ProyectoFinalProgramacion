
package proyectofinalhotel;
import javax.swing.JOptionPane;

public class verReserva {
    
    ReservaDia rd =new ReservaDia();
    ReservacionPiscina rp =new ReservacionPiscina();
    Turismo t =new Turismo();
    reservaHabitacion rh =new reservaHabitacion();
    private int opc;
     
    
    public void menuReservas(){
        
        
        while (opc != 8) {
            
           
            
            opc = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "***MENÚ PRINCIPAL***\n\n"
                           
                    + "1.Ver reservas de los días.\n"
                    + "2.Ver reserva de habitación.\n"      
                            + "3.Ver reserva de piscina.\n"
                            + "4.Ver reserva de turismo.\n"
                                                   
                    + "5.Salir\n\n"
                    + "Digite su opción:"));
            
            switch (opc) {
                case 1: {
                   
                    rd.verReservaDía();
                    break;    
                }
                  case 2: {
                   rh.verReservaHabitacion();
                    
                    break;    
                }
                    case 3: {
                        rp.verReservaPiscina();
                   
                    
                    break;    
                }
                      case 4: {
                   t.verReservaTour();
                    
                    break;    
                }
                        case 5: {
                   
                    
                    break;    
                }
    }
        }
    }
}
    
               

