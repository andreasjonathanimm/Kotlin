//import kotlin.reflect.KProperty
//import kotlin.random.Random
//import kotlin.math.*
//import com.dicoding.oop.utils.*
//
//class Basic {
//    // main function
//    fun main() {
//        println("Hello Kotlin!")
//
//        val name = "Alfian"
//
//        print("Hello my name is $name")
//        print(if(true) "Always true" else "Always false")
//
//        var company: String = "Dicoding"
//        val company2: String = "Dicoding Academy"
//
//        val company3 = "Dicoding" + company2
//
//        var character: Char = 'A'
//        character++ // B
//        character++ // C
//
//        print(company[0]) // D
//
//        for (char in company){
//            print("$char ") // D I C O D I N G
//        }
//
//        val statement = "Kotlin is \"Awesome!\""
//        val name2 = "Unicode Test: \u00A9" // Copyright symbol
//
//        val line = "Line 1\n" +
//                "Line 2\n" +
//                "Line 3\n"
//
//        val line2 = """
//            Line 1
//            Line 2
//            Line 3
//        """.trimIndent()
//
//        // Has returns (function)
//        fun setUser(name: String, age: Int) /*: String */ = "Your name is $name, and you are $age years old" /*{
//            return
//        }*/
//
//        // No returns (procedure)
//        fun printUser(name: String)/*: Unit*/ {
//            print("Your name is $name")
//        }
//
//        /*val openHours = 7
//        val now = 20
//        val office: String
//        if (now > openHours) {
//            office = "office already open"
//        } else {
//            office = "Office is closed"
//        }
//        office = if(now > openHours) {
//            "Office already open"
//        } else if (now == openHours) {
//            "Wait a minute, office will be open"
//        } else {
//            "Office is closed"
//        }*/
//
//        val officeOpen = 7
//        val officeClosed = 16
//        val now = 20
//
//        val isOpen = now in (officeOpen..officeClosed)
//        print("Office is open: $isOpen")
//
//        var intNumber = 100
//        val longNumber/*: Long */= 100L
//        val shortNumber: Short = 10
//        var byteNumber = 0b11010010
//        val doubleNumber: Double = 1.3
//        val floatNumber: Float = 0.1234567f
//        val maxInt = Int.MAX_VALUE
//        val minInt = Int.MIN_VALUE
//        byteNumber = 10
//        intNumber = byteNumber.toInt()
//
//        val readableNumber = 1_000_000
//        print(readableNumber) // 1000000
//
//        val array = arrayOf(1, 3, 5, 7, "Dicoding", true)
//        var intArray = intArrayOf(1, 3, 5, 7)
//        intArray[2] = 11
//
//        intArray = Array(4, { i -> i * i }).toIntArray()
//
//        val text: String? = null
//        // text?.length
//        /*if (text != null) {
//            val textLength = text.length
//        }*/
//        val textLength = text?.length ?: 7 // if null 7, if not null get length
//
//        // val textLength = text!!.length // forces the variable to be non-null (DANGEROUS!!)
//
//        val hour = 7
//        print("Office ${if (hour > 7) "already close" else "is open"}")
//
////        val color: Color = Color.valueOf("RED")
////        println("Color is $color")
////        println("Color value is ${color.value.toString(16)}")
////
////        val colors: Array<Color> = Color.values()
////        colors.forEach{ color ->
////            print("$color ")
////        }
//        val colors: Array<Color> = enumValues()
//        colors.forEach{ color ->
//            println(color)
//        }
//
//        val color: Color = enumValueOf("RED")
//        println("Color is $color")
//        println("Position RED is ${color.ordinal}")
//
//        when(color) { // Must be exhaustive
//            Color.RED -> print("Color is RED")
//            Color.BLUE -> print("Color is BLUE")
//            Color.GREEN -> print("Color is GREEN")
//        }
//
//        val value = sum3(1, 1 * 4)
//
//        val stringOfValue = when(value) {
//            5 -> {
//                println("Five")
//                "value is 5"
//            }
//            6 -> {
//                println("Six")
//                "value is 6"
//            }
//            7 -> {
//                println("Seven")
//                "value is 7"
//            }
//            else -> {
//                println("Undefined")
//                "value cannot be reached"
//            }
//        }
//        println(stringOfValue)
//
//        val anyType: Any = 100L
//        when(anyType) {
//            is Long -> println("the value has a Long type")
//            is String -> println("the value has a String type")
//            else -> println("undefined")
//        }
//
//        val value3 = 27
//        val ranges = 10..50
//
//        when (value3) {
//            in ranges -> println("value is in range")
//            !in ranges -> println("value is outside the range")
//            else -> println("value is undefined")
//        }
//
////        val registerNumber = when(val regis = getRegisterNumber()) {
////            in 1..50 -> 50 * regis
////            in 51.100 -> 100 * regis
////            else -> regis
////        }
//
//        val rangeInt = 1..10
//        print(rangeInt.step) // 1
//
//        val rangeInt2 = 1..10 step 2
//        rangeInt2.forEach{
//            print("$it ")
//        }
//        println(rangeInt2.step)
//
//        val rangeInt3 = 1.rangeTo(10)
//        val downInt = 10.downTo(1)
//
//        val tenToOne = 10.downTo(1)
//        if (7 in tenToOne) println("Value 7 is available")
//
//        val rangeChar = 'A'..'F'
//
//        for (i in ranges) {
//            print("$i ")
//        }
//
//        for ((index, value) in ranges.withIndex()) {
//            println("value $value with index $index")
//        }
//
//        ranges.forEach{ value ->
//            println("value is $value!")
//        }
//
//        ranges.forEachIndexed{ index, value ->
//            println("value $value with index $index")
//        }
//
//        ranges.forEachIndexed{ index, _ ->
//            println("index $index")
//        }
//
//        val listOfInt = listOf(1, 2, 3, null, 5, null, 7)
//
//        for (i in listOfInt) {
//            if (i == null) continue
//            print(i)
//        }
//
//        loop@ for (i in 1..10){
//            println("Outside Loop")
//
//            for (j in 1..10) {
//                println("Inside Loop")
//                if (j > 5) break@loop
//            }
//        }
//
//        val numberList = listOf(1, 2, 3, 4, 5)
//        var charList = listOf('a', 'b', 'c')
////        val anyList = listOf('a', "Kotlin", 3, true, User("Bro", 18))
//        val anyList = mutableListOf('a', "Kotlin", 3, true, User("Bro", 18))
//        anyList.add('d')
//        anyList.add(1, "love")
//        anyList[3] = false
//        anyList.removeAt(0)
//
//        println(anyList[3])
//
//        val integerSet = setOf(1, 2, 4, 2, 1, 5)
//        println(integerSet) // [1,2,4,5]
//        println(integerSet == setOf(1, 2, 4, 5)) // true
//        print(5 in integerSet) // true
//
//        val setA = setOf(1, 2, 4, 2, 1, 5)
//        val setC = setOf(1, 5, 7)
//        val union = setA.union(setC)
//        val intersect = setA.intersect(setC)
//
//        val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
//        // mutableSet[2] = 6 // dak bisa
//        mutableSet.add(6)
//        mutableSet.remove(1)
//
//        println(union) // 1, 2, 4, 5, 7
//        println(intersect) // 1, 5
//
//        val capital = mapOf(
//            "Jakarta" to "Indonesia",
//            "London" to "England",
//            "New Delhi" to "India"
//        )
//        println(capital["Jakarta"]) // println(capital.getValue("Jakarta"))
//        println(capital["Amsterdam"]) // null
//        // println(capital["Amsterdam"]) // Exception: NoSuchElementException
//
//        val mapKeys = capital.keys // [Jakarta, London, New Delhi]
//        val mapValues = capital.values // [Indonesia, England, India]
//
////        val mutableCapital = capital.toMutableMap()
////        mutableCapital.put("Amsterdam", "Netherlands")
//    //        Namun perlu diperhatikan bahwa menggunakan mutable collection
//    //        itu tidak disarankan. Apabila terdapat sebuah mutable collection yang diubah oleh lebih dari 1 proses,
//    //        hasil nya akan sulit untuk diprediksi. Untuk itu, sebaiknya gunakan immutable sebisa mungkin, jika memang
//    //        dibutuhkan untuk diubah, baru gunakan mutable.
////        mutableCapital.put("Berlin", "Germany")
//
//        val numberList2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//        val evenList = numberList2.filter { it % 2 == 0 } // 2, 4, 6, 8, 10
//        val notEvenList = numberList2.filterNot { it % 2 == 0} // 1, 3, 5, 6, 9
//
//        val multipliedBy5 = numberList2.map { it * 5 }
//
//        print(numberList2.count()) // 10
//        print(numberList2.count { it % 3 == 0 }) // 3
//
//        val firstOddNumber = numberList2.find { it % 2 == 0 }
//        val firstOrNullNumber = numberList2.firstOrNull { it % 2 == 3 }
//        val lastOrNullNumber = numberList2.lastOrNull() { it % 2 == 3 }
//        val moreThan10 = numberList2.first { it > 10 } // Exception: NoSuchElement
//
//        val total = numberList2.sum()
//
//        val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
//        val ascendingSort = kotlinChar.sorted()
//        val descendingSort = kotlinChar.sortedDescending() // t, o, n, l, k, i
//        println(ascendingSort) // i, k, l, n, o, t
//
//        val list2 = (1..1000000).toList()
//        list2.asSequence().filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }
//
//        val sequenceNumber = generateSequence(1) { it + 1 }
//        sequenceNumber.take(5).forEach { print("$it ") } // 1 2 3 4 5
//
////        val list = getListUser()
//
////        fun getUserName(): List<String>{
//////        val name = mutableListOf<String>()
//////        for (user in list){
//////            name.add(user.name)
//////        }
//////        return name
////            return list.map {
////                it.name
////            }
////        }
//
////        val fullName = getFullName(middle = "is", last = "Awesome", first = "Kotlin")
//        val fullName = getFullName(first = "Dicoding")
//        print(fullName)
//
//        val number = sumNumbers(10, 20, 30, 40)
//        print(number)
//
//        val number2 = getNumberSize(10, 20, 30, 40, 50)
//        print(number) // 5
//
//        10.printInt()
//
//        println(10.plusThree())
//
//        println(10.slice)
//
//        val sumResult = sum2?.invoke(10, 10)
//        val multiplyResult = multiply?.invoke(20, 20)
//
////        val comparator = object: Runnable{
////            override fun run(){
////                // TODO:
////            }
////        }
////        Changed to lambda:
//        val comparator = Runnable {
//            // TODO:
//        }
//
//        val message = { println("Hello from Lambda") }
//        message() // Hello from Lambda
//
//        val printMessage = { message: String -> println(message) }
//        printMessage("Hello from Lambda") // Hello from Lambda
//
//        val messageLength =  { message: String -> message.length }
//        val length = messageLength("Hello from Lambda")
//        println("Message length $length")
//
//        printResult(10, sum)
//
//        printResult(10){ value -> value + value }
//
//        val message2 = buildString {
//            append("Hello ")
//            append("from ")
//            append("lambda")
//        }
//
//        println(message2)
//
//        val buildString = StringBuilder().apply {
//            append("Hello ")
//            append("Kotlin ")
//        }
//
//        val text2 = "Hello"
//        text2.let {value ->
//            val message = "$value kotlin"
//            println(message)
//        }
//
//        val result = text2.run {
//            val from = this
//            val to = this.replace("Hello", "Kotlin")
//            "replace text from $from to $to"
//        }
//        println("result : $result")
//
//        val message3 = "Hello Kotlin!"
//        val result2 = with(message3) {
//            println("value is $this")
//            println("with length ${this.length}")
//        }
//        val result3 = with(message3) {
//            "First character is ${this[0]}"
//                " and last character is ${this[this.length - 1]}"
//        }
//        println(result3) // First character is H and last character is !
//
//        val builder = StringBuilder().apply {
//            append("Hello ")
//            append("Kotlin!")
//        }
//
//        println(builder.toString())
//
//        val message4: String? = null
//        message4?.let {
//            val length = it.length * 2
//            val text = "text length $length"
//            println(text) // 0
//        } ?: run {
//            val text = "message is null"
//            println(text)
//        }
//
//        val text3 = "Hello Kotlin"
//        val result4 = text3.also {
//            println("value length -> ${it.length}")
//        }
//
//        println("text -> $result4") // value length -> 12
//                                    // text -> Hello Kotlin
//
//        val numbers = 1.rangeTo(10)
//        val evenNumbers = numbers.filter(::isEvenNumber)
//        println(evenNumbers)
//
//        println(::message.name)
//        println(::message.get())
//
//        ::message.set("Kotlin Academy")
//
//        println(::message.get())
//
//        val numbers2 = listOf(1,2,3)
//        val fold = numbers2.fold(10) { current, item ->
//            println("current $current")
//            println("item $item")
//            println()
//            current + item
//        }
//
//        val foldRight = numbers2.foldRight(10) { item, current ->
//            println("current $current")
//            println("item $item")
//            println()
//            item + current
//        }
//
//        println("Fold result: $fold")
//        println("Foldright result: $foldRight")
//        /*Output:
//        * current 10
//        * item 1
//        *
//        * current 11
//        * item 2
//        *
//        * current 13
//        * item 3
//        *
//        * Fold result: 16*/
//
//        /*
//        * current 10
//        * item 3
//        *
//        * current 13
//        * item 2
//        *
//        * current 15
//        * item 1
//        *
//        * Fold result: 16*/
//
//        val number3 = listOf(1, 2, 3, 4, 5, 6)
//        val drop = number3.drop(3)
//        val dropLast = number3.dropLast(3)
//
//        println(drop) // [4, 5, 6]
//        println(dropLast) // [1, 2, 3]
//
//        val total2 = listOf(1, 2, 3, 4, 5, 6)
//        val take = total2.take(3)
//        val takeLast = total2.takeLast(3)
//
//        println(take) // [1, 2, 3]
//        println(takeLast) // [4, 5, 6]
//
//        val index = listOf(2, 3, 5, 8)
//        val total3 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
////        val slice = total3.slice(3..6 step 2)
////
////        println(slice) // [4, 6]
//        val slice = total3.slice(index) // [3, 4, 6, 9]
//
//        println(slice)
//
//        val total4 = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
//        val distinct = total4.distinct()
//
//        println(distinct) // [1, 2, 3, 4, 5]
//
//        data class Item(val key: String, val value: Any)
//
//        val items = listOf(
//            Item("1", "Kotlin"),
//            Item("2", "is"),
//            Item("3", "Awesome"),
//            Item("3", "as"),
//            Item("3", "Programming"),
//            Item("3", "Language")
//        )
//
//        val distinctItems = items.distinctBy { it.key }
//        distinctItems.forEach {
//            println("${it.key} with value ${it.value}")
//        }
//        /*
//        * output:
//        * 1 with value Kotlin
//        * 2 with value is
//        * 3 with value Awesome*/
//
//        val text4 = listOf("A","B", "CC", "DD", "EEE", "F", "GGGG")
//        val distinct2 = text4.distinctBy {
//            it.length
//        }
//
//        println(distinct2) // [A, CC, EEE, GGGG]
//
//        val word = "QWERTY"
//        val chunked = word.chunked(3)
//        val chunkedTransform = word.chunked(3) {
//            it.toString().toLowerCase()
//        }
//
//        println(chunked) // [QWE, RTY]
//        println(chunkedTransform) // [qwe, rty]
//
//        val someString = "Dicoding"
//        println(someString.reversed()) // gnidociD
//        println(someString.toUpperCase()) // DICODING
//        println(someString.toLowerCase()) // dicoding
//
//        val someString2 = "123"
//        val someInt = someString.toInt()
//        val someOtherString = "12.34"
//        val someDouble = someOtherString.toDouble()
//
//        println(someInt is Int) // true
//        println(someDouble is Double) // true
//
////        val dicodingCat = Animal("Dicoding Miaw", 4.2, 2, true)
////        println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
////        dicodingCat.eat()
////        dicodingCat.sleep()
//
////        val dicodingAnimal = Animal()
////        println("Nama: ${dicodingAnimal.name}") // "Dicoding Miaw"
////        dicodingAnimal.name = "Goose"
////        println("Nama: ${dicodingAnimal.name}") // Goose
//
////        val animal = Animal()
////        animal.name = "Dicoding Miaw"
////        println("Nama Hewan: ${animal.name}")
//
//        val person = Person()
//        person.name = "Dismas"
//        println("Nama Orang: ${person.name}")
//
//        val hero = Hero()
//        hero.name = "GatotKaca"
//        println("Nama Hero: ${hero.name}")
//
////        val animal2 = Animal()
////        animal.name = "Dicoding cat"
////        animal.weight = 6.2
////        animal.age = 1
////
////        println("Nama: ${animal2.name}, Berat: ${animal2.weight}, Umur: ${animal2.age} tahun")
//
////        val dicodingCat = Animal("Dicoding Miaw", 5.0, 2, true)
////        println(dicodingCat.getAnimalInfo)
//
//        val someInt2 = Random(0).nextInt(1, 10)
//
//        println(kotlin.math.PI)
//        println(cos(120.0))
//        println(sqrt(9.0))
//
//        sayHello()
//        println(factorial(4.0))
//        println(pow(3.0, 2.0))
//        println(com.dicoding.oop.utils.PI)
//        println(areaOfCircle(13.0))
//
//        val someNullValue: String? = null
//        val someStringValue: String? = null
//        var someIntValue: Int = 0
//        lateinit var someMustNotNullValue: String
//
//        try {
//            someMustNotNullValue = someNullValue!!
//            someIntValue = someStringValue!!.toInt()
//        } catch (e: NullPointerException) {
//            someIntValue = 0
//        } catch (e: NumberFormatException) {
//            someIntValue = -1
//        } catch (e: Exception) {
//            someMustNotNullValue = "Nilai String null"
//        } finally {
//            println(someMustNotNullValue)
//            when(someIntValue) {
//                0 -> println("Catch block NullPointerException terpanggil!") // Ini dipanggil dulu
//                -1 -> println("Catch block NumberFormatException terpanggil!")
//                else -> println(someIntValue)
//            }
//        }
//
//        val longArrayList = ArrayList<Long>()
//        val firstLong = longArrayList.get(0)
//
//        val numbers3 = (1..100).toList()
//        print(numbers3.slice(1..10))
//
//        val car = Car(200)
//        val motorCycle = MotorCycle(100)
//        var vehicle: Vehicle = car
//        vehicle = motorCycle
//
//        val carList = listOf(Car(100), Car(100))
//        val vehicleList = carList
//    }
//
//    fun sum3(value1: Int, value2: Int) = value1 + value2
//
////    fun getRegisterNumber() = Random.nextInt(100)
//
//    enum class Color(val value: Int) {
//        RED(0xFF0000) {
//            override fun printValue() {
//                println("value of RED is $value")
//            }},
//        BLUE(0x00FF00){
//            override fun printValue() {
//                println("value of BLUE is $value")
//            }},
//        GREEN(0x0000FF){
//            override fun printValue() {
//                println("value of RED is $value")
//            }};
//        abstract fun printValue()
//    }
//
//    /*enum class Color{
//        RED, GREEN, BLUE
//    }*/
//
//    data class User(val name: String, val age: Int)
//
//    fun getFullName(
//        first: String = "Kotlin",
//        middle: String = " is ",
//        last: String = "Awesome"): String {
//        return "$first $middle $last"
//    }
//
//    fun sumNumbers(vararg number: Int): Int {
//        return number.sum()
//    }
//
////    fun <T> asList(vararg input: T): List<T> {
////        val result = ArrayList<T>()
////        for (item in input)
////            result.add(item)
////        return result
////    }
//
//    fun getNumberSize(vararg number: Int): Int {
//        return number.size
//    }
//
//    fun Int.printInt() {
//        print("value $this")
//    }
//
//    fun Int.plusThree(): Int {
//        return this + 3
//    }
//
//    val Int?.slice: Int
//        get() = this?.div(2) ?: 0
//
//    val sum2: Arithmetic = {valueA, valueB -> valueA + valueB }
//
//    val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }
//
//    fun printResult(value: Int, sum: (Int) -> Int) {
//        val result = sum(value)
//        println(result)
//    }
//
//    var sum: (Int) -> Int = { value -> value + value }
//
////    fun buildString(): String {
////        val stringBuilder = StringBuilder()
////        stringBuilder.append("Hello ")
////        stringBuilder.append("from ")
////        stringBuilder.append("lambda")
////        return stringBuilder.toString()
////    }
//    // Use DSL to:
//    fun buildString(action: StringBuilder.() -> Unit): String {
//        val stringBuilder = StringBuilder()
//        stringBuilder.action()
//        return stringBuilder.toString()
//    }
//
//    val sum4: (Int, Int) -> Int = ::count
//
//    fun count(valueA: Int, valueB: Int): Int {
//        return valueA + valueB
//    }
//
//    fun isEvenNumber(number: Int) = number % 2 == 0
//
//    var message = "Kotlin"
//
//    fun setWord(message: String) {
//        fun printMessage() {
//            println(message)
//        }
//
//        printMessage()
//    }
//
//    fun sum5(valueA: Int, valueB: Int, valueC: Int): Int {
//        fun Int.validateNumber() {
//            if (this == 0) {
//                throw IllegalArgumentException("value must be better than 0")
//            }
//        }
//
//        valueA.validateNumber()
//        valueB.validateNumber()
//        valueC.validateNumber()
//
//        return valueA + valueB + valueC
//    }
//
//    tailrec fun factorial(n: Int, result: Int = 1): Int {
////        return if (n == 1) {
////            n
////        } else {
////            var result = 1
////            for (i in 1..n) {
////                result *= i
////            }
////            result
////        }
////        return if (n == 1) {
////            n
////        } else {
////            n * factorial(n-1) // Can't handle big data due to every frame of recursive consumes memory
////        }
//
//        val newResult = n * result
//        return if (n == 1) {
//            newResult
//        } else {
//            factorial(n - 1, newResult)
//        }
//    }
//
//    class ArrayList<T>: List<T>{
//        override fun get(index: Int): T {
//            return this[index]
//        }
//    }
//
//    interface List<P> {
//        operator fun get(index: Int): P
//    }
//
////    public fun <T> List<T>.slice(indices: Iterable<Int>): List<T> {
////
////    }
//
////    class ListNumber<T: Number> : List<T> {
////        override fun get(index: Int): T {
////
////        }
////    }
////    fun <T: Number> List<T>.sumNumber(): T {
////
////    }
//
////    val Animal.getAnimalInfo: String
////        get() = "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age}, Mamalia: ${this.isMammal}"
//
//    abstract class Vehicle(wheel: Int)
//    class Car(speed: Int): Vehicle(4)
//    class MotorCycle(speed: Int): Vehicle(2)
//
////    interface List<out E> : Collection<E> {
////        operator fun get(index: Int): E
////    }
//
//    interface Comparable<in T> {
//        operator fun compareTo(other: T): Int
//    }
//}
//
//typealias Arithmetic = ((Int, Int) -> Int)?
//
////class Animal{
////    var name: String = "Dicoding Miaw"
////        get(){
////            println("Fungsi Getter dipanggil")
////            return field
////        }
////        set(value){
////            println("Fungsi Setter dipanggil")
////            field = value
////        }
//////    abstract val weight: Double
//////    abstract val age: Int
//////    abstract val isMammal: Boolean
////
////    fun eat() {
////        println("$name makan!")
////    }
////
////    fun sleep() {
////        println("$name tidur!")
////    }
////}
//
//class DelegateName {
//    private var value: String = "Default"
//
//    operator fun getValue(classRef: Any?, property: KProperty<*>): String {
//        return value
//    }
//
//    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String) {
//        value = newValue
//    }
//}
//
//class DelegateGenericClass {
//    private var value: Any = "Default"
//
//    operator fun getValue(classRef: Any?, property: KProperty<*>): Any {
//        return value
//    }
//
//    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: Any) {
//        value = newValue
//    }
//}
//
////class Animal {
////    var name: Any by DelegateGenericClass()
////    var weight: Any by DelegateGenericClass()
////    var age: Any by DelegateGenericClass()
////}
//
//class Person {
//    var name: String by DelegateName()
//}
//
//class Hero {
//    var name: String by DelegateName()
//}
//
//abstract class Animal(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean) {
//    open fun eat() {
//        println("$name sedang makan!")
//    }
//
//    open fun eat(typeFood: String) {
//        println("$name memakan $typeFood!")
//    }
//
//    open fun eat(typeFood: String, quantity: Double) {
//        println("$name memakan $typeFood sebanyak $quantity grams!")
//    }
//
//    open fun sleep() {
//        println("$name sedang tidur!")
//    }
//}
//
//class Cat(name: String, weight: Double, age: Int, isCarnivore: Boolean, val furColor: String, val numberOfFeet: Int): Animal(name, weight, age, isCarnivore){
//    fun playWithHuman() {
//        println("$name bermain bersama manusia!")
//    }
//
//    override fun eat() {
//        println("$name sedang memakan ikan!")
//    }
//
//    override fun sleep() {
//        println("$name sedang tidur di bantal!")
//    }
//}
//
//interface IFly {
//    fun fly()
//    val numberOfWings: Int
//}
//
//class Bird(override val numberOfWings: Int): IFly {
//    override fun fly() {
//        if (numberOfWings > 0) println("Flying with $numberOfWings wings")
//        else println("I fly without wings")
//    }
//}