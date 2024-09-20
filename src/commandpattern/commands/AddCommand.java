package commandpattern.commands;

public class AddCommand implements Icommand {

	private int value;
	
	// Current value in calculator
	public AddCommand(int v) {
		this.value = v;
	}
	
	@Override
	public int execute(int nToAd) {
		this.value += nToAd;
		return this.value;
	}

	@Override
	public int undo(int nToUndo) {
		return this.value -= nToUndo;
	}
}
