package ProgrammingExercises;
import java.time.*;

public class TestFitnessTracker{
    public static void main(String[] args){
        FitnessTracker exercise = new FitnessTracker();
        System.out.println("Minutes: " + exercise.getMinutes());
        System.out.println(exercise.getActivity());
        System.out.println(exercise.getDate());
        String activity = "Running";
        int minutes = 10;
        LocalDate date = LocalDate.of(2006, 10, 10);

        FitnessTracker exercise2 = new FitnessTracker(activity, minutes, date);
        System.out.println(activity);
        System.out.println(minutes);
        System.out.println(date);
    }

}