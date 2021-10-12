//Calcuator
fun main(args: Array<String>) {

    print("Please enter the first number : ")
    val number1 = Integer.valueOf(readLine())

    print("Please enter the sec number : ")
    val number2 = Integer.valueOf(readLine())

    print("Please enter the character : ")
    val scanner = readLine()


    if(scanner == "+"){ print("The result is : " + (number1+number2) ) }
    else if (scanner== "*") { print("The result is : " + (number1*number2) ) }
    else if (scanner== "-") { print("The result is : " + (number1-number2) ) }
    else if (scanner== "%") { print("The result is : " + (number1%number2) ) }
    else if (scanner== "/") { print(" The result is : " + (number1/number2) ) }

}


//Salary
fun main(args: Array<String>) {

    print("Enter the salary ")
    var salary = readLine()!!.toFloat()

    print("Enter the Raise (1=Excellent 2=Good 3=Poor) ")
    val raise = readLine()!!.toInt()

    if(raise == 1) {
        salary= (salary+(salary*0.06)).toFloat()
        println("The new salary is " + salary) }
    else  if(raise == 2) {
        salary= (salary+(salary*0.04)).toFloat()
        println("The new salary is " + salary) }
    else  if(raise == 3) {
        salary= (salary+(salary*0.015)).toFloat()
        println("The new salary is " + salary) }
    else  if(raise >3 || raise<1) {
        println("Please enter again!! ") }
