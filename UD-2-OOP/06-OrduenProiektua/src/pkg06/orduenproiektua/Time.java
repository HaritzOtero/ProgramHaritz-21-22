/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06.orduenproiektua;

/**
 *
 * @author otero.haritz
 */
public class Time {
    private int hour;
    private int minute;
    private int second;
    
    public Time (int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour,int minute,int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public String toString() {
        return hour + ":" + minute + ":" + second ;
    }
    public Time(String time){
        this.hour = Integer.parseInt(time.charAt(0)+""+ time.charAt(1));
        this.minute =Integer.parseInt(time.charAt(3)+""+ time.charAt(4));        
        this.second =Integer.parseInt(time.charAt(6)+""+ time.charAt(7));
    }
    public  Time nextSecond() {
        
        if (second >= 60){
            second = 0;
            minute++;
        }else if(minute >= 0){
           minute = 0;
            hour++;
        }
        else{
            second++;
        }
     return this;
    }
    
    public Time previousSecond(){
        if (second == 00){
            minute--;
        }else if(minute == 00){
            hour--;
        }
        else{
            second--;
        }
    return this;   
    }
}
