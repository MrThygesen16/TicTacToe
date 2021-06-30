# TicTacToe
Simple Tic-Tac-Toe Game in Java

Quick little 2-player console based version of Tic-Tac-Toe that I threw together as a project during my Uni break.


Here is an example of what the game looks like while running:


When the game first runs it will prompt the user to enter in the names of the two players:

```
Welcome to Tic Tac Toe

Enter Player 1 Name: Mike
Hello Mike

Enter Player 2 Name: Pete
Hello Pete
```

Once the names have been entered, a board will appear, prompting player 1 to make their first move:

```
---- Game Begins Now ----

Turn #1 | Mike's turn [O]

     A     B     C  
   _________________
  |     |     |     |
0 |     |     |     |
  |_____|_____|_____|
  |     |     |     |
1 |     |     |     |
  |_____|_____|_____|
  |     |     |     |
2 |     |     |     |
  |_____|_____|_____|

Mike, please choose a number... 
1. A0	 2. B0	 3. C0
4. A1	 5. B1	 6. C1
7. A2	 8. B2	 9. C2
Choice: 
```

Notice that next to where it says `Mike's Turn`, it also shows their token. In this case a Naught (O).


Below is a game that has progressed a little further.

```
Turn #7 | Mike's turn [O]

     A     B     C  
   _________________
  |     |     |     |
0 |  O  |     |  X  |
  |_____|_____|_____|
  |     |     |     |
1 |  X  |  X  |     |
  |_____|_____|_____|
  |     |     |     |
2 |  O  |     |  O  |
  |_____|_____|_____|

Mike, please choose a number... 
1. A0	 2. B0	 3. C0
4. A1	 5. B1	 6. C1
7. A2	 8. B2	 9. C2
Choice: 6

```

In the above example the player Mike input the number `6`. This corresponds to the cell location `C1`. 

Once Mike enters in his selection, the game switches over to the second Player's turn. In this case, player 2 is Pete.


```
Turn #8 | Peter's turn [X]

     A     B     C  
   _________________
  |     |     |     |
0 |  O  |     |  X  |
  |_____|_____|_____|
  |     |     |     |
1 |  X  |  X  |  O  |
  |_____|_____|_____|
  |     |     |     |
2 |  O  |     |  O  |
  |_____|_____|_____|

Peter, please choose a number... 
1. A0	 2. B0	 3. C0
4. A1	 5. B1	 6. C1
7. A2	 8. B2	 9. C2
Choice: 

```
