println("Hola Humano, por favor ingresa una opcion:")
println("1.- Para acceder")
println("2.- Para configuracion")
println("3.- Para ayuda")
println("4,5,6,7,8,9.- Para salir")
var opcion= readLine()!!.toInt()
when (opcion){
    1-> {
        println("Seleccionaste acceder")
        println("Ingresa tu usuario")
        println("Ingresa tu contraseña")
    }
    2-> println("Seleccionaste configuracion")
    3-> println("Seleccionaste ayuda")
    in(4..9)-> println("Adios humano te voy a extrañar")
    else-> println("Humano estupido la opcion ${opcion} no esta en la put** lista")
}