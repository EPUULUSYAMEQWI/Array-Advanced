fun main() {
    var s=Intergers(arrayOf(5,7,8,4,9,4))
    println(s)
    var t=mixed(arrayOf("lucy",'f',7,90,45.00,23.78,"water"))
    println(t)
    var r=characters(arrayOf('d','t','e','f','o','u','q','i','a','u','v','s','o','e','b','k'))
    println(r)

}

fun Intergers(a:Array<Int>):Int {
    var x = 1
    a.forEach { multiply ->
        x *= multiply

    }
    return x
}
fun mixed(s:Array<Any>):Double {
    var w = 0.0
    s.forEach { sums ->
        if (sums is Double) {
            w += sums


        }

    }
  return w
}
fun characters(t:Array<Char>):Int{
    var y=0
    t.forEach { add ->
        if(add=='a' || add=='e' || add=='i'||add=='o'||add=='u')
            y++
        }
    return y
    }


