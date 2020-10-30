import java.text.SimpleDateFormat
import java.util.*

println("Humano por favor ingresa tu fecha de nacimiento en dd/MM/aaaa")
var fechaNacString= readLine()
lateinit var fechaNacDate:Date
try {
    fechaNacDate=SimpleDateFormat("dd/MM/yyyy").parse(fechaNacString)
}
catch (e:Exception){
    println("Humano estupido te dije un fecha valida ${e}")
}
var fechaActual=Date(System.currentTimeMillis())
var diferenciaFechasMili=fechaActual.getTime()-fechaNacDate.getTime()
var segundos=diferenciaFechasMili/1000
var minutos=segundos/60
var horas=minutos/60
var dias=horas/24
var años=dias/365
println("Humano tu edad es de: ${años}")
