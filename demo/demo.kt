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
}