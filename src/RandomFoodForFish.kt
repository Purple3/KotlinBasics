import java.util.*

/*
Implement logic to give random food for fishes on random days
 */

fun main(args : Array<String>) {
    val day : String = dayOfTheWeek()
    println("On "+ day + " fish gets " +  foodForFish(day))
    swim(speed = "slow")
}

fun swim(speed : String = "fast"){
    println("The fish swims $speed")
}

fun dayOfTheWeek() : String {
    var days : Array<String> = arrayOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return days[Random().nextInt(7)]
}

fun foodForFish(day : String) : String {

    return when(day) {
        "Monday" -> "monday-food"
        "Tuesday" -> "tuesday-food"
        "Wednesday" -> "wednesday-food"
        "Thursday" -> "thursday-food"
        "Friday" -> "friday-food"
        "Saturday" -> "saturday-food"
        "Sunday" -> "sunday-food"
        else -> "No food on this day!! Sorry :/"
    }
}