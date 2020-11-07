import javax.swing.JOptionPane

var fil=JOptionPane.showInputDialog("Humano ingresa la cantidad de filas de tu matriz").toInt()
var col=JOptionPane.showInputDialog("Humano ingresa la cantidad de columnas de tu matriz").toInt()
var matriz=Array(fil){IntArray(col)}
var esSimetrica=true
for (i in 0 until fil){
    for (j in 0 until fil){
        matriz[i][j]=JOptionPane.showInputDialog("Matriz[${i+1}][${j+1}]").toInt()
    }
}
if(fil==col){
    for (i in 0 until fil) {
        for (j in 0 until fil) {
            if(matriz[i][j]!=matriz[j][i]){
                esSimetrica=false
                break
            }
        }
        if(esSimetrica==false){
            break
        }
    }
    if(esSimetrica==true){
        JOptionPane.showMessageDialog(null,"Felicidades humano tu matriz si es simetrica")
    }else{
        JOptionPane.showMessageDialog(null,"Nop no es simetrica")
    }
}else{
    JOptionPane.showMessageDialog(null,"Que pend... ni siquiera es cuadrada tu matriz")
}



