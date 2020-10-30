import javax.swing.JOptionPane
/*
var cadena:String=JOptionPane.showInputDialog("Mete el texto")
JOptionPane.showMessageDialog(null,"Aqui esta tu pinche texto: ${cadena}")

var entero=JOptionPane.showInputDialog("Mete el entero")!!.toInt()
entero++
JOptionPane.showMessageDialog(null,"Aqui esta el entero+1:${entero} ")

var flotante=JOptionPane.showInputDialog("Mete el entero")!!.toFloat()
flotante++
JOptionPane.showMessageDialog(null,"Aqui esta el flotante+1:${flotante} ")
*/
var caracter=JOptionPane.showInputDialog("Mete el caracter")[3]
JOptionPane.showMessageDialog(null,"Aqui esta tu caracter: ${caracter} ")
