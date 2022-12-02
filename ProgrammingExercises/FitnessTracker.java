package ProgrammingExercises;
import java.sql.Time;
import java.time.*;
public class FitnessTracker {
    private String fitnessActivity;
    private int minutes;
    private LocalDate date;
    
    public FitnessTracker(){
        this.fitnessActivity = "Jumping";
        this.minutes = 8;
        this.date = LocalDate.of(2022, 11, 10);
    }

    public FitnessTracker(String a, int b, LocalDate c){
        this.fitnessActivity = a;
        this.minutes = b;
        this.date = c;
    }

    public String getActivity(){
        return fitnessActivity;
    }

    public int getMinutes(){
        return minutes;
    }

    public LocalDate getDate(){
        return date;
    }
}
