/**Create a main() function that takes an argument representing the time in 24-hour format (values between and including 0 -> 23).

In the main() function, check if the time is before midday (<12), then print "Good morning, Kotlin"; otherwise, print "Good night, Kotlin".

Notes:
Remember that all main() function arguments are Strings, so you will have to convert this argument to an Int before you can apply the check.

Advanced
Try to use Kotlin's string templates to do this in 1 line.
*/

fun main(args: Array<String>) {
    val time : Int = args[0].toInt()
    val salutation : String = if(time < 12) "morning" else "night"
    println("Good ${salutation}, Kotlin")

    /**
     *  1) if (args[0].toInt() < 12) println("Good Morning Kotlin")
     *    else println("Good Night Kotlin" )
     *
     *  2) println("${if (args[0].toInt() < 12) "Good Morning Kotlin" else "Good Night Kotlin"}")
     */

}   