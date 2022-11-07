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
    var count = '0'

    strike(randomNum,inputNum)

//    for(i in 0..2) {
//        if(inputNum[i] == randomNum[0])
//            count++
//        if(inputNum[i] == randomNum[1])
//            count++
//        if(inputNum[i] == randomNum[2])
//            count++
//    }
//
   //print(count)
}

fun strike(randomNum: CharArray, inputNum: CharArray): Int {
    var count = 0

    for(i in 0..2)
        if (randomNum[i] == inputNum[i])
            count++
    print(count)
    return count
}

