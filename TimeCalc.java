public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        //System.out.print(hours + ":" + minutes);
        int minutesADD = Integer.parseInt(args[1]);
        int totalMinutes = ((hours * 60) + minutes + minutesADD);
        //System.out.println(totalMinutes);
        int totalHours = (totalMinutes / 60);
        //System.out.println(totalHours);
        int newHours = totalHours % 24;
        //System.out.println(newHours);
        int newMinutes = totalMinutes - (totalHours * 60);
        //System.out.println(newMinutes);
        if (newHours < 10){
            System.out.print("0" + newHours + ":" );
        } else {
           System.out.print(newHours + ":");
        }
        if(newMinutes < 10){
            System.out.print("0" + newMinutes);
        }else{
            System.out.print(newMinutes);
            }
        
		
        

            
        

    }
}

