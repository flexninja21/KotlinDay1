fun main() {
    // Question 1
    println("Hello World!")
    //Question 2
    var a = "Hello!"
    println(a)



    fun calculateY(m : Int, x : Int, c : Int) : Int {
        // y = mx + c - formula for a straight line
        return m * x + c
    }

    //Question 3
    for (i in -5..6)
    println("y=3x-1\n" +"$i " + calculateY(3,i,-1))

   //Question 4
    for (i in 0..20) {
        val x = calculateY(3, i, 5)
        val y = calculateY(4, i, 2)

        if (x == y) {
            println("the lines intersect at points ($i,$y)")
        }
    }


        //Question 5
        fun intersection(mOne: Int, cOne: Int, mTwo: Int, cTwo: Int): Unit {
            //var x: Int
            for (i in 1..100) {
                val yOne = calculateY(mOne, i, cOne)
                val yTwo = calculateY(mTwo, i, cTwo)
                // This function takes the equations of two lines:
                // yOne = mOne * x + cOne and yTwo = mTwo * x + cTwo
                if (yOne == yTwo) {
                   println("the lines intersect at $i")
                }
                else
                    println("Don't intersect")
            }

                // and prints the X value they intersect at
                // or prints "Don't intersect" if they do not.
                // You only need to check x values between 0 and 100

        }

    println(intersection(3,5,4,2))

    }















