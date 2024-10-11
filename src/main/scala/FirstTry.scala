object FirstTry {
  def main(args: Array[String]): Unit = {
    println("Hello, World!")
    println(add(1, 2))
    val person = Person(20, "DEW", "Earth")

    val person2 = person.copy(name = "Ana" , home = "Mars")

    val demoOne = new DemoOne()
    println(demoOne.sayHello(person2.name))
    println(person)
    println(person2)
  }

  def add(a: Int, b: Int): Int = {
    a + b
  }
}
