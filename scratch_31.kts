import javax.swing.JOptionPane

var matrizO=Array(3){IntArray(3)}
var matrizT=Array(3){IntArray(3)}
for(i in 0 until 3){
    for(j in 0 until 3){
        matrizO[i][j]=JOptionPane.showInputDialog("Humano ingresa el valor de la matriz en [${i+1}][${i+1}]").toInt()
    }
}
for(i in 0 until 3){
    for(j in 0 until 3){
        matrizT[i][j]=matrizO[j][i]
    }
}
var textoMatriz=""
for(i in 0 until 3){
    for(j in 0 until 3){
        textoMatriz="$textoMatriz ${matrizT[i][j]}  |  "
    }
    textoMatriz="$textoMatriz\n"
}
JOptionPane.showMessageDialog(null,"Humano aqui esta tu pinche matriz:\n$textoMatriz")



