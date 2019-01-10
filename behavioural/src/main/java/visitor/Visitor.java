package visitor;

public interface Visitor {
	public void visitPiece(Piece p);
	public void visitBlock(BoardBlock b);
}
