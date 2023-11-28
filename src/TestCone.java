public class TestCone {
    public static void main(String[] args)
    {
        Cone c = new Cone(1,2);
        Cone d = new Cone();

        System.out.println(c.getVolume());
        System.out.println(d.getVolume());
        System.out.println(d);
        Cone.setNbCones(10);
        System.out.println(d);

    }
}
