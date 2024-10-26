import javax.swing.JOptionPane;
public class Ejerciocio_1 {
    public static void main(String[] args){
        short A=0, B=0;
        System.out.println("introduze dos valores distintos");
        JOptionPane.showMessageDialog(null,"introduze dos valores distintos");
    
        A= Short.parseShort(JOptionPane.showInputDialog("asigna un valor a A"));
        B= Short.parseShort(JOptionPane.showInputDialog("asigna un valor a B"));
       
        if (A==B){
            JOptionPane.showMessageDialog(null,"A y B son iguales" );
        }else if (A>B){
           JOptionPane.showMessageDialog(null,"A es el mayor");
        
        }else{ 
            JOptionPane.showMessageDialog(null,"B es el mayor");
        } 
    }
}
