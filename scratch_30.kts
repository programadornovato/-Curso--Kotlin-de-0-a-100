var alumnos=Array(7){Array<String?>(3){null} }
for(i in (0 until 7)){
    println("Huamno ingresa el nombre del alumno ${i+1}")
    alumnos[i][0]= readLine()
    println("Huamno ingresa el salon del alumno ${i+1}")
    alumnos[i][1]= readLine()
}
println("Humano de que salon quieres ver los alumnos:")
var salon= readLine()
for (i in (0 until 7)){
    if(alumnos[i][1]==salon){
        for (j in (0 until 2)){
            print("${alumnos[i][j]}|")
        }
    }
    println()
}




