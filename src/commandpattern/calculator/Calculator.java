package commandpattern.calculator;

import commandpattern.commands.AddCommand;
import commandpattern.commands.Icommand;
import commandpattern.commands.MultiplyCommand;

public class Calculator {

	int value;
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		Icommand ic = new AddCommand(0);
//		System.out.println(ic.execute(20));
//		System.out.println(ic.undo(20));
		c.executeCommand(ic);
		c.executeundo(ic);
		
		ic = new MultiplyCommand(10);
//		System.out.println(ic.execute(20));
//		System.out.println(ic.undo(20));
		
		
		c.executeCommand(ic);
		c.executeundo(ic);
	}
	
	public void executeCommand(Icommand icI) {
		System.out.println(icI.execute(20));
	}
	
	public void executeundo(Icommand icI) {
		System.out.println(icI.undo(20));
	}

}
