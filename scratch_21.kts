var perros= arrayOf("Monte","Chupacabras","Solovino","Chimelo","El chiquito")

for(i in perros.indices){
    println("El perro ${i+1} es ${perros[i]} ")
}

perros.forEach{ println("el perro es $it ") }