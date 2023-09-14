fun main(){
    greeting()
    greetingTo("Parker Peter")
    greetingTo("Black Widow")
}

//function without params and without return

fun greeting(){
    println("Greeting for everyone")
}

//function with params and without return

fun greetingTo(name: String){
    println("Hello $name")
    println("Welcome")
}