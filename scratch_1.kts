import java.lang.Math.round

println("Humano!! por favor ingresa un NUMERO: ")
var cal= readLine()!!.toDouble()
var calRound=round(cal).toInt()
if ( (calRound>=0) and (calRound<6) ){
    println("El alumno se chingo")
}
else if( (calRound>=6) and (calRound<=9) ){
    println("El alumno ya chingo")
}
else if(calRound==10){
    println("El alumno es una v3rg4")
}
else{
    println("Humano estupido!!! te dije en mayuculas que ingresara un NUMERO!!")
}


