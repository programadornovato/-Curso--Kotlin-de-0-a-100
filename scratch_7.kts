import java.lang.Exception
import kotlin.math.ceil
println("Bienvenido a tiendas PN")
try {
    println("Ingrese el valor del producto 1")
    var prod1= readLine()!!.toDouble()
    println("Ingrese el valor del producto 2")
    var prod2= readLine()!!.toDouble()
    println("Ingrese el valor del producto 3")
    var prod3= readLine()!!.toDouble()
    var suma=prod1+prod2+prod3
    println("¿El cliente desea redondear sus centavos? S/N")
    var respuesta= readLine()
    if( (respuesta=="S") or (respuesta=="s") ){
        var totalMasRendondeo= ceil(suma)
        var redondeo=totalMasRendondeo-suma
        println("Gracias por redondear %.2f".format(redondeo))
    }else{
        println("Pinche cliente miserable")
    }
}catch (e:Exception){
    println("Pinche cajero tonto cometiste un error ${e} ")
}



