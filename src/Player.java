public class Player {

    private String name;
    private char marker;

    // Constructors
    public Player(String n, char m){
        name = n;
        marker = m;
    }

    public Player(){
        name = "---";
        marker = '-';
    }


    // Setters
    public void setName(String n){
        name = n;
    }

    public void setMarker(char m){
        marker = m;
    }

    // Getters
    public String getName(){
        return name;
    }

    public char getMarker(){
        return marker;
    }


}
