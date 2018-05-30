/*
Create a program that suggests an activity based on various parameters.
Start in a new file with a main function.
From main(), create a function, whatShouldIDoToday().
Let the function have three parameters.
mood: a required string parameter
weather: a string parameter that defaults to "sunny"
temperature: an Integer parameter that defaults to 24 (Celsius).
Use a when construct to return some activities based on combinations of conditions. For example:
mood == "happy" && weather == "Sunny" -> "go for a walk"
else -> "Stay home and read."
Copy/paste your finished function into REPL, and call it with combinations of arguments. For example:
whatShouldIDoToday("sad")
> Stay home and read.
Note: Keep your work as you will do more with this code in the next practice.
*/

fun main(args : Array<String>) {
    println(whatShouldIDo("sad"))
}

fun whatShouldIDo(mood : String, weather: String = "sunny", temperature : Int = 24) : String {
    return when {
        mood == "happy" && weather == "sunny" -> return "go for a walk"
        else -> "stay home and read"
    }
}