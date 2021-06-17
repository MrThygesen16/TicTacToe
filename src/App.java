public class App {
    
    char[][] grid = new char[3][3];
    Player[] players = new Player[2];
  
    public static void main(String[] args) throws Exception {
        
        App app = new App();
        app.printGrid();

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

        System.out.println("\nWelcome to Tic Tac Toe\n");

    }

    
    public void setPlayerNames(){

        


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
