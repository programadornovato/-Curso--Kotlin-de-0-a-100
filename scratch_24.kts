import javax.swing.JOptionPane

var mayor=0
var texto=JOptionPane.showInputDialog("Humano por favor ingresa una lista de numeros separados por comas")
var listaNumerosTexto=texto.split(",".toRegex()).toTypedArray()
var cantidad=listaNumerosTexto.size
/*
listaNumerosTexto.forEach {
    println(it)
}
*/
var listaNumeros=IntArray(cantidad)
for (i in (0 until cantidad)){
    listaNumeros[i]=listaNumerosTexto[i].toInt()
}
listaNumeros.forEach {
    if(it>mayor){
        mayor=it
    }
}
JOptionPane.showMessageDialog(null,"Humano este es tu numero mayor=$mayor")


