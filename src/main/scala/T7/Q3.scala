package T7

object Q3 {
  def isPrime(number :Int): Boolean ={
    if(number <=1){
      false
    }else if(number <=3){
      true
    }else if(number %2 ==0 || number %3 ==0){
      false
    }else{
      var i=5;
      while( i*i <= number){
        if(number %i ==0 || number % (i+2) ==0) {
          false
        }
        i+=6;
      }
      true
    }
  }

  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(isPrime);
  }

  def main(args: Array[String]): Unit = {
    val number=17
    if(isPrime(number)){
      println(number+" is Prime");
    }else{
      println(number+ " is not Prime");
    }
  }
}
