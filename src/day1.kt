fun main() {
    var pi = 3.1416
    val radius = 10.0
    println(pi * pi * radius)

    pi = 3.14
    println(pi * pi * radius)
    /*
     정수 타입과 실수 타입 리터럴의 경우 특별히 타입을 지정하지 않으면 int와 double로  타입 추론하며,
     정수 리터럴의 값이 너무 크면 Long으로 추론 해준다. 또한 64비트로 표현 할수 있는 정수 값의 범위를 벗어나면 컴파일 오류 발생,
     실수 리터럴의 경우 유효자리가 너무 많거나 너무 값이 크더라도 알아서 컴파일 오류 발생하지 않고 값에 따라 적절한 수치로 정해지며 이 과정에서 데이터 유실
     */

    val l = 10.toLong()
    val s = l.toShort()
    val d = s.toDouble()
    val f = s.toFloat()
    val ss = f.toString()

    // 기본 타입 간의 타입 변환은 값.to타입() 형태 사용
}