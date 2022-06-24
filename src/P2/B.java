package P2;

public class B {
    // attribute
    private short s;
    private int i;
    private long l;
    private float f;
    private double d;
    private char c;
    private String str;
    private boolean b;

    public static void main(String[] args) {
        B df = new B();
        df.s = 100;
        df.i = 200;
        df.l = 300;
        df.f = 5.5f;
        df.d = 10.55;
        df.c = 'Z';
        df.str = "SoftEng";
        df.b = true;
        System.out.println("\nShort s = "+ df.s);
        System.out.println("Int i = "+ df.i);
        System.out.println("Long l = "+ df.l);
        System.out.println("Float f = "+ df.f);
        System.out.println("Double d = "+ df.d);
        System.out.println("Char c = "+ df.c);
        System.out.println("String str = "+ df.str);
        System.out.println("Boolean b = "+ df.b);
    }
}
