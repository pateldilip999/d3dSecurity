package TutorialTest.Day1;

public class Day1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
// Arithmetic Operators + - / * %
        System.out.println("This is examples of Arithmetic Operation----");
        System.out.println();
        System.out.println("Result of a+b ====" + (a + b));
        System.out.println("Result of a-b ====" + (a - b));
        System.out.println("Result of a/b ====" + (a / b));
        System.out.println("Result of a*b ====" + (a * b));
        System.out.println("Result of a%b ====" + (a % b));

        //Relational Operation or Comparison Operational like  ==, < > >= <= !=
// Always return boolean value that is false or true

        System.out.println("This is examples of Relational Operation -----");

        System.out.println();
        System.out.println("Result of a==b ---- " + (a == b));
        System.out.println("Result of a=>b ---- " + (a >= b));
        System.out.println("Result of a<=b ---- " + (a <= b));
        System.out.println("Result of a>b  ---- " + (a > b));
        System.out.println("Result of a!=b ---- " + (a != b));

// logical operator or boolean values  && (if both are true)  or || (one is true value)  or !


        boolean x = true;
        boolean y = false;

        System.out.println("This is examples of Logical Operation -----");
        System.out.println(x && y); //false
        System.out.println(x || y); //true
        System.out.println(x | y); //true
        System.out.println(!x);
        System.out.println(!y);
        //Increment or decremate value ++   --
a++;
b--;
        System.out.println(a);
        System.out.println(b);
    }
}
