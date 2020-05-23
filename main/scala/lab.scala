import java.util.Scanner
import scala.collection.mutable._
import scala.collection.mutable
import scala.util.control.Breaks._

case class Order(name: String, clothes: String, fabric: String) {
  def orderName:String = name
  def orderClothes:String = clothes
  def orderFabric:String = fabric
}

object lab {
  def main(args: Array[String]): Unit = {
    val orderList = new ListBuffer[Order]()
    val scanner = new Scanner(System.in)
    var choice: Int = 0
    breakable {
      while (true) {
        println("Menu:")
        println("1. Add order.")
        println("2. Get info about order.")
        println("3. Remove order.")
        println("0. Exit.")
        print("Your choice: ")
        if (scanner.hasNextInt()) {
          choice = scanner.nextInt()
          choice match {
            case 1 => addOrder(orderList)
            case 2 => orderInfoByName(orderList)
            case 3 => removeOrder(orderList)
            case 0 => break
            case _ => println("Wrong input!")
          }
        } else {
          println("Wrong input!")
          scanner.next()
        }
      }
    }
  }

  def addOrder(orderList: ListBuffer[Order]): Unit = {
    val newOrderName = new mutable.StringBuilder()
    val newOrderClothes = new mutable.StringBuilder()
    val newOrderFabric = new mutable.StringBuilder()
    val scanner = new Scanner(System.in)
    print("Enter order name: ")
    newOrderName.append(scanner.nextLine())
    print("Enter order clothes: ")
    newOrderClothes.append(scanner.nextLine())
    print("Enter order fabric: ")
    newOrderFabric.append(scanner.nextLine())
    orderList.addOne(Order(newOrderName.toString(), newOrderClothes.toString(), newOrderFabric.toString()))
  }

  def orderInfoByName(orderList: ListBuffer[Order]): Unit = {
    val scanner = new Scanner(System.in)
    print("Enter name of the order: ")
    val searchingOrderName = new mutable.StringBuilder()
    searchingOrderName.append(scanner.nextLine())
    val foundOrders: ListBuffer[Order] = orderList.filter(x => x.name.equals(searchingOrderName.toString()))
    if (foundOrders.isEmpty) println("No orders found.")
    else {
      println("Orders found: " + foundOrders.size)
      println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
      for (i <- foundOrders.indices) {
        println(i + 1 + " order name: " + foundOrders(i).name)
        println(i + 1 + " order clothes: " + foundOrders(i).clothes)
        println(i + 1 + " order fabric: " + foundOrders(i).fabric)
        println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
      }
    }
  }

  def removeOrder(orderList: ListBuffer[Order]): Unit = {
    val scanner = new Scanner(System.in)
    var choice: Int = 0
    print("Enter name of the order to remove: ")
    val searchingOrderName = new mutable.StringBuilder()
    searchingOrderName.append(scanner.nextLine())
    val foundOrderIndex: Int = orderList.indexWhere(x => x.name.equals(searchingOrderName.toString()))
    if (foundOrderIndex == -1) println("No orders found.")
    else {
      println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
      println(" order name: " + orderList(foundOrderIndex).name)
      println(" order clothes: " + orderList(foundOrderIndex).clothes)
      println(" order fabric: " + orderList(foundOrderIndex).fabric)
      println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
      breakable { while (true) {
          println("Delete this order?")
          println("1. Yes")
          println("2. No")
          print("Your choice: ")
          if (scanner.hasNextInt()) {
            choice = scanner.nextInt()
            choice match {
              case 1 =>
                orderList.remove(foundOrderIndex)
                println("Order deleted.")
                break
              case 2 =>
                println("Cancel deletion.")
                break
              case _ => println("Wrong input!")
            }
          } else {
            println("Wrong input!")
            scanner.next()
          }
        } }
    }
  }
}
