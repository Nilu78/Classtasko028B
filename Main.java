class Main {
  public static void main(String[] args) {

    System.out.println(removeNonAlphaNumeric("Vsh%68d@hd9&!cx"));
    System.out.println(removeNonAlphaNumeric("hello&World%hi%java"));
    
  }

  public static String removeNonAlphaNumeric(String str){
     String a = "";
    for (int i = 0; i < str.length(); i++) {
      if (!Character.isLetterOrDigit(str.charAt(i))) {
        str = str.substring(0, i) + str.substring(i+1);
      }
      


    } 
     return str;
    // return here
  }
}


  


  


  

  
    
