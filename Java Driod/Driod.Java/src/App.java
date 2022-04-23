public class App {
    public static class Droid{
        String name ="";
        int level= 0;
        
        public Droid(String droidName){
          name = droidName;
          level = 100;
        }
        
        public String toString(){
          level = 100;
          return "Hello, I'm the droid: " + name +"\n"+
          "Battery level is: " + level;
        }
        
        public void performTask(String task){
          System.out.println( name +" is performing task: " + task); 
          level =  level - 10; 
          System.out.println("Battery level is "+ level);
        
        }
        
        public  void energyReport(){
         System.out.println("This is the current battery level: " + level);
        }
        
        public void energyTransfer(){
          level = 100 - level;
          System.out.println("Your energy transfer between movements is : " + level);
        }
        
        
        public static void main(String[]args){
        
        Droid mike = new Droid("Mike");
        Droid Codey = new Droid("Ben");
        System.out.println(Codey);
        Codey.performTask("Walking");
        Codey.energyReport();
        Codey.energyTransfer();
        System.out.println(mike);
        mike.performTask("Running Man");
        
        
        }
        
        
        }  
}
    