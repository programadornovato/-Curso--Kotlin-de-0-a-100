import javax.swing.JOptionPane

var numeroBuscar=JOptionPane.showInputDialog("humano ingresa el numero que quieres buscar").toInt()
var listaNumeros=IntArray(7)
for(i in (0 until 7)){
    listaNumeros[i]=JOptionPane.showInputDialog("Humano ingresa el valor del elemento ${i+1} ").toInt()
}
var pos=0
var bandera=false
while(pos<7 && bandera==false){
    if(numeroBuscar==listaNumeros[pos]){
        bandera=true
        break
    }
    pos++
}
if(bandera==true){
    println("Humano el numero $numeroBuscar se encontro el la posicion ${pos+1}")
}else{
    println("Humano estupido el numero $numeroBuscar no se enconbtro en la lista")
}

