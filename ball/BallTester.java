public class BallTester
{
    public static void main(String[] args)
    {
        Ball ball1 = new Ball("Red",5.5);
        System.out.print("Ball1: ");
        System.out.println(ball1);
        
        Ball ball2 = new Ball();
        ball2.setColor("Blue");
        ball2.setRadius(6.5);
        
        System.out.print("Ball2: ");
        System.out.println(ball2);
        
        System.out.println();
        System.out.println();
        
        if(ball1.equals(ball2))
        {
            System.out.println("Both balls are equal.");
        }
        else
        {
            System.out.println("Both balls are not equal.");
        }
        
        System.out.println();
        System.out.println();
        if((ball1.compareTo(ball2)) == 1)
        {
            System.out.println("Ball1 is Greater than Ball2.");
        }
        
        else if((ball1.compareTo(ball2)) == -1)
        {
            System.out.println("Ball1 is less than Ball2.");
        }
        else
        {
            System.out.println("Both balls are equal.");
        }
        
        System.out.println();
        System.out.println();
        
        System.out.println("Ball1 circumference: "+ball1.circumference());
        System.out.println("Ball1 surface area: "+ball1.surfaceArea());
        System.out.println("Ball1 volume: "+ball1.volume());
        
        System.out.println();
        
        System.out.println("Ball2 circumference: "+ball2.circumference());
        System.out.println("Ball2 surface area: "+ball2.surfaceArea());
        System.out.println("Ball2 volume: "+ball2.volume());
        
        System.out.println();
        System.out.println();
        
        System.out.println("Number of balls created: "+ball2.getCount());
    }
}