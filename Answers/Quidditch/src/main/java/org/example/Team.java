package org.example;

public class Team {
    Keeper keeper = new Keeper();
    Seeker seeker = new Seeker();
    Beater beater1 = new Beater();
    Beater beater2 = new Beater();
    Chaser chaser1 = new Chaser();
    Chaser chaser2 = new Chaser();
    Chaser chaser3 = new Chaser();
    int Goal = 0;
    boolean GotSnitch = false;
    void setGoal() {
        Goal++;
    }
    void Play() {
        keeper.isSuccess();
        seeker.isSuccess();
        if(seeker.isSuccessful){
            GotSnitch = true;
        }
        beater1.isSuccess();
        beater2.isSuccess();
        chaser1.isSuccess();
        chaser2.isSuccess();
        chaser3.isSuccess();
        boolean condition1 = keeper.isSuccessful;
        boolean condition2 = (beater1.isSuccessful || beater2.isSuccessful);
        boolean condition3 = (
                (chaser1.isSuccessful && chaser2.isSuccessful)
                        || (chaser1.isSuccessful && chaser3.isSuccessful)
                        || (chaser2.isSuccessful && chaser3.isSuccessful)
        );
        if (condition1 && condition2 && condition3) {
            setGoal();
        }
        keeper.isSuccessful = false;

        beater1.isSuccessful = false;
        beater2.isSuccessful = false;
        chaser1.isSuccessful = false;
        chaser2.isSuccessful = false;
        chaser3.isSuccessful = false;
    }


}
