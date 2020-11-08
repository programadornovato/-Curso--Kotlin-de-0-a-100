var matriz=Array(5){IntArray(5)}
var dato=1
for(i in 0 until matriz.size){
    for(j in 0 until matriz[i].size){
        matriz[i][j]=dato
        dato++
    }
}
for(i in 0 until matriz.size){
    for(j in 0 until matriz[i].size){
        print("${matriz[i][j]}\t")
    }
    println()
}
var diagonalPrincipal=IntArray(matriz.size)
var diagonalSecundaria=IntArray(matriz.size)
for(i in 0 until matriz.size){
    for(j in 0 until matriz[i].size) {
        if(i==j){
            diagonalPrincipal[i]=matriz[i][j]
        }
        if((i+j)==matriz.size-1){
            diagonalSecundaria[i]=matriz[i][j]
        }
    }
}
var suma=0
diagonalPrincipal.forEach {
    print("$it\t")
    suma=suma+it
}
print(" = $suma\n")
suma=0
diagonalSecundaria.forEach {
    print("$it\t")
    suma=suma+it
}
print(" = $suma\n")
