import java.lang.Exception

println("Hola humano, bienvenido al banco pn")
println("Ingresa el numero de alguna de las opciones")
println("1.- Ver saldo")
println("2.- Ingresar dinero")
println("3.- Sacar dinero")
println("4.- Salir")
try {
    var opcion= readLine()!!.toInt()
    var saldo=100.00
    when(opcion){
        1->{
            println("Humano tu saldo es de ${saldo}")
        }
        2->{
            println("Humano cuanto dinero vas a ingresar:")
            var dineroIngresar= readLine()!!.toDouble()
            saldo=saldo+dineroIngresar
            println("Opracion realizada con exito, tu saldo es: $${saldo}  ")
        }
        3->{
            println("Humano cuanto dinero vas a a sacar:")
            var dineroSacar= readLine()!!.toDouble()
            if ( (saldo-dineroSacar)<0 ){
                println("Hey humano pillin, no tienes tanto dinero!!!")
                println("Tu saldo es: $${saldo}  ")
            }else{
                saldo=saldo-dineroSacar
                println("Opracion realizada con exito, tu saldo es: $${saldo}  ")
            }
        }
        4->{
            println("El pn te agradece que lo hayas usado")
        }
        else->{
            println("Esta opcion no es valida")
        }
    }
}
catch (e:Exception){
    println("Opreacion incorrecta ${e} ")
}


