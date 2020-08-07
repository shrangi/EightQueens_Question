public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {

		// WRITE YOUR LOGIC HERE...
		int ser = square/8;
		if(ser%2==0) {
			if(square%2==1) return true;
			else return false;
		}else {
			if(square%2==0) return true;
			else return false;
		}
		
	}
}
