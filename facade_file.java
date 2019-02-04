public class facade_file
{
    public static void main(String[] args)
    {
        box newbox;
            newbox = new box(1,2,4,
                     "black", "small");

            newbox.show_info();

        box nextbox;
            nextbox = new box(1,4,6,
                      "white", "big");

            nextbox.setWidth(50);
            nextbox.setLength(5);
            nextbox.setHeight(7);
            nextbox.setName("bigger");
            nextbox.setColor("blue");

            nextbox.show_info();

            nextbox.getWidth();
            nextbox.getLength();
            nextbox.getHeight();
            nextbox.getName();
            nextbox.getColor();

            nextbox.show_info();
    }
}