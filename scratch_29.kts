import javax.swing.JOptionPane


var matriz = arrayOf(
    intArrayOf(5, 20, 30),
    intArrayOf(8, 15, 5),
    intArrayOf(54, 5, 2)
)
for (i in (0 until 3)){
    for (j in (0 until 3)){
        print("${matriz[i][j]},")
    }
    println()
}

var reg= JOptionPane.showInputDialog("Humano cuantos registro tene tu matriz:").toInt()
var col= JOptionPane.showInputDialog("Humano cuantas columnas tene tu matriz:").toInt()

var matriz = Array(reg) { IntArray(col) }
for(i in (0 until reg)){
    for(j in (0 until col)){
        matriz[i][j]=JOptionPane.showInputDialog("Matriz[${i+1}][${j+1}]:").toInt()
    }
}
println("Humano esta es tu matriz");
for(i in (0 until reg)){
    for(j in (0 until col)){
        print("${matriz[i][j]},");
    }
    System.out.println();
}