import java.util.Scanner
import scala.collection.mutable._
import scala.util.control.Breaks._

object lab {
  def main(args:Array[String]): Unit = {
    var firstCollection = new ArrayBuffer[Int]()
    var secondCollection = new ArrayBuffer[Int]()
    val scanner = new Scanner(System.in)
    var finishEnter: Boolean = false
    println("Now entering numbers for the first collection.")
    println("If you want to finish entering numbers: type 'q'")
    while(!finishEnter) {
      print("Enter your number: ")
      if(scanner.hasNextInt()) {
        firstCollection += scanner.nextInt()
      } else if(scanner.next().equals("q")) finishEnter = true
    }

    println("Now entering numbers for the second collection.")
    println("If you want to finish entering numbers: type 'q'")
    finishEnter = false
    while(!finishEnter) {
      print("Enter your number: ")
      if(scanner.hasNextInt()) {
        secondCollection += scanner.nextInt()
      } else if(scanner.next().equals("q")) finishEnter = true
    }
    println("First collection:")
    println(firstCollection)
    println("Second collection:")
    println(secondCollection)
    val finalCollection = collectionCombineAndSort(firstCollection, secondCollection, insert)
    println("Combined and sorted collection:")
    println(finalCollection)

  }

  def collectionCombineAndSort(firstCollection: ArrayBuffer[Int], secondCollection: ArrayBuffer[Int], insertFunk: (ArrayBuffer[Int], Int, Int) => ArrayBuffer[Int]): ArrayBuffer[Int] = {
    var combinedCollection = new ArrayBuffer[Int]()
    for(i <- firstCollection.indices) {
      if(combinedCollection.isEmpty) combinedCollection += firstCollection.head
      else {
        breakable { for(n <- combinedCollection.indices) {
          if(combinedCollection(n) >= firstCollection(i)) {
            combinedCollection = insertFunk(combinedCollection, n, firstCollection(i))
            break
          } else if(n == combinedCollection.size - 1) combinedCollection += firstCollection(i)
        } }
      }
    }
    for(i <- secondCollection.indices) {
      if(combinedCollection.isEmpty) combinedCollection += secondCollection.head
      else {
        breakable { for(n <- combinedCollection.indices) {
          if(combinedCollection(n) >= secondCollection(i)) {
            combinedCollection = insertFunk(combinedCollection, n, secondCollection(i))
            break
          } else if(n == combinedCollection.size - 1) combinedCollection += secondCollection(i)
        } }
      }
    }
    combinedCollection
  }

  def insert(array: ArrayBuffer[Int], i: Int, value: Int):ArrayBuffer[Int] = {
    val (front, back) = array.splitAt(i)
    front ++ ArrayBuffer(value) ++ back
  }
}
