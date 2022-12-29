package sabak8;

public class Bear extends AnimalAbs{
    @Override
    public void move() {
        super.move();
    }

    public void test(){
        move();
    }

    public static void main(String[] args) {
        Bear bear = new Bear();
    }
}
