package firstPackage;

import secondPackage.ChildTestClassDifferentPackage;
import secondPackage.TestClassDifferentPackage;

/**
 * Created by balajakka on 21/01/2019.
 */
public class MainClass {
    public int testMainPublicInt = 10;
    private int tesMaintPrivateInt = 11;
    protected int testMainProtectedInt = 12;
    int testMainDefaultInt =13;

    public void printMainPublicMethod(){
        System.out.println("I am Main public method");

    }

    private void printMainPrivateMethod(){
        System.out.println("I am Main private method");

    }

    protected void printMainProtectedMethod(){
        System.out.println("I am Main protected method");

    }

    void printMainDefaultMethod(){
        System.out.println("I am Main default method");

    }
    public static void main(String[] args) {

        MainClass mc = new MainClass();

        TestClass tc = new TestClass();



        TestClassDifferentPackage tcdp = new TestClassDifferentPackage();
        ChildTestClassDifferentPackage ctdp = new ChildTestClassDifferentPackage();
        ChildTestClass ctc = new ChildTestClass();



    }
}
