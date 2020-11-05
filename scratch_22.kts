import javax.swing.JOptionPane

var a:IntArray=IntArray(5)
var b:IntArray=IntArray(5)
var c:IntArray=IntArray(10)
var j=0
for (i in (0 until 5)){
    a[i]=JOptionPane.showInputDialog("Humano ingresa el valor del elemento a[${i+1}]").toInt()
}
for (i in (0 until 5)){
    b[i]=JOptionPane.showInputDialog("Humano ingresa el valor del elemento b[${i+1}]").toInt()
}
for(i in (0 until 5)){
    c[j]=a[i]
    j++
    c[j]=b[i]
    j++
}
c.forEach {
    println(it)
}