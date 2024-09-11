interface F1 { int method1(); }
 abstract class A implements F1 {
 protected int method1() {return 4;}
 }
 public class a extends A {
 public static void main(String[] args) {
 A ref = new A();
 System.out.println(ref.method1());
 }

public int method1(int length) {return 2;}
 }