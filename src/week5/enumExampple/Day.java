package week5.enumExampple;

import java.time.LocalTime;

/**
 * Enum representing the days of the week, each with its own working hours.
 */
public enum Day {
    MONDAY(LocalTime.of(9, 00), LocalTime.of(17, 00)),
    TUESDAY(LocalTime.of(10, 00), LocalTime.of(16, 00)),
    WEDNESDAY(LocalTime.of(11, 00), LocalTime.of(15, 00)),
    THURSDAY(LocalTime.of(12, 00), LocalTime.of(14, 00)),
    FRIDAY(LocalTime.of(13, 00), LocalTime.of(17, 00)),
    SATURDAY(LocalTime.of(0, 00), LocalTime.of(00, 00)),
    SUNDAY(LocalTime.of(0, 00), LocalTime.of(00, 00));

    // Fields to store the start and end working times for the day
    private final LocalTime startTime;
    private final LocalTime endTime;

    /**
     * Constructor to assign working hours for each day.
     *
     * @param startTime the time work starts
     * @param endTime   the time work ends
     */
    Day(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /**
     * @return the starting time of the work day
     */
    public LocalTime getStartTime() {
        return startTime;
    }

    /**
     * @return the ending time of the work day
     */
    public LocalTime getEndTime() {
        return endTime;
    }
}
