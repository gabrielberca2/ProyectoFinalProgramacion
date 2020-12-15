
package proyectofinalhotel;
import javax.swing.JOptionPane;

public class Menu {
    
    reservaHabitacion rh =new reservaHabitacion();
    Identificacion id = new Identificacion();
    ReservaDia rd = new ReservaDia();
    ComidaHabitacion ch =new ComidaHabitacion();
    ReservacionPiscina rp = new ReservacionPiscina();
    Turismo t = new Turismo();
    Calificacion c=new Calificacion();
    verReserva vr =new verReserva();
    
    quitarReserva qr = new quitarReserva();
    int preciofinal;
    
    
     private int opc;
     

    public void mostrarMenu() {
        while (opc != 8) {
            
           
            
            opc = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "***MENÚ PRINCIPAL***\n\n"
                            +"Últimos comentarios: "+c.getOpinion()+"\n"
                    + "1.Reservar habitación\n"
                    + "2.Comida a habitación\n"      
                            + "3.Reservar Piscina\n"
                            + "4.Guía Turismo\n"
                            + "5.Calificar servicio virtual\n"
                            + "6.Ver reservacion\n"                           
                            + "7.Ingresar como administrador\n"                         
                    + "8.Salir\n\n"
                    + "Digite su opción:"));
            
            switch (opc) {
                case 1: {
                    id.leerInformacionClientes();
                    rd.reservaDia();
                    rh.reservaHabit();
                    id.impresionInformacionCliente();
                    rd.impresionReservaDía();
                    rh.impresionReservaHabitacion();
                    id.impresionFacturaCliente();
                    
                    break;    
                }
                case 2:{
                    
                    ch.comprar();
                                                       
                    break;
                    //Esta sección posee un error, el cual consiste en que no se van sumando los productos que uno compra, sale el último que compró así mismo con su precio.
                }
                case 3:{
                    rp.reservaPiscina();
                    
                    break;
                }
                  case 4: {
                      t.menuTurismo();
                    
                    break;    
                }
                    case 5: {
                    c.setOpinion(JOptionPane.showInputDialog(null,"Dejenos sus comentarios respecto al nuevo sistema virtual: "));
                    break;    
                }
                      case 6: {
                    vr.menuReservas();
                    break;    
                    //Esta clase tiene un error al imprimir las reservas, debido a que su forma de impresión no es la más óptima y sus valores no cambian y puede llegar a ser un poco confuso.
                }
                        case 7: {
                    qr.administrador();
                    break;    
                    //La contraseña para acceder a modo administrador es 123455
                }
                          case 8: {
                    System.exit(0);
                    break;    
                }
                          
                default:{
                    JOptionPane.showMessageDialog(null,
                            "Opción incorrecta!");
                }
            }
        }
    }

   
}
