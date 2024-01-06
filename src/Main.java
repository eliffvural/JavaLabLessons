public class Main {
    public static void main(String[] args) {

        StaticOrnek s1= new StaticOrnek();
        StaticOrnek s2= new StaticOrnek();
        s1.setStaticA(5);
        s1.setA(10);
        s2.setStaticA(15);
        s2.setA(20);

        System.out.println("s1 nesnesinin staticA degeri: "+s1.getStaticA());
        System.out.println("s1 nesnesinin a degeri: "+s1.getA());
        System.out.println("s2 nesnesinin staticA degeri: "+s2.getStaticA());
        System.out.println("s2 nesnesinin a degeri: "+s2.getA());
    }
}