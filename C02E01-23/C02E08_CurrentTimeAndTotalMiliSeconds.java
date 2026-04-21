public class C02E08_CurrentTimeAndTotalMiliSeconds {
    public static void main(String[] args) {

        // this program shows total and current time
        long total_mili_seconds = System.currentTimeMillis();
        System.out.println(total_mili_seconds + "  total_mili_seconds");
        
        long total_seconds = total_mili_seconds /1000;
        System.out.println(total_seconds + "  total_seconds");
        
        long total_minutes = total_seconds /60;
        System.out.println(total_minutes +"  total_minutes");
        
        long total_hours = total_minutes /60;
        System.out.println(total_hours + "  total_hours");
        
        //------------------------------------------------//
        
        long current_seconds = total_seconds %60;
        System.out.println(current_seconds + "  current_seconds");
        
        long current_minutes = total_minutes%60;
        System.out.println(current_minutes + "  current_minutes");
        
        long current_hours = total_hours%24;
        System.out.println(current_hours + "  current_hours");
        
        System.out.println("current GMT time " + current_hours + ":"+ current_minutes + ":"+ current_seconds);
    }
    
}
