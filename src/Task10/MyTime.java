package Task10;

public class MyTime {
    private int hour;
    private  int minut;
    private  int second;

    public MyTime() {}

    public MyTime(int hour, int minut, int second) {
        this.hour = hour;
        this.minut = minut;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23)
            this.hour = hour;
        else
            System.out.println("Yaroqsiz soat!");
    }

    public int getMinut() {
        return minut;
    }

    public void setMinut(int minut) {
        if (minut >= 0 && minut <= 59)
            this.minut = minut;
        else
            System.out.println("Yaroqsiz daqiqa!");
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59)
            this.second = second;
        else
            System.out.println("Yaroqsiz soniya!");
    }

    public void setTime(int hour, int minute, int second){
        if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59){
            System.out.println("Yaroqsiz soat, daqiqa yoki soniya!");
            return;
        }
        this.hour = hour;
        this.minut = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour,minut,second);
    }

    public MyTime nextSecond(){
        second++;
        if (second == 60){
            second = 0;
            minut++;

            if (minut == 60){
                minut = 0;
                hour++;

                if (hour == 24){
                    hour =0;
                }
            }
        }
        return this;
    }

    public MyTime nextMinute(){
        minut++;
        if (minut == 60){
            minut = 0;
            hour++;
            if (hour == 24){
                hour = 0;
            }
        }
        return this;
    }

    public MyTime nextHour(){
        hour++;
        if (hour == 24){
            hour = 0;
        }
        return this;
    }

    public MyTime previousSecond(){
        second--;
        if (second < 0){
            second = 59;
            minut--;
            if (minut < 0){
                minut = 59;
                hour--;
                if (hour < 0) {
                    hour = 23;
                }
            }
        }
        return this;
    }

    public MyTime previousMinute(){
        minut--;
        if (minut < 0){
            minut = 0;
            hour--;
            if (hour < 0){
                hour = 23;
            }
        }
        return this;
    }

    public MyTime previousHour(){
        hour--;
        if (hour < 0){
            hour = 23;
        }
        return this;
    }
}
