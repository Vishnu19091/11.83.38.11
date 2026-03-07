public class hello {
    public void Primitive_Data_Types(){
        boolean isJavaShit= false;
        System.out.print("Is Java programming"+ isJavaShit);

        // An 8-bit signed integer used to save memory in large numeric arrays.
        byte numeric=10;
        System.out.print("\nByte value: " + numeric);

        // A 16-bit signed integer often used when memory is limited and values are moderate in size.
        short short_var=1230;
        System.out.print("Short variable" + short_var);

        int num=10;
        System.out.print("Integer " + num);
        long long_num=10000234;
        System.out.print(long_num);
        float float_num=12449.345f;
        System.out.print(float_num);
        double double_num=1249.321529;
        System.out.print(double_num);
        char char_acter= '$';
        System.out.print(char_acter);
    }

    // This is a single-line comment

    int instanceVar=10;
    /*
    This is multi-line comment
    */

    // Static variable (shared across all objects of the class)
    static String staticVar ="THis is STatic";

    public void showVariables(){
        int localVar = 5;

        System.out.println("Instance variable: "+ instanceVar);
        System.out.println("Static variable: "+ staticVar);
        // localVar++;
        System.out.println("Local variable: "+ (localVar++));
    }

    public int Add(int a,int b){
        int result;
        result=a+b;

        return result;
    }

    static void greet(String name){
        System.out.print("Hello, "+name+"!");
    }

    public static void main(String[] args) {
        // creating an object
        hello obj1=new hello();

        // obj1.showVariables();

        // obj1.Primitive_Data_Types();

        // int a=10;
        // System.out.print("Value of a: " + (++a));

        // int add=obj1.Add(4, 3);

        // System.out.print(add);
        greet("VIshnu");
        // System.out.println("Hello, CodeOSS Java!");
        // System.out.print(hello.staticVar);
    }
}