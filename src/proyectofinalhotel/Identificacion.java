
package proyectofinalhotel;
import javax.swing.JOptionPane;

public class Identificacion {
    
    private int cantidad;
    public int repetir;
    public String nombre;
    public int edad;
    public int cedula;
    public String residencia;
    public String informacion;
    public String impresion;
    private  String condicional;
    private int precio;
    int descuento,total,totalSinDesc;
    
   
    public void leerInformacionClientes () {
  
  
     this.condicional="";
  
         
    cantidad=Integer.parseInt(JOptionPane.showInputDialog(null,"Bienvenidos a Hotel Villa Paraiso. Ingrese la cantidad de miembros que desean hospedar: \n"
            + "Actualmente hay un descuento deñ 10% si son más de 3 personas."));
  
  
    int cant [] = new int [cantidad];
    int x;
    
    for ( x=0;x<cant.length;x++){
        nombre= JOptionPane.showInputDialog(null,"Ingrese su nombre completo:");
        cedula=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su numero de cedula: "));
        edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su edad: "));
        residencia=JOptionPane.showInputDialog(null,"Ingrese su residencia: ");
        
        informacion= informacion + "Nombre: "+ nombre + ", Cédula: "+ cedula + ", Edad: "+ edad  +" años, Residencia: "+ residencia + "\n";
        impresion= informacion+ " ";
        
    }
        
           
    
}
    
    public void impresionInformacionCliente(){
        JOptionPane.showMessageDialog(null,"A continuación se le demostrara la informacion de los huepedes de la siguiente manera: "+
                "\n"
                + impresion);
        
        
    }
    public void impresionFacturaCliente(){
        
         
     if (cantidad>3){
           totalSinDesc=getCantidad()*45000;
           descuento=(totalSinDesc/100)*10;
           total=totalSinDesc-descuento;
           JOptionPane.showMessageDialog(null,"El total a pagar es de 45 000 por persona para un total de: "
                   + "\n"+totalSinDesc
           +"\nCon un descuento de: "+descuento
           +"\nPara un total de: "+total
           +"\nCon una cantidad de: "+getCantidad()+" personas");
           
       }
       else{
           totalSinDesc=getCantidad()*45000;
           JOptionPane.showMessageDialog(null,"El total a pagar es de 45 000 por persona para un total de: "+totalSinDesc
           +"\nCon una cantidad de: "+getCantidad()+" personas");
       }
    }
    
    
    public String getCondicional() {
        return condicional;
    }

    public void setCondicional(String condicional) {
        this.condicional = condicional;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

 
    
    
    
        
    }
    
    

