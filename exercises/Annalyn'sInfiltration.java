/*
TASK 1 : Implement the (static) AnnalynsInfiltration.canFastAttack() method that takes a boolean value that indicates if the 
knight is awake. This method returns true if a fast attack can be made based on the state of the knight. Otherwise, returns false
TASK 2: mplement the (static) AnnalynsInfiltration.canSpy() method that takes three boolean values, indicating if the knight, archer and the prisoner, respectively, are awake. 
The method returns true if the group can be spied upon, based on the state of the three characters. Otherwise, returns false:
TASK 3: Implement the (static) AnnalynsInfiltration.canSignalPrisoner() method that takes two boolean values, indicating if the archer
and the prisoner, respectively, are awake. The method returns true if the prisoner can be signalled, based on the state of the two 
characters. Otherwise, returns false:
Implement the (static) AnnalynsInfiltration.canFreePrisoner() method that takes four boolean values. The first three parameters indicate
if the knight, archer and the prisoner, respectively, are awake. The last parameter indicates if Annalyn's pet dog is present. The method 
returns true if the prisoner can be freed based on the state of the three characters and Annalyn's pet dog's presence. Otherwise, it returns
false:
*/ 
class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFastAttack() method");
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSpy() method");
        boolean spied = knightIsAwake || prisonerIsAwake || archerIsAwake ;
            return spied;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSignalPrisoner() method");
        return prisonerIsAwake && !archerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFreePrisoner() method");
        boolean free = !archerIsAwake && petDogIsPresent || !petDogIsPresent && prisonerIsAwake && !archerIsAwake && !knightIsAwake ;
        return free; 
    }
}

// OPINION: It was easy to do. 