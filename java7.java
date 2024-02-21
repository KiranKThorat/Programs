class java7{
    public void swap(){
        //swapping without temp variable
        int a=10;
        int b=20;
        b = b + a;
        a = b - a;
        b = b - a;
        System.out.println("a=" +a);
        System.out.println("b=" +b);

    }

 public static void main(String args[]){
    java7 o1 = new java7();
    o1.swap();
 }   
}