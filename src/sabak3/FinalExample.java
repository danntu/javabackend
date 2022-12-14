package sabak3;

public class FinalExample {

    public final long ACCOUNT_ID;

    public final long ACCOUNT_ID2;
    public final long ACCOUNT_ID3;


    {
        ACCOUNT_ID2 = 111_111;
        ACCOUNT_ID3 = 222_222;
    }

    public  final long MAX = 1000;

    void localVar(final long a){

        //TEST =22;
        System.out.println(a);
    }

    public FinalExample(long account_id) {
        ACCOUNT_ID = account_id;
    }

    public FinalExample() {
        ACCOUNT_ID = 100_000;
    }

    public static void main(String[] args) {


        FinalExample f = new FinalExample(1234);

        FinalExample f2 = new FinalExample();

        System.out.println("ACCOUNT_ID"+ f.ACCOUNT_ID);
        System.out.println("MAX "+f.MAX);

        f.localVar(49);

        System.out.println(f2.ACCOUNT_ID);
        System.out.println(f2.ACCOUNT_ID2);

    }
}
