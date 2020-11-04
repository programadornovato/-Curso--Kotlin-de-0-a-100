import javax.swing.JOptionPane

var texto=JOptionPane.showInputDialog("Humano por favor ingresa un palindromo")
if(texto!=null){
    texto=texto.toLowerCase()
    texto=texto.replace("\\s".toRegex(),"")
    var longitud=texto.length
    var igual=true
    var cont=0
    for (ind in longitud-1 downTo 0){
        if(texto[ind]!=texto[cont]) {
            igual=false
            break
        }
        cont++
    }
    if(igual==true){
        JOptionPane.showMessageDialog(null,"Muy bien la frase ${texto} es un palindromo ")
    }else{
        JOptionPane.showMessageDialog(null,"humano estupido la frase ${texto} no es un palindromo ")
    }
}

