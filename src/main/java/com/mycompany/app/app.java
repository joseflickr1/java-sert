package com.mycompany.app;


import pkgB.B;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*****************************************************************************************************
 * Hoved klassen app
 *
 ***** Kode
 ***** Notat fra Evernote
 ***** Notat fra papir
 *
 */
class app extends B implements I
{
    public void p() {
        int i1 = i;
    }

    public static void main (String [] args)  {

        new Blop();

    }

    /*****************************************************************************************************
     * ABOUT STRING
     *
     * Testing String methods
     *
     * 'Hello yo'
     * new String().startsWith('He') - true
     * new String().charAt(1) - e
     * new String().substring(1,3) - el
     */
    private static void characterInString() {
        String string = "Hello yo";
        System.out.println(string.startsWith("He"));
        System.out.println(string.charAt(1));
        System.out.println(string.substring(1, 3));
    }

    /*****************************************************************************************************
     * ABOUT OPERATORS
     *
     * Metode
     * Post og pre increment/decrement
     * ex: ++i og i++
     *
     * result
     * out -> true 1
     */
    private static void incrementAndDecrementOperator() {
        int i = 0, j = 0;
        boolean b = ((i++ == ++j && i--==--j)); // utrykk 2 blir ikke evaluert
        System.out.print(b + " " + i);
    }

    // Assignments
    // Ex
    // float f = (float) 5.5;
    // long i= 10;
    // float f = (float) i;
    //
    // byte 8
    // short 16
    // int 32
    // long 64
    // float 32
    // double 64
    private static void legalAssignments() {
        float f = (float) 5.5;

        long i = 10;
        float f1 = (float) i;

        char c = 'c';
        int i1 = c;
    }

    /*****************************************************************************************************
     * ABOUT ARRAYS
     *
     * Testing Arrays.sort()
     * Hvilke objekter implementere compareTo() fra Comparable Interface
     * som kan brukes i Arrays.sort()
     *
     * Mutually comparable
     * - Objekter av samme type
     */
    private static void arraySort() {
        Object [] sampleString = {
                new String("z"),
                new Integer(1),
                new Boolean(false)
        };
        // arraySortHelper(sampleString);

        Object [] sampleInteger = {
                new Integer(2),
                new Integer(1)
        };
        arraySortHelper(sampleInteger);

        Object [] sampleBoolean = {
                new Boolean(true),
                new Boolean(false),
                new Boolean(true),
        };
        arraySortHelper(sampleBoolean);
    }
    private static void arraySortHelper(Object[] sampleInteger) {
        Arrays.sort(sampleInteger);
        for (int i = 0; i < sampleInteger.length; i++) {
            System.out.println(sampleInteger[i].toString());
        }
    }

    private static void arrayAsList() {
        List sampleLst = Arrays.asList(new int[2]);
    }
    private static void multiDimArrayConstruction() {
        int [][] ints1 = new int[1][];
        int [][] ints1Same = {null, null};

        int [][] ints2 = new int[1][];
        ints2[0] = new int[2];
        ints2[0][0] = 1;
        ints2[0][1] = 1;
        int [][] ints2Same = {{1,1}, null};


        int [][] ints3 = new int[][]{{1,2},{1,2}};
        int [][] ints3Copy = new int[][]{null, null};

        int [][] i = {{},{}};

    }
    private static void simpleTwoDimArray() {
        String[][] sampleArray = new String[100][10];
        sampleArray[0][0] = "1";
    }

    // Generics
    // lst is non generic, and is declared as Integer,
    // when passing it as reference to a generic List, the list type can be mix of type String, double etc?
    private static void printAddToList() {
        List<Integer> lst = new ArrayList<Integer>();
        lst.add(1);
        addToList(lst);
        System.out.print(lst.get(2));
    }
    private static void addToList(List list) {
        list.add(1);
        list.add("11");
    }


    /*****************************************************************************************************
     * ABOUT EXCEPTIONS
     */
    private static int exception1() {
        String s =  "" ;
        try{
            int x = 10/1;
            return 1;
        }catch (Exception e) {
            s += "Ex";
            System.out.print(s);
            return 0;
        }finally {
            s += "Fi";
            System.out.print(s);
            return 9;
        }
    }
    //Handle or declare exception
    class myException extends Exception {
        void someMethod () {
            doStuff(); // must declare or handle
        }
        private void doStuff()  {
            try {
                throw new myException();
            } catch (myException e) {
                // throw e; // must declare exception
                // catch and rethrow
            }
        }
    }

