import javax.swing.JOptionPane

var listaNumeros=IntArray(5)
for (i in (0 until 5)){
    listaNumeros[i]=JOptionPane.showInputDialog("Humano ingresa el elemento ${i+1}").toInt()
}
var menor=0
var pos=0
var tem=0
for(i in (0 until listaNumeros.size-1)){
    menor=listaNumeros[i]
    pos=i
    for(j in (i+1 until listaNumeros.size)){
        if(listaNumeros[j]<menor){
            menor=listaNumeros[j]
            pos=j
        }
    }
    if(pos!=i){
        tem=listaNumeros[i]
        listaNumeros[i]=listaNumeros[pos]
        listaNumeros[pos]=tem
    }
}
println("Humano aqui estan tu lista ordenada de forma acendente")
for(i in (0 until listaNumeros.size)){
    println(listaNumeros[i])
}
println("Humano aqui estan tu lista ordenada de forma decendente")
for(i in (listaNumeros.size-1 downTo 0)){
    println(listaNumeros[i])
}
