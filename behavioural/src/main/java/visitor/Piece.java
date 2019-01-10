package visitor;

public class Piece extends ChessComponent{

	public Piece(String name, String color) {
		super(name, color);
	}

	@Override
	public void accept(Visitor v) {
		v.visitPiece(this);		
	}


}
