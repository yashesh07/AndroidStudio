package OODP2;

public class Rectangle {

//    Here I had taken this attribute as private because I am taking the input of this attribute through constructor
    private int perimeter;

//    Constructor
    public Rectangle(int length, int breadth){
        this.perimeter = 2*(length+breadth);
    }

//    Method to print perimeter of rectangle
    public int printPerimeter(){
        return perimeter;
    }
}
