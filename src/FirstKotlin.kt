import java.util.*

/** Create a new Kotlin file.
Copy and paste the main() function from Hello World into the file.
Create a new function, dayOfWeek().
In the body of the function, print "What day is it today?"
Call dayOfWeek() from main().
Run your program.

In the body of the dayOfWeek() function, answer the question by printing the current day of the week.

Hints
You can use Java libraries (java.util) from Kotlin. For example, to get the day of the week:
Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
Type in the code, then press Option + Enter in Mac, or Alt + Enter in Windows, over the red Calendar class to import the library.
Use a when statement to print a string depending on the day. Sunday is the first day of the week.
 */

fun main (args: Array<String>) {
    println("Hello World")
    dayOfWeek()
}

fun dayOfWeek() {
    println("What day is today?")
    /** when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
    } */

    println(when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Today is not a valid day"
    })

}