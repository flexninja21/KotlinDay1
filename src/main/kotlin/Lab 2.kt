import java.lang.NumberFormatException

    var funds : Double = 100.0
    val pswd = "password"
    fun balance() {
        println("current value of funds: $funds")
        }
    fun deposit (amount: Double){
        funds += amount
        println(balance())
        }



    fun main() {

        var input: String
        var cmd: List<String>
        while (true) {
            print("Command: ")
            input = readLine()!!
            cmd = input.split(" ")
            when (cmd[0]) {
                // Each command goes here...
                //Question 2
                "balance" -> balance()
                //Question 3
                "deposit" ->
                    try {
                        deposit(cmd[1].toDouble())
                    } catch (e: NumberFormatException) {
                        println("number format exception")
                    }


                else -> println("Invalid command")
            }
        }
    }


