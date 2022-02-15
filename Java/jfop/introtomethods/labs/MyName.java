public class MyName{

  public static void main(String [] args){
    //firstName();
    //printSpace();
    //lastName();
    fullName();
   }


    public static void firstName(){
      System.out.print("Brianna");
    }

    public static void fullName(){
      firstName();
      printSpace();
      lastName();
    }

    public static void printSpace(){
      System.out.print(" ");
    }

    public static void lastName(){
      System.out.println("Hickerson");
    }

}
