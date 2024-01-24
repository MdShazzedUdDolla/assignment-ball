public class Ball implements Comparable
{
    private String color;
    private double radius;
    private static int count;

    public Ball()
    {
        count++;
    }

    public Ball(String color, double radius)
    {
        this.color = color;
        this.radius = radius;
        count++;
    }

    public int getCount()
    {
        return count;
    }
    
    public void setColor(String color)
    {
        this.color = color;
    }

    public String getColor()
    {
        return color;
    }

    public void  setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public String toString()
    {
        return "Color: "+color+"       Radius: "+radius;
    }

    public boolean equals(Object otherObject)
    {
        Ball other = (Ball) otherObject;
        return color.equals(other.color) && radius == other.radius;
    }

    public int compareTo(Object temp)
    {
        Ball other = (Ball) temp;

        if(getRadius() > other.getRadius())
        {
            return 1;
        }
        else if(getRadius() < other.getRadius())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }

    public double circumference()
    {
        return 2* Math.PI* radius;
    }

    public double surfaceArea()
    {
        return (Math.PI * ((radius)*(radius)));
    }

    public double volume()
    {
        return (4/3)*(Math.PI)*(radius*radius*radius);
    }
}