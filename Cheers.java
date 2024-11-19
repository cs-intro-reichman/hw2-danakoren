// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            String s = (args[1]).toUpperCase();
            int numTimes = Integer.parseInt(args[0]);
            //String s0out = " ";
            String letters = "AEFHILMNORSX";
            for(int i = 0 ; i < s.length(); i ++){
                if(letters.indexOf(s.charAt(i)) == -1){
                        System.out.println("Give me a  " + s.charAt(i) + ": " + s.charAt(i) + "!");
                }else{
                        System.out.println("Give me an " + s.charAt(i) + ": " + s.charAt(i) + "!");
   
                }
                
            }
            System.out.println("What does that spell?");
                for(int j = 0 ; j < numTimes; j ++){
                        System.out.println(s + " !!!");

                }
        }
}
