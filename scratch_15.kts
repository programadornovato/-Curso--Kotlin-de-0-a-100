import javax.swing.JOptionPane

var altura=JOptionPane.showInputDialog("Humano por favor ingresa el tamaño de tu piche escalera").toInt()
for (numAsteriscos in (1 .. altura)){
    for (i in (1 .. numAsteriscos)){
        print("*")
    }
    println("")
}


