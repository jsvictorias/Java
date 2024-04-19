/*
    TASK 1: For comparison purposes, you always keep a copy of last week's counts nearby, which were: 0, 2, 5, 3, 7, 8 and 4. 
    Implement the BirdWatcher.getLastWeek() method that returns last week's counts:

    TASK 2: Implement the BirdWatcher.getToday() method to return how many birds visited your garden today. The bird counts are ordered 
    by day, with the first element being the count of the oldest day, and the last element being today's count.

    TASK 3: Implement the BirdWatcher.incrementTodaysCount() method to increment today's count:

    TASK 4: Implement the BirdWatcher.hasDayWithoutBirds() method that returns true if there was a day at which zero birds visited 
    the garden; otherwise, return false:

    TASK 5: Implement the BirdWatcher.getCountForFirstDays() method that returns the number of birds that have visited your garden 
    from the start of the week, but limit the count to the specified number of days from the start of the week.

    TASK 6: Some days are busier that others. A busy day is one where five or more birds have visited your garden. Implement the BirdWatcher.getBusyDays() 
    method to return the number of busy days:
*/

class BirdWatcher {
    private final int[] birdsPerDay;
     public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeek = {0, 2, 5, 3, 7, 8, 4};
        return lastWeek;
    }
    
    public int getToday() {
        BirdWatcher birdWatcher = new BirdWatcher();
        today = BirdWatcher.getToday();
        return birdsPerDay[today];
        
    }

    public void incrementTodaysCount() {
        throw new UnsupportedOperationException("Please implement the BirdWatcher.incrementTodaysCount() method");
    }

    public boolean hasDayWithoutBirds() {
        throw new UnsupportedOperationException("Please implement the BirdWatcher.hasDayWithoutBirds() method");
    }

    public int getCountForFirstDays(int numberOfDays) {
        throw new UnsupportedOperationException("Please implement the BirdWatcher.getCountForFirstDays() method");
    }

    public int getBusyDays() {
        throw new UnsupportedOperationException("Please implement the BirdWatcher.getBusyDays() method");
    }
}




//I's incomplete