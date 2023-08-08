package T7

object Q2 {
  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(numbers => numbers*numbers);
  }

  def main(args: Array[String]): Unit = {
    val inputs=List(1,2,3,4,5);
    val outputs=calculateSquare(inputs);
    print(outputs);
  }
}
