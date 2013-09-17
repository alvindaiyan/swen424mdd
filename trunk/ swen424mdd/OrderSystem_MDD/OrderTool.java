// From MetaEdit+, graph: ProductOrdering
// .java file for class OrderTool

import java.awt.*;	// Stereotype was widget
import java.applet.Applet;	// Superclass was Applet
public class OrderTool extends Applet {
// member data
	// private
	// MEPMD5 Protected block for private attributes	
	// Enter own private attributes here
	// MEPMD5 369f4dc4709c509ebcc08fc6e7fb8d9f	
	// protected
	// MEPMD5 Protected block for protected attributes	
	// Enter own protected attributes here
	// MEPMD5 89050b9f70f02e5bb34d5d0187e36d5c	
	// public
	public TextField textfield; 
	public TextArea resultField;	//  showing the result
	public int width=200;	//  The width of the screen
	public int height=225;	//  The height of the screen
	// MEPMD5 Protected block for public attributes	
	// Enter own public attributes here
	// MEPMD5 b34fd6890c13447591ccca766bacea04	

// member functions
	public void init() {
		// MEPMD5 29_2142 protected block for method body	
		resize(width, height);		// size the app window
		setLayout(new BorderLayout());		// create a layout mgr
		
		textfield=new TextField();		// input fld
		textfield.setText("I create a text box");// sample data for starters
		add("North", textfield);
		
		resultField = new TextArea();
		add("Center", resultField);
		// MEPMD5 378f9cde3cf41bf80fd515b30941757a	
	}

	// Protected block for manually added member functions
	// MEPMD5 29_2027 manually added member functions	
	// Enter code here
	// MEPMD5 d562e6df93aed13645b67acd34cf7773	

} // end of class OrderTool

