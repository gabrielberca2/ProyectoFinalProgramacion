
package proyectofinalhotel;
import javax.swing.JOptionPane;

public class ReservaDia {
    
    
      

    String condicion;
    int contraseña;
    String nosi;
      int x;
           int y;
           int z;

    private int reserva [][]=new int [30][12];
    
    public void resetearDia(){
        int x;
        int y;
        
             y=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el mes:"));
                x=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el día:")); 
                
                reserva [x][y]=0;
        
        
       
        

    }
    
    
    
    public void reservaDia(){
        
        
       do{          
         
           x=0;
           y=0;
             
                 x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el mes que desea reservar (1-12): "));
                 y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el día que desea reservar (1-30): "));
                
                 
                                          
        if (reserva[x][y]==0){
            
            reserva[x][y]= 1 ;
            
            
            nosi="si";
        }
        else {
            JOptionPane.showMessageDialog(null,"Este dia esta ocupado, ingrese otro: ");
            
            nosi="no";
        }
        
        
    } while(nosi=="no");
    
    
    
    
}
    
    public void impresionReservaDía(){
        JOptionPane.showMessageDialog(null,"Usted ha reservado el día: "+y+", del mes: "+x);
        
    }
    
    String resultado="";
    
    public void verReservaDía(){
        for (int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                resultado+=reserva[x][y];
                resultado+="    ";
            }
            resultado+="\n";
        }
        JOptionPane.showMessageDialog(null,resultado);
    }

  
    
}

