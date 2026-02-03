package practice2;

public class Time {
    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversal(){
        String time = hour + ":";
        if(minute < 10){
            time += "0";
        }
        time += minute + ":";
        if(second < 10){
            time += "0";
        }
        time+=second;
        return time;
    }

    public String toStandard(){
        int h = hour;
        if(h == 0){
            h = 12;
        } else if(h > 12){
            h -= 12;
        }

        String time = h + ":";
        if(minute < 10){
            time += "0";
        }
        time += minute;
        time+=":";
        if(second < 10){
            time += "0";
        }
        time += second;

        String timeEnd = " AM";
        if(hour > 12){
            timeEnd = " PM";
        }

        return time + timeEnd;
    }

    public void add(Time t){
        this.hour += t.hour;
        this.minute += t.minute;
        this.second += t.second;
        if(this.hour >= 24){
            this.hour -= 24;
        }

        if(t.minute >= 60){
            this.hour++;
            this.minute -= 60;
        }

        if(t.second >= 60){
            this.minute++;
            this.second -= 60;
        }
    }

}

