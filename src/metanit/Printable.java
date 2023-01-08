package metanit;

interface Printable {
   int OPEN = 1;
    default void print(){

        System.out.println("Undefined printable");
    }

    static void read(){

        System.out.println("Read printable");
    }
}

class Test implements Printable {
    @Override
    public void print() {
        System.out.println("Override");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.print();
        Printable.read();

        



    }
}