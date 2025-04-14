class Calculator{
    public int add(int num1,int num2){
        return num1+num2;
    }
    public int mul(int num1,int num2){
        return num1*num2;
    }
}
class basic{
    public static void main(String args[]){
        Calculator calc = new Calculator();
        int r1 = calc.add(2,5);
        int r2 = calc.mul(3,4);
        System.out.println(r1+"/n"+r2); 
    }
}