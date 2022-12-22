package sabak7;

public interface Printable {

   int OPEN = 1;
   int CLOSED = 0;


   public abstract void print();

   void print4();

   public abstract void print3();

   default void print2(){
      System.out.println("Undefined printable");
   }

   static void read(){

      System.out.println("Read printable");
   }

}


interface Searchable {
   void search();
}

interface BookPrintable extends Printable{

   void paint();
}