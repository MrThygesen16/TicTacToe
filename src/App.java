import java.io.*;

public class App {
    
    char[][] grid = new char[3][3];
    Player[] players = new Player[2];
    int turn;
  
    public static void main(String[] args) throws Exception {
        
        App app = new App();
        app.startApp();

    }

    public App(){

        /* 

            When we init the app we construct default values for 
            both the grid, and player names etc.

        */
        
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                grid[i][j] = ' ';
            }
        }

        players[0] = new Player();
        players[1] = new Player();

        // if turn is odd - player 1 turn
        // if turn is even - player 2 turn
        turn = 0;

    }


    public void startApp(){

        System.out.println("\nWelcome to Tic Tac Toe\n");

        setPlayerNames();

    

        while (turn < 9 ){
                turn();
        }

        System.out.println("\n DRAW! \n");
    }

    // this function is called whenever we want the user to input a value
    // e.g. we call this when we want them to set their name etc.
    public String playerInput(String msg){
			
		Console console = System.console();
		String playerInput = "";

    	playerInput = console.readLine(msg);
        return playerInput;	
	}

    
    public void setPlayerNames(){

        // player 1 
        String player1Name = playerInput("Enter Player 1 Name: ");
        System.out.println("Hello " + player1Name + "\n");
        players[0].setName(player1Name);
        players[0].setMarker('O');;

        //player 2
        String player2Name = playerInput("Enter Player 2 Name: ");
        System.out.println("Hello " + player2Name + "\n");
        players[1].setName(player2Name);
        players[1].setMarker('X');;

        // displays the player names & their mark...
        for (int i = 0; i < players.length; i++){
            players[i].printPlayerInfo();
        }

    }


    public void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public boolean errorMessageSpot(int t){
        clearScreen();
        printGrid();
        System.out.println(players[t].getName() + " please pick a square that hasn't been picked!");
        return false;
    }

    public boolean feasibleSpot(int choice, int t){

        switch(choice){
            case 1:
                if(grid[0][0] == (' ')){
                    grid[0][0] = players[t].getMarker();
                } else {
                    return errorMessageSpot(t);
                }
                break;
            case 2:
                if(grid[0][1] == (' ')){
                grid[0][1] = players[t].getMarker();
                } else {
                    return errorMessageSpot(t);
                }
                break;
            case 3:
                if(grid[0][2] == (' ')){
                    grid[0][2] = players[t].getMarker();
                } else {
                    return errorMessageSpot(t);
                }
                break;
            case 4:
                if(grid[1][0] == (' ')){
                    grid[1][0] = players[t].getMarker();
                } else {
                    return errorMessageSpot(t);
                }
                break;
            case 5:
                if(grid[1][1] == (' ')){
                    grid[1][1] = players[t].getMarker();
                } else {
                    return errorMessageSpot(t);
                }
                break;
            case 6:
                if(grid[1][2] == (' ')){
                    grid[1][2] = players[t].getMarker();
                } else {
                    return errorMessageSpot(t);
                }
                break;
            case 7:
                if(grid[2][0] == (' ')){
                    grid[2][0] = players[t].getMarker();
                } else {
                    return errorMessageSpot(t);
                }
                break;
            case 8:
                if(grid[2][1] == (' ')){
                    grid[2][1] = players[t].getMarker();
                } else {
                    return errorMessageSpot(t);
                }
                break;
            case 9:
                if(grid[2][2] == (' ')){
                    grid[2][2] = players[t].getMarker();
                } else {
                    return errorMessageSpot(t);
                }
                break;

        }

        return true;
    }
    

    public String declareWinner(int i){

        return "\n" + players[i].getName() + " WON!!!" + "(" +  players[i].getMarker() +")\n";
    }


    public boolean checkForWin(int in){
        
        boolean won = false;

        // set 1
        if (grid[0][0] != ' '){

            // 1st row
            if (grid[0][0] == grid[0][1] && grid[0][1] == grid[0][2]){
                won = true;
            }

            // Diagonal left to right
            if (grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]){
                won = true;
            }

            // First Columns
            if (grid[0][0] == grid[1][0] && grid[1][1] == grid[2][0]){
                won = true;
            }


        }

        // set 2
        if (grid[0][1] != ' '){

            // middle column
            if (grid[0][1] == grid[1][1] && grid[1][1] == grid[2][1]){
                won = true;
            }

        }
        
        // set 3
        if (grid[0][2] != ' '){

            // diagonal left to right
            if (grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0]){
                won = true;
            }

            // right column
            if (grid[0][2] == grid[1][2] && grid[1][2] == grid[2][2]){
                won = true;
            }

        }


        //set 4
        if (grid[1][2] != ' '){

            // middle row
            if (grid[1][2] == grid[1][1] && grid[1][1] == grid[1][0]){
                won = true;
            }

        }

        // set 5
        if (grid[2][2] != ' '){

            // bottom row
            if (grid[2][2] == grid[2][1] && grid[2][1] == grid[2][0]){
                won = true;
            }

        }
        
        
        // if win condition = true declare winner and end program
        return won;
    }


    public void chooseGrid(int i){
        
            System.out.println("Turn #" + turn + " | " + players[i].getName() + "'s turn [" + players[i].getMarker() + "]");
            boolean picked = false;

            int numChoice = -1;
            String choice = "";

            printGrid();
            
            System.out.println(players[i].getName() + ", please choose a number... ");
                        System.out.println("1. A0\t 2. B0\t 3. C0\n4. A1\t 5. B1\t 6. C1\n7. A2\t 8. B2\t 9. C2");
        

            while (!picked){
                choice = playerInput("Choice: ");

                try {
                    numChoice = Integer.parseInt(choice);
                    
                    if (numChoice >= 1 && numChoice <= 9){
                        picked = feasibleSpot(numChoice, i); // check if we can choose that grid square

                        // once square has been updated we check to see

                    } else {
                        clearScreen();
                        printGrid();
                        System.out.println(players[i].getName() + " please pick a Number between 1 & 9...");
                    }
                    
                    
                } catch (Exception e){
                    System.out.println("Error with input!");
                }

            }

            clearScreen();
            printGrid();

            if (checkForWin(i)){
                System.out.println(declareWinner(i));
                System.exit(0);
            } 
    }


    public void turn(){


            
        clearScreen();

        if (turn == 0){
            System.out.println("\n---- Game Begins Now ----\n");
        }

        int i = -1;

        if (turn % 2 == 0){
            i = 0;
            turn = turn + 1;
        } else if (turn % 2 == 1) {
            i = 1;
            turn = turn + 1;
        }

        chooseGrid(i);
    }

    public void printGrid(){

		System.out.println("\n     A     B     C  ");
		System.out.println("   _________________");
		System.out.println("  |     |     |     |");
		System.out.println("0 |  " + grid[0][0] + "  |  " + grid[0][1] +  "  |  " + grid[0][2] + "  |");
		System.out.println("  |_____|_____|_____|");
		System.out.println("  |     |     |     |");
		System.out.println("1 |  " + grid[1][0] + "  |  " + grid[1][1] +  "  |  " + grid[1][2] + "  |");
		System.out.println("  |_____|_____|_____|");
		System.out.println("  |     |     |     |");
		System.out.println("2 |  " + grid[2][0] + "  |  " + grid[2][1] +  "  |  " + grid[2][2] + "  |");
		System.out.println("  |_____|_____|_____|\n");
	}

}
