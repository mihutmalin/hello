package com.example.first

class TEMA1 {

//1
//A. Define a Kotlin class representing a bank Account. The class should keep an evidence of
//the actual balance and should provide functionality to withdraw and deposit money.

    open class Account(var sum: Int) {

        open fun printSum() {
            println("In contul curent se afla suma de $sum lei")
        }

        open fun withdraw(withdrawnSum: Int) {
            sum -= withdrawnSum
            println("S-au retras $withdrawnSum lei")
        }

        open fun deposit(addedSum: Int) {
            sum += addedSum
            println("S-a realizat cu succes operatia de adaugare a $addedSum lei")
        }
    }
    /*
    val cont1 = Account(3200)
    cont1.printSum()
    cont1.withdraw(200)
    cont1.printSum()
    cont1.deposit(500)
    cont1.printSum()
    */
//B. Specialize (subclass) the Account class into a SavingAccount class which allows
//withdrawing only if the balance remains positive.

    open class SavingsAccount(sum1: Int) : Account(sum1) {
        override fun withdraw(withdrawnSum: Int) = if (withdrawnSum > sum) {
            println("Nu se poate extrage suma de $withdrawnSum lei")
        } else {
            sum -= withdrawnSum
            println("S-a relaizat cu succes operatia de extragere a $withdrawnSum lei")
        }
    }
    /*
    val savingAccount1 = SavingsAccount(4000)
    savingAccount1.withdraw(1200)
    */
//2
//Write a function which takes an angle as Int [0, 360) and returns the corresponding cardinal
//directions as String (‘N’, ‘W’, ‘S’, ‘E’).

    fun returnCardinal(angle: Int): String {
        return when (angle) {
            0, 360 -> "E"
            in 1..89 -> "N-E"
            90 -> "N"
            in 91..179 -> "N-W"
            180 -> "W"
            in 181..269 -> "S-W"
            270 -> "S"
            in 271..359 -> "S-E"
            else -> "Nu s-a introdus un unghi cu valoare corespunzatoare"
        }
    }
    /*Testing
    returnCardinal(70)
    returnCardinal(360)
    returnCardinal(450)
    returnCardinal(160)
    */
//3
//Write a function which determines how many vocals are contained in the String given as
//argument.

    fun countVowels(text: String): Int {
        var nr = 0
        val text2 = text.toLowerCase()
        for (i in 0..text.length - 1) {
            when (text2[i]) {
                'a', 'e', 'i', 'o', 'u' -> nr++
            }
        }
        return nr
    }
    /*
    println(countVowels("Am avut tema pentru cursul de Kotlin"))
    */
    //4

    //Nu am reusit sa salvez sub forma de scratch ce am lucrat asa ca l-am incarcat asa
    /*
    val data = listOf(4, 6, 34, 9, 2, 4, 7)

//1.Print the list
    println("The original list is $data ")
//2.Print the list in reverse order
    println("The reversed list is ${data .reversed()}")
//3.Print the list with no duplicates
    println("The list with no duplicates is ${data .distinct()}")
//4.Print first 3 elements of the list
    println("The first 3 elements of the list are ${data .subList(0,3)}")
    //5.Print if all elements are positive
    var k = 0
    data .forEach
    { if (it > 0) k++ }
    if (k == data .size)
    {
        println(data)
    }
//6.Print square root of all elements in the list
    data .forEach
    { print("${kotlin.math.sqrt(it.toDouble())} ") }
//7.Print even numbers only
    data .forEach
    { if (it % 2 == 0) print("$it ") }
//8.Print index (position in the list) of odd numbers
    data .forEachIndexed
    { index, it -> if(it%2 != 0) print("$index ") }
    //9.Print all prime number
    var lastPrime = 0
    var count: Int = 0
    var temp: Int = 0
    data .forEach
    {
        temp = it
        for (i in 2..temp / 2 + 1) {
            while (temp % i == 0) {
                count++
                temp /= i
            }
        }
        if (count <= 1) print("$it ")
        count = 0
        lastPrime = it
    }
//10.Print last prime number
    print(lastPrime)


    //5
    data class Student(val name: String, val address: String, val grade: Int)

    val students = listOf(
        Student("John", "Boston", 6), Student("Jacob", "Baltimore", 2),
        Student("Edward", "New York", 7), Student("William", "Providence", 6),
        Student("Alice", "Philadelphia", 4), Student("Robert", "Boston", 7),
        Student("Richard", "Boston", 10), Student("Steven", "New York", 3)
    )

//1.Print students
    println(students)
//2.Print students in alphabetical order
    println(students.sortedBy
    { it.name })
//3.Print student names only in alphabetical order
    students.sortedBy
    { it.name }.forEach
    { print("${it.name} ") }
//4.Print students sorted by grade and name
    students.sortedWith(compareBy(
    { it.grade },
    { it.name })).forEach
    { print(it) }
//5.Print students grouped by their address
    println(students.groupBy
    { it.address })
*/
}