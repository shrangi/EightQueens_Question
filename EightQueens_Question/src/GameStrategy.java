public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {
		// WRITE YOUR LOGIC HERE...................................		
		int counter=0;
		for(int i=0;i<8;i++) {
			for(int k=0;k<8;k++) {
				if(counter==cellId) {
					return k;
				}
				counter++;
			}
		}
		return 0;	// just for the heck of it
	}
	
	private int getRow(int cellId) {
		// WRITE YOUR LOGIC HERE....................................
		int counter=0;
		for(int i=0;i<8;i++) {
			for(int k=0;k<8;k++) {
				if(counter==cellId) {
					return i;
				}
				counter++;
			}
		}
		return 0;	// just for the heck of it
	}

	public boolean isValidPosition(int cellId) {
		boolean isValid = true;

		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		
		int row = getRow(cellId);
		
		/*
			WRITE YOUR LOGIC HERE...............................
		*/
		if(!this.placedQueens[row][col]) {
			this.placedQueens[row][col]=true;
			
			//for columns
			for(int i=0;i<8;i++) this.placedQueens[row][i] = true;
			//for rows
			for(int i=0;i<8;i++) this.placedQueens[i][col] = true;
			
			//upper left diagonal
			for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--) {
				this.placedQueens[i][j] = true;
			}
			//upper right diagonal
			for(int i=row-1, j=col+1; i>=0 && j<8; i--,j++) {
				this.placedQueens[i][j] = true;
			}
			//lower left diagonal
			for(int i=row+1, j=col-1; i<8 && j>=0; i++,j--) {
				this.placedQueens[i][j] = true;
			}
			//lower right diagonal
			for(int i=row+1, j=col+1; i<8 && j<8; i++,j++) {
				this.placedQueens[i][j] = true;
			}
			
		}
		else
			return false;
		
		this.numQueens++;
		return isValid;
	}
}














