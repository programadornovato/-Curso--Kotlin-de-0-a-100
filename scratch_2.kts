import java.lang.Exception
import kotlin.math.PI
try {
    println("Humano dime la cantidad de litros con lo que te emborrachas:")
    var litrosBorracho= readLine()!!.toDouble()
    var miliLitrosBorracho=litrosBorracho*1000
    println("Humano cual es el diametro del vaso:")
    var diametro= readLine()!!.toDouble()
    println("Humano cual es la altura del vaso:")
    var altura= readLine()!!.toDouble()

    var radio=diametro/2

    var volumen= PI*radio*2*altura
    var limiteVasos=miliLitrosBorracho/volumen
    println("humano cuantos vasos de cerbeza has tomado:")
    var vasosTomados= readLine()!!.toDouble()
    if (vasosTomados>=limiteVasos){
        println("Humano ya estas borracho y yo no hablo con borrachos adios!!!")
    }
    else{
        print("Humano te faltan ${limiteVasos-vasosTomados} vasos para estar borracho")
    }
}
catch (e:Exception){
    println("Parece que ya estas borracho porque no escribes bien, adios!!!")
}

