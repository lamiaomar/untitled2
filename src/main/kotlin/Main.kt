const val appleNo = 50
const val PI=3.14
//خليتا برا المين لانه هذي مستحيل تتغير يعني الكونستنت من البدايه لها قيمه
//  ما تتغير مجرد ما اعطيها القيمه يعني ممكن ما اخلي لها قيمه بس مجرد التشغيل تجيها قيمه من عمليه مثلاval
fun main(args: Array<String>) {


    var VarName:Int = 5

    var number1=5 //without identify the data type
    var number2=4
    var number3=number1+number2
    println(number3)

    var number4="5"
    var number5="4"
    var number6=number4+number5
    println(number6)

    var isNumber=true
    println(isNumber)


    var name = "lamia"
    var score =5
    score=score+3
    score+=3 //the good way
    score*=2
    println(score)

    var phone=0
    phone=93

     // val phone2=1111
    //phone2=9999 هنا خطأ لانه(val)  (var)يعتبر ثابت يعني لو ابغى اغير احط
    val ID=1110168406


   var dozens= appleNo/12
   var reminderAPP=appleNo%12


    println (dozens)
    println (reminderAPP)

    println ()
    println ()
    




}