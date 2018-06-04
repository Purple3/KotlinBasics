/* Quiz 13 & 15
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
    println(whatShouldIDo("happy"))
    println("how is your mood today?")
    var readMood : String = readLine()!!
    println(whatShouldIDo(readMood))
}

fun isVeryHot( temperature: Int) = temperature >= 35 || temperature == 0
fun whatIstheMood(mood: String) = mood == "happy"
fun howIsTheWheather(weather: String) = weather == "sunny"

//fun isVeryHot (temperature: Int) = temperature > 35
//fun isSadRainyCold (mood: String, weather: String, temperature: Int) =
//        mood == "sad" && weather == "rainy" && temperature == 0
//fun isHappySunny (mood: String, weather: String) = mood == "happy" && weather == "sunny"


fun whatShouldIDo(mood : String, weather: String = "sunny", temperature : Int = 24) : String {
    return when { // when can be used without parameters
        whatIstheMood(mood) && howIsTheWheather(weather) && isVeryHot(0) -> return "Stay in bed"
        isVeryHot(35)-> "go swimming"
        else -> "Do nothing"
    }
}