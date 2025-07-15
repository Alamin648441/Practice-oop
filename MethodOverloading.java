public class MethodOverloading {

    public void add(int a,int b){
        int result = a+b;
        System.out.println("two parameter result :"+result);
    }
    public void add(int a,int b,int c){
        int result = a+b+c;
        System.out.println("three parameter result:"+result);
    }

    public static void main(String[] args) {
        MethodOverloading ob = new MethodOverloading();
        ob.add(10,20);
        ob.add(20,34,24);
    }
}