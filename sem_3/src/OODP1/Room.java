package OODP1;

public class Room {

    //Attributes
    // Here I had taken this attribute as a private because we don't want user to change this attribute.
    // For changing this attribute I had already created a method named 'setData')*
    private int roomNo;
    private String roomType;
    private int roomArea;

//    Constructor which take input of attributes while initialising the object of this class
    public Room(int roomNo, String roomType, int roomArea){
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.roomArea = roomArea;
    }

//    This method is used to edit or change the input
    public void setData(int roomNo, String roomType, int roomArea){
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.roomArea = roomArea;
    }

//    This method is used for printing room details
    public String displayData(){
        return "Room No \t: " + this.roomNo + "\nRoom Type \t: " + this.roomType + "\nRoom Area \t: " + this.roomArea + " sq meter";
    }
}
