//package sabak7;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Program {
//    public static void main(String[] args) {
//        BookPrintable bookPrintable;
//
//        bookPrintable.print();
//        bookPrintable.paint();
//
//
//        bookPrintable.print2();
//
//
//        ((Book)bookPrintable).print2();
//
//       Printable printable = new Journal("Foreign Policy");
//        printable.print();
//
//
//        String name = ((Journal) printable).getName();
//
//
//        System.out.println(name);
//
//        Printable.read();
//        ((Journal) printable).search();
//
//
//    }
//}
//
//
//class Book implements BookPrintable{
//
//    protected String name;
//
//    String author;
//
//    @Override
//    public void print() {
//
//    }
//
//    @Override
//    public void print4() {
//
//    }
//
//    @Override
//    public void print3() {
//
//    }
//
//    @Override
//    public void paint() {
//
//    }
//}
//
//class  Journal implements Printable, Searchable{
//    private String name;
//
//    Journal(String name){
//
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public void search() {
//        System.out.println("Searchable");
//    }
//
//    @Override
//    public void print() {
//        System.out.println(name);
//    }
//
//    @Override
//    public void print4() {
//
//    }
//
//    @Override
//    public void print3() {
//
//    }
//}
//
//abstract class  AbstractNews implements Printable{
//    @Override
//    public void print() {
//
//    }
//
//    @Override
//    public void print4() {
//
//    }
//
//    @Override
//    public void print3() {
//
//    }
//}
//
//class News extends AbstractNews{
//    @Override
//    public void print() {
//
//    }
//}