public class Player {

    private String name;
    private char marker;

    // Constructors
    public Player(String n, char m){
        this.name = n;
        this.marker = m;
    }

    public Player(){
        this.name = "---";
        this.marker = '-';
    }


    // Setters
    public void setName(String n){
        this.name = n;
    }

    public void setMarker(char m){
        this.marker = m;
    }

    // Getters
    public String getName(){
        return this.name;
    }

    public char getMarker(){
        return this.marker;
    }


    // to string stuff

    public void printPlayerInfo(){
        System.out.println(this.name + " " + this.marker);
    }


}
