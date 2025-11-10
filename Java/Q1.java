class Overload {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
    int add(int a, int b, int c) { return a + b + c; }
 
    public static void main(String[] args) {
        Overload o = new Overload();
        System.out.println(o.add(5, 10));
        System.out.println(o.add(2.5, 3.5));
        System.out.println(o.add(1, 2, 3));
    }
}