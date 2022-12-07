public class Rectangle {

    private int width;
    private int length;
    public int x;
    public int y;

    public Rectangle () {

        x = 0;
        y = 0;
        width = 1;
        length = 1;
//        this(0,0,1,1);
    }

    public Rectangle(int x, int y, int width, int length) {

        this.x = x;
        this.y =y;
        this.width = width;
        this.length = length;


    }

    public Rectangle(Rectangle ra) {

        this(ra.x,ra.y,ra.width,ra.length);

//        x = ra.x;
//        y = ra.y;
//        width = ra.width;
//        length = ra.length;

    }

    public void setWidth(int width){

        if (width < 0) {
          //  System.exit(10);
        } else {
            this.width = width;
        }

    }

    public void setLength(int length) {

        this.length = java.lang.Math.abs(length);
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
}