    // Common Exceptions
    static private void arrayIndexOutOfBoundsException() {
        int [] i = {1,2};
        System.out.print(i[-1]);
    }
    static private void illegalArgumentException(int i1) {
        if(i1 > 10) {
            throw new IllegalArgumentException();
        }
    }
    static private void threadSleepThrowException() {
        try {
            System.out.print("wait 2s ... ");
            Thread.sleep(2000);
            System.out.print(" the 2s finish");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private static void threadSleep() throws Exception{
        Thread.sleep(3000);
    }


    /*****************************************************************************************************/
    /**
     * ABOUT FLOW CONTROL
     *
     */
    static int getInt(){
        int j = 2;
        try{
            int x = 0;
            int y = 10;
            j = 30%y;
            throw new Exception();
        }catch (Exception e) {
            System.out.print(j);
            return 9;
        }finally {
            return 8;
        }
    }

    public static int doWhile() {
        int i = 7;
        do {
            System.out.print(i);
        } while (i++ < 13);
        System.out.print(i); // 14
        return i;
    }

    public static void forLoop() {

        // ex 1
        int i1 = 0;
        for (i1 = 24; i1 == 24; i1--)
        {
        }
        System.out.print(i1); // 23

        // ex 2
        int i2 = 0;
        for (i2 = 24; i2 < 20; i2--)
        // i2 not less than 20, i2-- not run
        {
        }
        System.out.print(i2); // 24

        // ex 3
        int i3 = 24;
        for (; i3 < 20; i3--)
        {

        }
        System.out.print(i3); // 24

        // ex 4
        int num = 1;
        for (num = 0; num < 3; ++num) {
            num *= 2;
        }
        System.out.print("num =" + (num++));
        // num 0
        // num 1*2
        // num 3
    }

    // Ex 1
    // break with label in for loop
    // outer
    // inner
    //
    // Ex 2
    // Testing reminder c2%4
    // Expected result
    // 0%4 =  -> out 0
    // 1%4 =  -> out 1
    // 2%4 =  -> out 2
    // 3%4 =  -> out 3
    //
    // What is Reminder
    // 1/4 = 0 + 1/4 remainder 1
    // 2/4 = 0 + 2/4 remainder 2
    // 3/4 = 0 + 3/4 remainder 3
    // 4/4 = 0 + 4/4 remainder 0
    private static void reminderWithBreak() {

        // Ex 1
        int counter = 0;
        outer: for (int i = 0; i < 4; ++i)
            inner: for (int k = 0; k < 4; ++k)
            {
                System.out.println("Hello - " + ++counter);
                if((k%4) == 0) break outer;
                // 0%4 gir 0
                // Hello - 1
            }

        // Ex 2
        int c2 = 0;
        for (c2 = 0; c2 < 4; c2++){
            System.out.println("Reminder =" + c2 % 4);
        }

    }
}

/****************************************************************************************************
 * Interface I1 extends I2
 */
interface I {
    int i = 0; // public final
    void p() ; // implicit public abstract
}
interface I2 extends I{
    void p2();
}

/*****************************************************************************************************
 * Abstract class Abstract extends Abstract1
 */
abstract class Abstract1 {}
abstract class Abstract extends Abstract1 {}

/*****************************************************************************************************
 * Class A extend Abstract and implements interface I2, I
 */
class A extends Abstract implements I2, I {
    public void p(){}
    public void p2(){}
}
class Beta extends A {}
class Gamma extends Beta {}

/*****************************************************************************************************
 * Enkel klasse med setter og getter
 *
 */
class setterGetterClass {

    private String variable; // property type String

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) { // property type String
        this.variable = variable;
    }
}
/*****************************************************************************************************
 * Override with declared exceptions
 * TODO se mer på checked declared Exception
 */
class SuperClass {
    void superMethod() throws Exception {
    }
}
class subClass extends SuperClass {
    void superMethod() {
        throw new NumberFormatException();
    }
}

/*****************************************************************************************************
 * Blooper
 */
class Blooper {
    private int a;
    protected Blooper() {

    }
    protected Blooper(int a) {
        this.a = a;
    }
    void p(){
        System.out.print(this.a);
    }
}
/**
 * Blop arver fra Blooper og kaller på
 * super konstruktoren
 * super metoden p
 */
class Blop extends Blooper {
    Blop(){
        super(1);
        super.p();
    }
}


