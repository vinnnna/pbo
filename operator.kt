fun main()
{
    /*  operator types:
    *   1. arithmetic operator = (+, -,  *, /, %, ++, --)
    *   2. assignment operator = (+=, -=, *=, /=, %=, =)
    *   3. comparison operator = (==, !=, >, <, >=, <=)
    *   4. logical operator = (&&, ||, !)
    *
    * */

    var a:Int = 10
    var b = 5

    println(a + b)
    println(a - b)
    println(a / b)
    println(a % b)

    println(a++)
    println(b++)

    println(a--)
    println(a * b)
    println(b-- + a++)

    println (b < a != a < b)
    print(a != b)


}