package baseball

import camp.nextstep.edu.missionutils.Randoms
import camp.nextstep.edu.missionutils.Console

fun main() {
    //TODO("프로그램 구현")
    print(inputNum())
}

fun randomNum() : Int {
    var num = Randoms.pickNumberInRange(100,999)
    return num
}

fun inputNum(): Int {
    var inputNum = Console.readLine().toInt()
    return inputNum
}

