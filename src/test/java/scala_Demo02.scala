import scala.annotation.meta.beanGetter
import scala.beans.BeanProperty

/**
 * @time: 2020-10-03 17:17 
 * @author: likunlun 
 * @description: ${description}
 */
object scala_Demo02 {
  def main(args: Array[String]): Unit = {
    val dragon = new Dragon()
    println(dragon.getAge())
  }

  def sayHello(): Unit = {

  }
}

//inAge：Int
class Dragon {
  @BeanProperty var name: String = "tom"
  @BeanProperty var age: Int = 18

  override def toString = {
    this.name
  }
}