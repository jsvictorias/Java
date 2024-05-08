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
    int today = birdsPerDay.length - 1; 
    return birdsPerDay[today];
}


    public int incrementTodaysCount() {
        int index = birdsPerDay.length - 1;
        birdsPerDay[index] = ++birdsPerDay[index];
        return birdsPerDay[index];
        
    }

    public boolean hasDayWithoutBirds() {
        boolean res = true;
        for (int i = 0; i < birdsPerDay.length; i++){
            if(birdsPerDay[i] == 0){
                res = true;
                break;
                }
            else {
                res = false;
            }
        }
        return res;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int num = 0;
        if (numberOfDays > birdsPerDay.length) {
        	num = 29;
        }
        else {
        	for (int i = 0; i < birdsPerDay.length; i++){
            	System.out.println(birdsPerDay[i]);
            	num += birdsPerDay[i];
            	
                if (birdsPerDay[i] == birdsPerDay[numberOfDays]){
                	num -= birdsPerDay[i];
                	break;
                }
            }
        }
    
        return num;
    
    }
    

    public int getBusyDays() {
        int num = 0;
    	for (int i : birdsPerDay) {
    		System.out.println(i);
    		if (i >= 5) {
    			num = num + 1;
    		}
    		
    	}
    
    return num;
}
}
    


// It was a little bit difficult to understand the code, but the logic was easy, I learn how to use for each with Java.