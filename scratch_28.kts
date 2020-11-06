import javax.swing.JOptionPane

var numeroBuscar=JOptionPane.showInputDialog("humano ingresa el numero que quieres buscar").toInt()
var listaNumeros=IntArray(7)
for(i in (0 until 7)){
    listaNumeros[i]=JOptionPane.showInputDialog("Humano ingresa el valor del elemento ${i+1} ").toInt()
}
var n=listaNumeros.size
var inf=0
var centro=0
var sup=n-1
var bandera=false
while (inf<=sup){
    centro=(sup+inf)/2
    if(numeroBuscar==listaNumeros[centro]){
        bandera=true
        break
    }else if(numeroBuscar<listaNumeros[centro]){
        sup=centro -1
    }else{
        inf=centro +1
    }
}
if(bandera==true){
    println("Humano el numero $numeroBuscar esta en la posicion ${centro+1}")
}else{
    println("Humano estupido el numero $numeroBuscar no esta en el arreglo ")
}




