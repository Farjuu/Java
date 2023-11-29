package Java;
class Main {
     public static void main(String [] args) {
    
       Encapsulation obj = new Encapsulation();
      
       obj.setPassword("234$%%%F");
       System.out.println(obj.getPassword()); 

     } 
}
// an object can have multiple forms
// runtime polymorphism -> method overriding
// complie time polymorphism -> method overloading