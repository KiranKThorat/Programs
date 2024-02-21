class pallindrome{
    public  void revString(){
        String str="olo";
        int length = str.length();
        String reverse ="";
        for(int i=0;i<length;i++){
             reverse = str.charAt(i) + reverse ;
             
        }
        System.out.println(reverse);
        if (str.equals(reverse)){
           System.out.println("its a pallindrome"); 
        }
        else{
            System.out.println("not  a pallindrome");
           }
        }
    
public static void main(String args[]){
    pallindrome o1=new pallindrome();
    o1.revString();
}
}