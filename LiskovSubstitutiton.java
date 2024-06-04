// If class B is subtype of class A , then we shouldbe able to replace object A with B without breaking the behaviour
// of the program

interface Bike
{
    void turnOnEngline();
    void accelerate();
}
class MotorCycle implements Bike{
    boolean isEngineOn;
    int speed;

    public void turnOnEngline()
    {
        isEngineOn=true;
    }
    public void accelerate()
    {
        speed=speed+10;
    }
}

class Bicycle implements Bike{
    public void turnOnEngline()
    {
        throw new AssertionError("there is no engine");

    }
    public void accelerate()
    {
        
    }
}