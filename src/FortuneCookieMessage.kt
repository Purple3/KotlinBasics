/*
Create a program with a function that returns a fortune cookie message that you can print.
Create a main() function.
From the main() function, call a function, getFortuneCookie(), that returns a String.
Create a getFortuneCookie() function that takes no arguments and returns a String.
In the body of getFortuneCookie(), create a list of fortunes. Here are some ideas:

"You will have a great day!"
"Things will go well for you today."
"Enjoy a wonderful day of success."
"Be humble and all will turn out well."
"Today is a good day for exercising restraint."
"Take it easy and enjoy life!"0
"Treasure your friends because they are your greatest fortune."
Below the list, print: "Enter your birthday: "

Hint: Use print(), not println()
Create a variable, birthday.
Read the user's input form the standard input and assign it to birthday. If there is no valid input, set birthday to 1.
Hint: Use readLine() to read a line of input (completed with Enter) as a String.
Hint: In Kotlin, you can use toIntOrNull() to convert a number as a String to an Integer numeric. If the user enters "", toIntOrNull returns null.
Hint: Check for null using the ? operator and use the ?: operator to handle the null case.
Divide the birthday by the number of fortunes, and use the remainder as the index for the fortune to return.
Return the fortune.
In main(), print: "Your fortune is: ", followed by the fortune string.

Extra practice:
Use a for loop to run the program 10 times, or until the "Take it easy" fortune has been selected.
*/

fun main(args: Array<String>)  {
    println(getFortuneCookie())
}

fun getFortuneCookie() : String {
    var listOfFortuneCookieMessages : List<String> = listOf("You will have a great day!","Things will go well for you today.", "Enjoy a wonderful day of success.", "Be humble and all will turn out well."  )
    print("Enter your birthday: ")
    var birthday = readLine()

    when (birthday?.toIntOrNull()) {
        null -> return "null"
        else -> return birthday?.div(listOfFortuneCookieMessages.size) ?: null
    }
}
