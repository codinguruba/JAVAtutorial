create a class Time with instance variable hour min and second , a constructor to initialize instance variable
a method to display time in HH:MM:SS. and a method to add any two objects of time class.
  Now create few instance of the class and test it.
  
class Time{
    int hour ;
    int min;
    int second;
    
    public Time(int hour , int min, int second){
      this.hour = hour;
      this.min = min;
      this.second = second;
    }
    
    public void displayTime(){
        System.out.printf("%02d:%02d:%2d",hour , min , second);
    }
    
    public Time addTime(Time other){
        int totalhour = this.hour + other.hour;
        int totalmin = this.min +other.min;
        int totalsecond = this.second + other.second;
        return new Time(totalhour,totalmin,totalsecond);
    }
    
}
public class Main {
    public static void main(String[] args) {
        Time t1 = new Time(5,10,12);
        t1.displayTime();
        System.out.println("");
        Time t2 = new Time(4,2,3);
        Time t3 = t1.addTime(t2);
        t3.displayTime();
        
        
    }
}
