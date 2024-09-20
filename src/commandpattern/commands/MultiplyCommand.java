package commandpattern.commands;

public class MultiplyCommand implements Icommand {

private int value;
	
	// Current value in calculator
	public MultiplyCommand(int v) {
		this.value = v;
	}
	
	@Override
	public int execute(int nToAd) {
		this.value *= nToAd;
		return this.value;
	}

	@Override
	public int undo(int nToUndo) {
		this.value /= nToUndo;
		return this.value;
	}

}
