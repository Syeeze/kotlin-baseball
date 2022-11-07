package baseball

import camp.nextstep.edu.missionutils.Randoms
import camp.nextstep.edu.missionutils.Console

fun main() {
    //TODO("프로그램 구현")
    val randomNum = randomNum()
    println("숫자 야구 게임을 시작합니다.")
    println(randomNum)
    comparing(randomNum, inputNum())

}

fun randomNum() : String {
    var num = Randoms.pickNumberInRange(100,999).toString()
    return num
}

fun inputNum(): CharArray {
    print("숫자를 입력해주세요 : ")
    var inputNum = Console.readLine().toCharArray()
    return inputNum
}

fun comparing(randomNum: String, inputNum: CharArray) {
    val randomNum = randomNum.toCharArray()
    val inputNum =  inputNum
    var count = strike(randomNum,inputNum) + ball(randomNum,inputNum)

}

fun strike(randomNum: CharArray, inputNum: CharArray): Int {
    var count = 0

    for(i in 0..2)
        if (randomNum[i] == inputNum[i])
            count++
    print("스트라이크" + count)
    return count
}

fun ball(randomNum: CharArray, inputNum: CharArray): Int {
    var count = 0

    if (inputNum[0] == randomNum[1] || inputNum[0] == randomNum[2])
        count++
    if (inputNum[1] == randomNum[0] || inputNum[1] == randomNum[2])
        count++
    if (inputNum[2] == randomNum[0] || inputNum[2] == randomNum[1])
        count++
    print("볼" + count)
    return count
}

