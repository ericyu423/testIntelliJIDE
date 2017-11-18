package myPackage;

public class Ball {

    public Ball(String color, String size) {
        this.color = color;
        this.size = size;
    }

    private String color;
    private String size;

    public void getColor(){
        System.out.println(color);
    }

    protected String getSize(){
       // System.out.println(size);
        return size;
    }


}
