class CharactersInString {
  public void findCharacters() {
      // Fix typo: 'chracters' to 'characters'
      String a = "what a game!";
      char character = 'a'; // Fix: Use char instead of String for single characters
      int count = 0;
      int length = a.length();
      for (int i = 0; i < length; i++) {
          // Fix: Use single quotes for character comparison
          if (a.charAt(i) == character) {
              count++;
          }
      }
      // Add print statement to see the result
      System.out.println("Number of occurrences of '" + character + "': " + count);
  }
  
  public static void main(String args[]) {
      CharactersInString o1 = new CharactersInString();
      o1.findCharacters();
  }
}
