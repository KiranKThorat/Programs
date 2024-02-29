class java30 {
    public void revString() {
        String str = "hello";
        int length = str.length();
        String reverse = "";
        for (int i = 0; i < length; i++) {
            reverse = str.charAt(i) + reverse;

        }
        System.out.println(reverse);
    }

    public static void main(String[] args) {

        java30 o1 = new java30();
        o1.revString();
    }
}