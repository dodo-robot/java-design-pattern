package visitor;

public class Main {

	public static void main(String[] args) {
		
		Piece rook = new Piece("rook","white");
		BoardBlock block = new BoardBlock("board-block","black", rook);
		
		Visitor v = new ConsoleVisitor();
		block.accept(v);
		
		rook.accept(v);
		
	}

}
