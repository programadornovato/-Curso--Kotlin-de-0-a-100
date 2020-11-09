class auto{
    private var color=""
    private var modelo=0
    private var marca=""
    private var acceso=false
    public fun meterLlave(llave:String){
        if(llave=="123456"){
            acceso=true
            println("Tienes acceso al auto")
        }else{
            acceso=false
            println("No tienes acceso al auto (sonar alarma)")
        }
    }
    public fun mando(accion:String){
        if(acceso==true){
            if(accion=="encender"){
                enciende()
            }
        }else{
            println("No tienes acceso al auto (sonar alarma)")
        }
    }
    private fun enciende(){
        println("Enciende el auto run run")
    }
    private fun acelera(){
        println("El auto acelero 10Km/h mas")
    }
    private fun frena(){
        println("El auto freno a 10Km/h menos")
    }
}

var vocho1=auto()
vocho1.meterLlave("123456")
vocho1.mando("encender")
