package baptiste.test;

public class RecordTest {
    public static void main(String[] args){
        var t = new Test();
        var t2 = new Test2(1,true);
        t2.myInteger();
        t2.myBoolean();
        System.out.println(t2);
        var t3 = new Test2(1,true);
        System.out.println(t2.equals(t3));
        System.out.println(t2.hashCode());
        System.out.println(t3.hashCode());

        var t4 = new Test2(2,true);
        System.out.println(t4.hashCode());

    }
}

record Test(){}

record Test2(int myInteger, boolean myBoolean){}