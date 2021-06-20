public class Player {

    // name is simply the players name
    // "marker" is what the player puts on the board
    //      i.e. a "X" or "O"
    private String name;
    private char marker;

    // Constructors
        // standard constructor...
    public Player(String n, char m){
        this.name = n;
        this.marker = m;
    }

        // empty default constructor <-- This one is used in the app
    public Player(){
        this.name = "---";
        this.marker = '-';
    }


    // Setters 
    public void setName(String n){ // we use this for setting player name when they enter it
        this.name = n;
    }

    public void setMarker(char m){ // we use this for setting player marker (right now it defaults to "O" for player 1, and "X" for player 2)
        this.marker = m;
    }

    // Getters
    public String getName(){ 
        return this.name;
    }

    public char getMarker(){
        return this.marker;
    }


    // to string stuff --> used for debugging
    public void printPlayerInfo(){
        System.out.println(this.name + " " + this.marker);
    }


}
