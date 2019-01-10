package visitor;

public class BoardBlock extends ChessComponent{

	private Piece piece;

	public BoardBlock(String componentName, String color, Piece piece) {
		super(componentName, color);
		this.piece = piece;
	}

	public Piece getPiece() {
		return this.piece;
	}

	public String getBlockColor() {
		return this.getColor();
	}

	@Override
	public void accept(Visitor v) {
		v.visitBlock(this);		
	}
}
