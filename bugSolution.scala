```scala
object Main extends App {
  val x: Option[Int] = None // Use Option to represent the potential absence of a value
  val y: Int = x.getOrElse(0) //Provide a default value when needed
  println(y) // Output: 0

  // Another approach using a default value
  val z: Int = 0
  val optionalValue = Some(10)
  val w: Int = optionalValue.getOrElse(z)
  println(w) // Output: 10
}
```