fun main() {
    list(listOf("Ruth","Janet","Victor","Jeremy","Mathew"))

    peoplesheight(listOf(45,98,24))
    personObjects()


    var custom =addObjects()
    println(custom)



}
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices like index 2,4,6 etc

fun list(names:List<String>):List<String> {
    val group = mutableListOf<String>()
    for (i in names.indices step 2) {
        group.add(names[i])
    }
    return group
}


// 2.Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height

fun peoplesheight (heigth:List<Int>){
    val average = heigth.average()
    val heigth = heigth.sum()
    println(average)
    println(heigth)
}
// 3. Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age

data class Person (var name:String,var age :Int,var heigth:Int,var weigth:Double)
fun personObjects(){
    val personA = Person("carol",19,164,68.2)
    val personB =Person("jared",24,159,70.3)
    val personC = Person("Mercy",15,138,37.6)
    var  personList = listOf(personA,personB,personC)
    var  sorted = personList.sortedByDescending { person -> person.age }
    println(sorted)
}


// 4. Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
fun addObjects():List<Person>{
    val personD = Person("viola",30,138,69.6)
    val personE = Person("Mathew",10,128,26.6)
    return mutableListOf(personD,personE)


}

// 5 .Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.

data class Car(val registration: String, val mileage: Double)

fun getAverageMileage(cars: List<Car>): Double {
    var totalMileage = 0.0
    for (car in cars) {
        totalMileage += car.mileage
    }
    return totalMileage
}

