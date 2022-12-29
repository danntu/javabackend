package sabak9;

public class TestImpl implements Test{
    int a;
    public TestImpl() {
        super();
    }

    @Override
    public void test1() {

    }

    @Override
    public void test2() {

    }

    @Override
    public void test3() {

    }

    @Override
    public void test4() {

    }


//    @Override
//    public String toString() {
//        return "Test" ;
//    }

    public static void main(String[] args) {
        TestImpl test =  new TestImpl();
       // test.notify();

        System.out.println(test.toString());

    }

}
