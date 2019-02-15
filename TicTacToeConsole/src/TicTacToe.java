/**
 * TicTacToe class implements the interface
 * @author relkharboutly
 * @date 1/5/2017
 */
public class TicTacToe implements ITicTacToe {
		 
	   // The game board and the game status
	   private static final int ROWS = 3, COLS = 3; // number of rows and columns
	   private int[][] board = new int[ROWS][COLS]; // game board in 2D array
	   private int prevMove;
	
	  
	/**
	 * clear board and set current player   
	 */
	public TicTacToe(){
		prevMove = 0;
	}
	@Override
	public void clearBoard() {
		// TODO Auto-generated method stub
		//iterates through entire board and clears by setting each tile to 0
		for(int i = 0;i<board.length;i++){
			for(int j = 0;j<board[i].length;j++){
				board[i][j] = -1;
			}
		}
	}

	@Override
	public void setMove(int player, int location) {
		// TODO Auto-generated method stub
		prevMove = location;
		if (location < 9 && location >= 0) {
			if (location == 0) board[0][0] = player;
			else if (location == 1) board[0][1] = player;
			else if (location == 2) board[0][2] = player;
			else if (location == 3) board[1][0] = player;
			else if (location == 4) board[1][1] = player;
			else if (location == 5) board[1][2] = player;
			else if (location == 6) board[2][0] = player;
			else if (location == 7) board[2][1] = player;
			else board[2][2] = player;
		}

	}
	@Override
	public int getComputerMove() {
		// TODO Auto-generated method stub
		/*int r = findRow(prevMove);
		int c = findCol(prevMove);
		if(c<2) {
			if(board[r][c] == 1) {
				
				if(board[r])
				if(board[r][c+1] == 0) {
			
				if(board[rSystem.out.println("quick block H");
				return turnBoardIntoLocation(r,c+1);//block quick horizontal
			}
		}
		}
		if(r<2) {
			if(board[r][c] == 1 && board[r][c+1] == 0) {
				System.out.println("quick block H");
				return turnBoardIntoLocation(r,c+1);//block quick horizontal
		}
		*/
		for (int row = 0; row < ROWS; ++row) { //checks for ways to block
			
			for (int col = 0; col < COLS; ++col) {
				
				if(board[row][col] == 1){
					if(col <2 && row < 2) { 
						if(board[row][col+1] == 0) {
						System.out.println("quick block H");
						return turnBoardIntoLocation(row,col+1);//block quick horizontal
					}
					 if(board[row+1][col] == 0) {
						System.out.println("quick block V");
						return turnBoardIntoLocation(row+1,col);//block quick vertical
					}
					}
					if(row == 0 && col == 0) {
					 if(board[row][col+1] == 1) {
						System.out.println("big block H");
						return turnBoardIntoLocation(row, col+2);//check for big block horizontal
					}
					
					 else if(board[row+1][col] == 1 && board[row+2][col] == 0){
						System.out.println("big block V");
						return turnBoardIntoLocation(row+2,col);//check for big block vertical
					}
					}
					
				}
				
				if(board[1][1] == 0) {
					return turnBoardIntoLocation(1,1);
				}
				if(board[row][col] == 0) {
					return turnBoardIntoLocation(row, col);
				}
			}
		}
	return 0;}
public int turnBoardIntoLocation(int row, int col){
	if(row == 0 && col == 0) return 0;
	else if(row == 0 && col == 1) return 1;
	else if(row == 0 && col == 2) return 2;
	else if(row == 1 && col == 0) return 3;
	else if(row == 1 && col == 1) return 4;
	else if(row == 1 && col == 2) return 5;
	else if(row == 2 && col == 0) return 6;
	else if(row == 2 && col == 1) return 7;
	else return 8;
}
public int findRow(int loc) {
	if (loc == 0) return 0;
	else if (loc == 1) return 0;
	else if (loc == 2) return 0;
	else if (loc == 3) return 1;
	else if (loc == 4) return 1;
	else if (loc == 5) return 1;
	else if (loc == 6) return 2;
	else if (loc == 7) return 2;
	else return 2;
}
public int findCol(int loc) {
	if (loc == 0) return 0;
	else if (loc == 1) return 1;
	else if (loc == 2) return 2;
	else if (loc == 3) return 0;
	else if (loc == 4) return 1;
	else if (loc == 5) return 2;
	else if (loc == 6) return 0;
	else if (loc == 7) return 1;
	else return 2;
}
	@Override
	public int checkForWinner() {
		//checks horizontal win
		 for (int row = 0; row < ROWS; ++row) {
			 if(board[row][0] == 1) { 
				
				 if(board[row][1] == 1) { 
        		 		if(board[row][2] == 1) {
        		 			return 2;
        		 		}
        		 	}
				 
        		 }
        		 
		 }
		 //checks vertical win
		 for (int col = 0; col < COLS; ++col) {
			 if(board[0][col] == 1) {
				 if(board[1][col] == 1) {
					 if(board[2][col] == 1) {
     		 			return 2;
     		 		}
				 }
			 }
		 }
		 //check diagonal win
		 if(board[0][0] == 1) {
			 if(board[1][1] == 1) {
				 if(board[2][2] == 1) {
					 return 2;
				 }
			 }
		 }
		 if(board[0][2] == 1) {
			 if(board[1][1] == 1) {
				 if(board[2][0] == 1) {
					 return 2;
				 }
			 }
		 }
			 
			 
			//checks horizontal win comp
			 for (int row = 0; row < ROWS; ++row) {
				 if(board[row][0] == 2) { 
					
					 if(board[row][1] == 2) { 
	        		 		if(board[row][2] == 2) {
	        		 			return 3;
	        		 		}
	        		 	}
					 
	        		 }
	        		 
			 }
			 //checks vertical win
			 for (int col = 0; col < COLS; ++col) {
				 if(board[0][col] == 2) {
					 if(board[1][col] == 2) {
						 if(board[2][col] == 2) {
	     		 			return 3;
	     		 		}
					 }
				 }
			 }
			 //check diagonal win
			 if(board[0][0] == 2) {
				 if(board[1][1] == 2) {
					 if(board[2][2] == 2) {
						 return 3;
					 }
				 }
			 }
			 if(board[0][2] == 2) {
				 if(board[1][1] == 2) {
					 if(board[2][0] == 2) {
						 return 3;
					 }
				 }
		 }
		
		return 0; //no winner
	}
	
	  /**
	   *  Print the game board 
	   */
	   public  void printBoard() {
	      for (int row = 0; row < ROWS; ++row) {
	         for (int col = 0; col < COLS; ++col) {
	            printCell(board[row][col]); // print each of the cells
	            if (col != COLS - 1) {
	               System.out.print("|");   // print vertical partition
	            }
	         }
	         System.out.println();
	         if (row != ROWS - 1) {
	            System.out.println("-----------"); // print horizontal partition
	         }
	      }
	      System.out.println();
	   }
	 
	   /**
	    * Print a cell with the specified "content" 
	    * @param content either CROSS, NOUGHT or EMPTY
	    */
	   public  void printCell(int content) {
	      switch (content) {
	         case EMPTY:  System.out.print("   "); break;
	         case NOUGHT: System.out.print(" O "); break;
	         case CROSS:  System.out.print(" X "); break;
	      }
	   }

}
