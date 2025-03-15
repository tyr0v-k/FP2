fun round(num : Int): Any {
    if (num < 1000){
        return num
    }
    else{
        return "${num/1000}K"
    }
}

fun rightEnd(year : Int) : String{
    if (year in 5..20){
        return "$year лет"
    }
    else if (year % 10 == 1){
        return "$year год"
    }
    else if (year % 10 in 2..4){
        return "$year года"
    }
    else{
        return "$year лет"
    }
}

fun main() {
    println(round(1272))
    println(round(12720))
    println(round(127))
    println(rightEnd(1))
    println(rightEnd(2))
    println(rightEnd(5))
    println(rightEnd(11))
    println(rightEnd(124))
    println(rightEnd(121))
}