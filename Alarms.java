
 interface Vehical {
default String turnAlarmOn()
{
    System.out.println( "Alarm on");
    return "Sakshi";
}

default String trunAlarmoff(){
    System.out.println("Alarm off");
    return "Sakshi";

}
} 
 interface Alarms {
    default String turnAlarmOn()
    {
        System.out.println( "Alarm on 2");
        return "Sakshi";
    }
    
    default String turnAlarmoff(){
        System.out.println("Alarm off 2");
        return "Sakshi";
    }
}
    class Car implements Vehical,Alarms
    {
public String turnAlarmOn(){
   
    return Vehical.super.turnAlarmOn();
    
}
public String turnAlarmoff(){
    
    return Vehical.super.trunAlarmoff();
}
public static void main(String[] args) {
    Car c= new Car();
    c.turnAlarmOn();
    c.trunAlarmoff();
}
    }

 

