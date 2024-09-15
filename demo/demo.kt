import java.lang.IllegalArgumentException

Language Paradigms
1. imperative -how
    1.1 procedural
    1.2 structured
    1.3 OOP
2. declarative - what
    2.1 functional

Multi-Threading

3. concurrent programming  "Ներառում է մի քանի առաջադրանքների կատարում համընկնող ժամանակաշրջաններում (պարտադիր չէ, որ միաժամանակ) մեկ համակարգում: Կարող է աշխատում մեկ core համակարգի վրա։"
4. parallel programming     "Կատարում է մի քանի առաջադրանքներ միաժամանակ՝ դրանք բաժանելով մի քանի պրոցեսորների կամ միջուկների վրա: Չի աշխատում մեկ core համակարգի վրա։"
5. distributed programming  "Ներառում է մի քանի համակարգիչներ (հանգույցներ), որոնք միասին աշխատում են ցանցի վրա՝ առաջադրանքներ կատարելու համար:"

Loopsely Coupled VS Tightly Coupled

PROCESSES AND THREADS

OOP
    1. Encapsulation
    2. Inheritance
    3. Polymorphism
    4. Abstraction



open class Animal {
    fun eat() {
        println("Animal is eating")
    }
}

class Tiger

private  var userState = "ready"

private const var USER_NAME_KEY = "user_name_key"

fun main(args: Array<String>) {
    println("Hello World!")

    for (i in 0 < .. < 4) {
        println("Number $i")
    }

    checkUserStateAndUpdate()
    println(userState)

    println(listOf(1, 2, 3, 4, 5, 6).filter { i -> i % 2 == 0 })

    val user = User()
    user.id = 1
    user.name = "Meri"
}

fun sum(number1: Int, number2: Int) = number1 + number2

class User {
    var id: Int = 0
        set(value) {
            if (id > 0) {
                field = value
            } else{
                throw IllegalArgumentException("Wrong id $id. Id must be a positive")
            }
        }
    private var name: String = ""

    fun setId(id: Int) {
        this.id = id
    }

    fun getId() = id

    fun set Name(name: String = "")
}
