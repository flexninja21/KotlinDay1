import java.lang.NumberFormatException

    var funds : Double = 100.0
    val pswd = "password"



    fun main() {
        fun balance() {
            println("current value of funds: $funds")
        }
        fun deposit (amount: Double){
            funds += amount
            println(balance())
        }
        var input: String
        var cmd: List<String>
        while (true) {
            print("Command: ")
            input = readLine()!!
            cmd = input.split(" ")
            when (cmd[0]) {
                // Each command goes here...
                "balance" -> balance()
                "deposit" -> {
                    try {
                        deposit(cmd[1].toDouble())
                    } catch (e: NumberFormatException) {
                        println("number format exception")
                    }
                }

                else -> println("Invalid command")
            }
        }
    }


