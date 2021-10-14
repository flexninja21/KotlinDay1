

    var funds : Double = 100.0
    val pswd = "password"
    fun balance() {
        println("current balance: $funds")
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
                        println("Please enter a number")
                    }
                "withdraw"->
                    try {
                        withdraw(cmd[1].toDouble())
                    } catch (e : NumberFormatException) {
                        println("Please enter a number")
                    }


                else -> println("Invalid command")
            }
        }
    }

    fun withdraw(amount: Double) {
        val auth : String
        println("Please enter your password")
        auth = readLine()!!
        if (auth == pswd) {
            funds -= amount
            println(balance())
        }
        else
            println("you have entered the wrong password")
    }


