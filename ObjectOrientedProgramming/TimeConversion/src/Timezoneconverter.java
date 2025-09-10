import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * A real-time timezone converter that displays the current time
 * and a converted time for a target timezone, updating every second.
 */
public class Timezoneconverter {

    // Define the timezone for the conversion. You can change this to any valid ZoneId.
    private static final ZoneId TARGET_TIMEZONE = ZoneId.of("Europe/London");

    public static void main(String[] args) {
        System.out.println("Starting real-time timezone converter...");
        System.out.println("Converting time from your system default to " + TARGET_TIMEZONE);
        System.out.println("-------------------------------------------------------");

        // Create a single-threaded executor to run a task periodically.
        // This is a robust way to handle real-time updates without blocking.
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        // Define the task to run. This lambda function will be executed every second.
        Runnable updateTask = () -> {
            try {
                // Get the current time with the system's default timezone.
                ZonedDateTime currentTime = ZonedDateTime.now();

                // Convert the current time to the target timezone.
                // withZoneSameInstant() ensures the same moment in time is represented.
                ZonedDateTime convertedTime = currentTime.withZoneSameInstant(TARGET_TIMEZONE);

                // Define a formatter for a readable output.
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy h:mm:ss a z");

                // Clear the console for a clean "real-time" effect.
                System.out.print("\033[H\033[2J");
                System.out.flush();

                // Print the current time and the converted time.
                System.out.println("Local Time:    " + currentTime.format(formatter));
                System.out.println("Target Time:   " + convertedTime.format(formatter));
            } catch (Exception e) {
                // Handle any unexpected errors and stop the program.
                System.err.println("An error occurred: " + e.getMessage());
                scheduler.shutdown();
            }
        };

        // Schedule the task to run.
        // The first parameter is the task (updateTask).
        // The second is the initial delay (0 seconds).
        // The third is the period between executions (1 second).
        // The fourth is the time unit (TimeUnit.SECONDS).
        scheduler.scheduleAtFixedRate(updateTask, 0, 1, TimeUnit.SECONDS);
    }
}
