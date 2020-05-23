import java.util.Scanner
import scala.collection.mutable._
import scala.annotation.tailrec

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
    val primeNumbersNoTailRecArray = findPrimeNumbers(enteredNumbers, false)
    println("Without tail recursion:")
    println(primeNumbersNoTailRecArray)
    val primeNumbersTailRecArray = findPrimeNumbers(enteredNumbers, true)
    println("With tail recursion:")
    println(primeNumbersTailRecArray)
  }


  def findPrimeNumbers(numbersArray:ArrayBuffer[Int], tailrec: Boolean):ArrayBuffer[Int] = {
    var primesArray = new ArrayBuffer[Int]()
    if(!tailrec) {
      for(i <- numbersArray if isPrime(i)) {
        primesArray += i
      }
    } else {
      for(i <- numbersArray if isPrimeTailrec(i, 2)) {
        primesArray += i
      }
    }
    primesArray
  }

  def isPrime(number: Int): Boolean = {
    number >= 2 && (2 to math.sqrt(number).toInt).forall(number%_ != 0)
  }

  @tailrec
  def isPrimeTailrec(number: Int, i: Int): Boolean = {
    if(number < 2) false
    else if(number == 2) true
    else if(number % i == 0) false
    else if(i < number / 2) isPrimeTailrec(number, i+1)
    else true
  }
}