import javax.swing.JOptionPane

var numero=JOptionPane.showInputDialog("Humano por favor escribe un numero entre 1 y 999").toInt()

if (numero>0 && numero<10){
    JOptionPane.showMessageDialog(null,"El numero ${numero} es unidad ")
}else{
    if(numero >=10 && numero <99){
        JOptionPane.showMessageDialog(null,"El numero ${numero} es decena ")
    }else{
        if(numero >=100 && numero <999){
            JOptionPane.showMessageDialog(null,"El numero ${numero} es centena ")
        }
    }
}