package sabak9;

public abstract class Test2Imp implements Test {

    @Override
    public void test1() {

    }

    @Override
    public void test2() {

    }

}


class TestTt extends Test2Imp{

    public TestTt() {
        super();
        System.out.println();

    }

    @Override
    public void test3() {

    }

    @Override
    public void test4() {
        this.test3();

    }
}
