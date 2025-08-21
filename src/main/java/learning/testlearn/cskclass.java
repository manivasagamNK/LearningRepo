package learning.testlearn;

import java.io.Serializable;

public class cskclass {
    public cskclass(String playername, int playerage, String salary) {
        this.playername = playername;
        this.playerage = playerage;
        this.salary = salary;
    }

    String playername;

    int playerage;
    String salary;

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }


    public int getPlayerage() {
        return playerage;
    }

    public void setPlayerage(int playerage) {
        this.playerage = playerage;
    }

    @Override
    public String toString() {
        return "cskclass{" +
                "playername='" + playername + '\'' +
                ", playerage=" + playerage +
                ", salary='" + salary + '\'' +
                '}';
    }
}
