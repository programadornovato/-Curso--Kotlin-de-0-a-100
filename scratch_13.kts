import javax.swing.JOptionPane

/*
for(x in (0..9)){
    println("x=${x}")
}
for(x in (0 until 10)){
    println("x=${x}")
}
for(x in (0 until 10) step 2 ){
    println("x=${x}")
}
for(x in (10 downTo 0) ){
    println("x=${x}")
}
*/
var repetir=JOptionPane.showInputDialog("Humano por favor ingresa el numero de repeticiones").toInt()
for (x in (0 until repetir)) println("x=${x+1}")

