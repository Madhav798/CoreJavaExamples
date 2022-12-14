package practicejava.core.exp;

public class CalculatorExampleWithOverLoading {
    public int add(int x,int y,float z){
        return (int) (x+y+z);
    }

    public int add(float x,int y,float z){
        return (int) (x+y+z);
    }

    public int add(int x,int y,int z){
        return x+y;
    }

    public static void main(String[] args) {
        CalculatorExampleWithOverLoading calc = new CalculatorExampleWithOverLoading();
        System.out.println(calc.add(2,2,3.4f));
        System.out.println(calc.add(2.6f,3,4));
        System.out.println(calc.add(30,40,50));
        int x = 10;
        System.out.println(String.valueOf(x));
    }

}
