package T7

object Q1 {
  def filterEvenNumbers(numbers: List[Int]): List[Int] = {
    numbers.filter(numbers => numbers%2==0);
  }

  def main(args: Array[String]): Unit ={
    val inputs=List(1,2,3,4,5,6,7,8,9,10);
    val outputs=filterEvenNumbers(inputs);
    print(outputs);
  }
}
