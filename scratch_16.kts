import javax.swing.JOptionPane

var aleatorio=(1..5).random()
var numero=JOptionPane.showInputDialog("Humano a ver si puedes adivinar el numero que estoy pensando, ingresa un numero entre 1 y 5").toInt()
while (numero!=aleatorio){
    numero=JOptionPane.showInputDialog("Humano estupido ese no es el numero que estaba pensando, intentalo de nuevo o ingresa 0").toInt()
    if(numero==0){
        break
    }
    aleatorio=(1..5).random()
}
if(numero==0){
    println("A parte de estupido eres impasiente el numero que estaba pensando era ${aleatorio}")
}else{
    println("Bien jugado humano el numero que estaba pensando era ${aleatorio}")
}

