import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

// A real timezone converter that
// displays the current time and a converted time for
// a target timezone in real-time
public class Time_Zone {
    private static ZoneId targetZone= ZoneId.of("America/Los_Angeles");
        public static void main(String[] args) {
            System.out.println("Starting real-time time zone converter...");
            System.out.println("Converting time from your default timezone to "+ targetZone);
            System.out.println("-------------------------------------------------------");

            //Create a single-threaded executor to run a task periodically.
            // A robust way to  update the time without blocking
            ScheduledExecutorService scheduler= Executors.newScheduledThreadPool(1);
            Runnable updateTask= () -> {
                try {
                    //Get the current time with the systems's default timezone
                    ZonedDateTime currentTime = ZonedDateTime.now();
                    //Convert the current time to the target timezone.
                    //withZoneSameInstant() ensures the same moment in time is represented
                    ZonedDateTime convertedTime = currentTime.withZoneSameInstant(targetZone);

                    //Define formatter
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy h:mm:ss a z");

                    //Clear the console for a clean "real-time" effect

                    System.out.print("\033[H\33[2J");
                    System.out.flush();

                    //Print the current time
                    System.out.println("Local Time : " + currentTime.format(formatter));
                    System.out.println("Target Time:" + convertedTime.format(formatter));
                } catch (Exception e) {
                    System.err.println("An error has ocurred" + e.getMessage());
                    scheduler.shutdown();
                }
            };
              scheduler.scheduleAtFixedRate(updateTask,0,1,TimeUnit.SECONDS);
            }
        }


