import javax.swing.JOptionPane

var contador=0
var calificacion=0.0
var suma=0.0
var promedio=0.0
var texto:String?=null
do{
    texto=JOptionPane.showInputDialog("Humano por favor ingresa la calificacion del semestre ${contador+1} del alumno o preciona cancelar para terminar")
    if(texto!=null){
        calificacion=texto!!.toDouble()
        suma+=calificacion
        contador++
    }
}while (texto!=null)
if(contador>0){
    promedio=suma/contador
    JOptionPane.showMessageDialog(null,"El promedio del alumno es ${promedio}")
}else{
    JOptionPane.showMessageDialog(null,"Humano a parte de ser estupido eres flojo por lo menos pon una calificacion")
}



