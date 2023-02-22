fun main() {
    var name= arrayOf("sammy","teddy","wendy","kennedy")
    println(name.contentToString())


    var cities = arrayOf("harare","mumbai","dodoma","jakarta")
    for(city in cities){
        println(city.capitalize())}


    var numbers= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum= (numbers[1])+(numbers[4])
    println(sum)

    println(numbers.indexOf(158))
     numbers.sort()
    println(numbers.contentToString())


    var names=(arrayOf("Judy","mark","lisa"))
  println(names.contentToString())

}
fun arrayOf(names:String,):String{
    return arrayOf("names")

}
