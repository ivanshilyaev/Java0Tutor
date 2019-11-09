package com;

/* Составьте описание класса для представления времени.
 Предусмотрте возможности установки времени и изменения его отдельных
 полей (час, минута, секунда) с проверкой допустимости вводимых значений.
 В случае недопустимых значений полей поле устанавливается в значение 0.
 Создать методы изменения времени на заданное количество часов, минут и секунд. */

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    public Time(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHours(int hours) {
        if (hours < 0 || hours > 23)
            this.hours = 0;
        else
            this.hours = hours;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes > 59)
            this.minutes = 0;
        else
            this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 59)
            this.seconds = 0;
        else
            this.seconds = seconds;
    }

    public void add3seconds() {
        seconds += 3;
        canon();
    }

    public void add3minutes() {
        minutes += 3;
        canon();
    }

    public void add3hours() {
        hours += 3;
        canon();
    }

    public void canon() {
        if (seconds >= 60) {
            int tmp = seconds;
            minutes += tmp/60;
            seconds %= 60;
        }
        if (minutes >= 60) {
            int tmp = minutes;
            hours += tmp/60;
            minutes %=  60;
        }
        hours %= 24;
    }

    public void setTime(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    @Override
    public String toString() {
        String strHours = (hours < 10) ? "0"+hours : Integer.toString(hours);
        String strMinutes = (minutes < 10) ? "0"+minutes : Integer.toString(minutes);
        String strSeconds = (seconds < 10) ? "0"+seconds : Integer.toString(seconds);
        return strHours + ":" + strMinutes + ":" + strSeconds;
    }
}
