/*You can do the following filter exercise in REPL.

Create a list of spices, as follows:
val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
Create a filter that gets all the curries and sorts them by string length.
Hint: After you type the dot (.), IntelliJ will give you a list of functions you can apply.
Filter the list of spices to return all the spices that start with 'c' and end in 'e'. Do it in two different ways.
Take the first three elements of the list and return the ones that start with 'c'.

 */

val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )

//println(spices.sortedWith( compareBy( {it.length})))
var sortedSpices = spices.filter { it.contains("curry") }.sortedBy{it.length}

//var more = spices.filter{ it.startsWith('c') && it.endsWith('e')}
var moreFilterOnSpices = spices.filter { it[0] == 'c' && it[it.length - 1] == 'e' }

//var three = spices.take(3).filter{it.startsWith('c')}
var firstThreeOnSpices = spices.subList(0,3).filter { it[0] == 'c' }