/*
println("Por favor humano ingresa un texto del menu\nacceso\nconfiguracion\nayuda")
var seleccion= readLine()
seleccion=seleccion!!.toLowerCase()
when(seleccion){
    "acceso"-> println("Haz seleccionado acceso")
    "configuracion"-> println("Haz seleccionado configuracion")
    "ayuda"-> println("Haz seleccionado ayuda")
    else-> println("humano tonto esa opcion no existe")
}
*/
println("Humano saludame con un hola:")
var respuesta= readLine()!!.toLowerCase()
if(respuesta=="hola"){
    println("Hola humano como estas")
}else{
    println("No te entendi")
}




