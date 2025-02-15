class SumWithReturnType{
    public int add(int a, int b){
        a=10;
        b=5;
        int c=a+b;
        return(c);
    }
}
class addition{
    public static void main(String[] args) {
        SumWithReturnType obj = new SumWithReturnType();
        int z=obj.add(10,5);
        System.out.println(z);

    }
}