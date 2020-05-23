import java.util.Scanner
import scala.collection.mutable._

case class ProcNumber(value: Int, isPrime: Boolean) {
  def va:Float = value
  def pr:Boolean = isPrime
  def unapply(x: ProcNumber): (Float, Boolean) = (x.va, x.pr)
}

object lab {
  def main(args:Array[String]): Unit = {
    var enteredNumbers = new ArrayBuffer[Int]()
    val scanner = new Scanner(System.in)
    var finishEnter: Boolean = false
    println("If you want to finish entering numbers: type 'q'")
    while(!finishEnter) {
      print("Enter your number: ")
      if(scanner.hasNextInt()) {
        enteredNumbers += scanner.nextInt()
      } else if(scanner.next().equals("q")) finishEnter = true
    }
    val processedNumbersArray: ArrayBuffer[ProcNumber] = findPrimeNumbers(enteredNumbers)
    val dividedNumbersArray = new ArrayBuffer[Float]()
    for(i <- processedNumbersArray.indices) {
      dividedNumbersArray.addOne(divideNumber(processedNumbersArray(i)))
    }

    println("\nEntered number -> divided number")
    for(i <- dividedNumbersArray.indices)
      println(enteredNumbers(i) + " -> " + dividedNumbersArray(i))
  }

  def findPrimeNumbers(numbersArray:ArrayBuffer[Int]): ArrayBuffer[ProcNumber]= {
    val processedNumbersArray = new ArrayBuffer[ProcNumber]()
    for(i <- numbersArray) {
      if (isPrime(i)) processedNumbersArray.addOne(ProcNumber(i, true))
      else processedNumbersArray.addOne(ProcNumber(i, false))
    }
    processedNumbersArray
  }

  def isPrime(number: Int): Boolean = {
    number >= 2 && (2 to math.sqrt(number).toInt).forall(number%_ != 0)
  }

  def divideNumber(number: ProcNumber): Float = {
    var processedNumber: Float = 0.0f
    number match {
      case num @ ProcNumber(_, true) => processedNumber = num.va / 2
      case num @ ProcNumber(_, false) => processedNumber = num.va / 3
    }
    processedNumber
  }
}
