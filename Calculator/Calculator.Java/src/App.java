public class App {
//This program is a simple calculator
//Pasco Logan 4/28/21

public static class Calculator{
    int total;
    //constructor
    public Calculator(){
  
    }
    //Calculator add 
    public int add(int a,int b){
      total = a + b;
      return total;
    }
    //Calculator subtract
    public int subtract(int a,int b){
      total = a - b;
      return total;
    }
    //Calculator multiply
    public int multiply(int a, int b){
      total = a * b;
      return total;
    }
    //Calculator Divide
    public int divide(int a, int b){
      total = a / b;
      return total;
    }
    // Calculator Modulo
    public int modulo(int a,int b){
      return a % b;
    }
    public static void main(String[]args){
      Calculator myCalculator = new Calculator();
      System.out.println(myCalculator.add(5,7));
      System.out.println(myCalculator.subtract(45,11));
    }
  
  }

}
