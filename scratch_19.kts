import javax.swing.JOptionPane

var texto=JOptionPane.showInputDialog("Humano por favor ingresa un texto")
if(texto!=null){
    var longitud=texto.length
    var caracteres=CharArray(longitud)
    var cont=0
    for(ind in longitud-1 downTo 0){
        caracteres[cont]=texto[ind]
        cont++
    }
    println(caracteres)
}else{
    println("Humano no seas flojo y coloca un texto")
}


