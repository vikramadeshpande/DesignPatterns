package commandpattern.commands;

public interface Icommand {
	
	public int execute(int nToAd);
	public int undo(int nToUndo);
}
