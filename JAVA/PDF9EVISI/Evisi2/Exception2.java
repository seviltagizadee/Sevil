package PDF9EVISI2;

public class Exception2 {
    public static void main(String[] args) {
        metodA();
    }

    public static  void metodA(){
     try{
         metodB();
     }catch (NewException exception){
         System.out.println(exception.getMessage());
     }
    }
    public static  void metodB() throws NewException {
     throw  new NewException("THIS EXCEPTION");
    }
    }
  class NewException extends Exception{
    public NewException(String message){
        super(message);
    }
  }


