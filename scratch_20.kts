import javax.swing.JOptionPane

var calificacion=0.0
var calificaciones:DoubleArray=DoubleArray(4)
var semestre=0
var suma=0.0
var promedio=0.0
do{
    var textoCalificacion=JOptionPane.showInputDialog("Humano ingresa la calificacion del semestre ${semestre+1}")
    if(textoCalificacion==null){
        break
    }
    calificacion=textoCalificacion!!.toDouble()
    calificaciones[semestre]=calificacion
    semestre++
}while (semestre<4)
calificaciones.forEach {
    suma+=it
}
promedio=suma/semestre
JOptionPane.showMessageDialog(null,"El promedio del alumno es: $promedio")