import javax.swing.JOptionPane

/*
var i=1
while(i<=10){
    println("i=${i}")
    i=i+2
}
var i=10
while(i>=1){
    println("i=${i}")
    i--
}
*/
var repeticiones= JOptionPane.showInputDialog("Humano ingresa las veces que quieres que se repita").toInt()
var i=1
while(i<=repeticiones){
    println("i=${i}")
    i++
}
