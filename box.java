public class box extends facade_file
{
    private int height;
    private int length;
    private int width;
    private String color; //*
    private String name;  //*

    box (int height,
         int length,
         int width,
         String color,
         String name)
    {
        this.length = length;
        this.height = height;
        this.width  = width;
        this.color  = color;
        this.name   = name;
    }

    void show_info()
    {
        System.out.println("Length: " + length);
        System.out.println("Height: " + height);
        System.out.println("Width: " +  width );
        System.out.println("Name: " +   name  );
        System.out.println("Color: " +  color );
    }

    public int getHeight()            //*
    {
        return height;
    }

    public void setHeight(int height) //*
    {
        this.height = height;
    }

    public int getLength()            //*
    {
        return length;
    }

    public void setLength(int length) //*
    {
        this.length = length;
    }

    public int getWidth()              //*
    {
        return width;
    }

    public void setWidth(int width)    //*
    {
        this.width = width;
    }

    public String getColor()           //*
    {
        return color;
    }

    public void setColor(String color) //*
    {
        this.color = color;
    }

    public String getName()             //*
    {
        return name;
    }

    public void setName(String name)    //*
    {
        this.name = name;
    }

}
