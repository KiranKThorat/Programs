class reverseString{
    public  void revString(){
        String str="hello";
        int length = str.length();
        String reverse ="";
        for(int i=0;i<length;i++){
             reverse = str.charAt(i) + reverse ;
             
        }
        System.out.println(reverse);
    }
public static void main(String args[]){
    reverseString o1=new reverseString();
    o1.revString();
}
}