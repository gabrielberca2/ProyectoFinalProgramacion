
package proyectofinalhotel;

import javax.swing.JOptionPane;


public class Turismo {
    
     private int opc2;
     int x, y;
     String nosi;
  
            private int reservaTour []=new int [30];
            
     public void menuTurismo() {
         
      while (opc2 != 7) {
            
           
            
            opc2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "***MENÚ TOUR***\n\n"
                    + "1.Museo histórico\n"
                    + "2.Jardín Botánico\n"      
                            + "3.Volcán Turrialba\n"
                            + "4.Rapidos\n"
                            + "5.Canopy\n"
                            + "6.Montar a caballo\n"
                                                    
                    + "7.Salir\n\n"
                    + "Digite su opción:"));
            
            switch (opc2) {
                case 1: {
                    JOptionPane.showMessageDialog(null,"MUSEO HISTÓRICO\n"
                            + "Si lo que buscas es conocer más respecto a tu país, así como su historia y desarrollo por el pasar de los años, este tour es para ti.");
                
                    
                     do{          
         
           y=0;
           
             
                
                 y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el día que desea reservar (1-30): "));
                
                 
                                          
        if (reservaTour[y]==0){
            
            reservaTour[y]= 1 ;
            
            
            nosi="si";
            
        }
        else {
            JOptionPane.showMessageDialog(null,"Este dia esta ocupado, ingrese otro: ");
            
            nosi="no";
        }
        
        
    } while(nosi=="no");
    
    
     JOptionPane.showMessageDialog(null,"Usted ha reservado el día: "+y);
    break;
}
    
    
    
                        
                
                case 2:{
                   JOptionPane.showMessageDialog(null,"JARDÍN BOTÁNICO\n"
                            + "Si lo que buscas es conocer más respecto a la naturaleza y apreciar un hermoso jardín, este tour es para ti.");
                
                    
                     do{          
         
           y=0;
           
             
                
                 y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el día que desea reservar (1-30): "));
                
                 
                                          
        if (reservaTour[y]==0){
            
            reservaTour[y]= 1 ;
            
            
            nosi="si";
            
        }
        else {
            JOptionPane.showMessageDialog(null,"Este dia esta ocupado, ingrese otro: ");
            
            nosi="no";
        }
        
        
    } while(nosi=="no");
    
    
     JOptionPane.showMessageDialog(null,"Usted ha reservado el día: "+y);
                    break;
                }
                case 3:{
                    JOptionPane.showMessageDialog(null,"Volcán Turrialba\n"
                            + "Si lo que buscas es aventurarte en las elevaciones de una montaña y observar dichas lagunas volcánicas, este tour es para ti.");
                
                    
                     do{          
         
           y=0;
           
             
                
                 y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el día que desea reservar (1-30): "));
                
                 
                                          
        if (reservaTour[y]==0){
            
            reservaTour[y]= 1 ;
            
            
            nosi="si";
            
        }
        else {
            JOptionPane.showMessageDialog(null,"Este dia esta ocupado, ingrese otro: ");
            
            nosi="no";
        }
        
        
    } while(nosi=="no");
    
    
     JOptionPane.showMessageDialog(null,"Usted ha reservado el día: "+y);
                    break;
                }
                  case 4: {
                    JOptionPane.showMessageDialog(null,"RÁPIDOS\n"
                            + "Si lo que buscas es vivir adrenalina vajando a gran velocidad en un río, este tour es para ti.");
                
                    
                     do{          
         
           y=0;
           
             
                
                 y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el día que desea reservar (1-30): "));
                
                 
                                          
        if (reservaTour[y]==0){
            
            reservaTour[y]= 1 ;
            
            
            nosi="si";
            
        }
        else {
            JOptionPane.showMessageDialog(null,"Este dia esta ocupado, ingrese otro: ");
            
            nosi="no";
        }
        
        
    } while(nosi=="no");
    
    
     JOptionPane.showMessageDialog(null,"Usted ha reservado el día: "+y);
                    break;    
                }
                    case 5: {
                    JOptionPane.showMessageDialog(null,"CANOPY\n"
                            + "Si lo que buscas es apreciar el paisaje desde las alturas, este tour es para ti.");
                
                    
                     do{          
         
           y=0;
           
             
                
                 y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el día que desea reservar (1-30): "));
                
                 
                                          
        if (reservaTour[y]==0){
            
            reservaTour[y]= 1 ;
            
            
            nosi="si";
            
        }
        else {
            JOptionPane.showMessageDialog(null,"Este dia esta ocupado, ingrese otro: ");
            
            nosi="no";
        }
        
        
    } while(nosi=="no");
    
    
     JOptionPane.showMessageDialog(null,"Usted ha reservado el día: "+y);
                    break;    
                }
                      case 6: {
                   JOptionPane.showMessageDialog(null,"MONTAR A CABALLO\n"
                            + "Si lo que buscas es algo más relajado y al mismo tiempo apreciar tus alrededores, este tour es para ti.");
                
                    
                     do{          
         
           y=0;
           
             
                
                 y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el día que desea reservar (1-30): "));
                
                 
                                          
        if (reservaTour[y]==0){
            
            reservaTour[y]= 1 ;
            
            
            nosi="si";
            
        }
        else {
            JOptionPane.showMessageDialog(null,"Este dia esta ocupado, ingrese otro: ");
            
            nosi="no";
        }
        
        
    } while(nosi=="no");
    
    
     JOptionPane.showMessageDialog(null,"Usted ha reservado el día: "+y);
                    break;    
                }
                      case 7:{
                          break;
                      }
              
                          
                default:{
                    JOptionPane.showMessageDialog(null,
                            "Opción incorrecta!");
                }
            }
        }
    }
     public void resetearTour(){
         x=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el día desea liberar:"));
         reservaTour[x]=0;
     }
 String resultado="";
    
    public void verReservaTour(){
        for (int i=0;i<y;i++){
            
                resultado+=reservaTour[y];
                resultado+="    ";
            
            resultado+="\n";
        }
        JOptionPane.showMessageDialog(null,resultado);
    }

    
}
