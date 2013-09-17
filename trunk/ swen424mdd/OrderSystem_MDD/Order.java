// From MetaEdit+, graph: ProductOrdering
// .java file for class Order

public class Order {
// member data
	// private
	private double totalamount=0.00;	// TotalAmount>=0 The total price of the order
	private int quantity=0;	// quantity>=0 The quantity of the order
	// MEPMD5 Protected block for private attributes
	// Enter own private attributes here
	// MEPMD5 369f4dc4709c509ebcc08fc6e7fb8d9f
	// protected
	// MEPMD5 Protected block for protected attributes
	// Enter own protected attributes here
	// MEPMD5 89050b9f70f02e5bb34d5d0187e36d5c
	// public
	// MEPMD5 Protected block for public attributes
	// Enter own public attributes here
	// MEPMD5 b34fd6890c13447591ccca766bacea04
	Product Product;	// aggregation based data

// member functions
	public void setTotalAmount(double totalamount) {
		// MEPMD5 29_234 protected block for method body
		totalamount = totalamount;
		// MEPMD5 834609b06335787c6349b9b7d7a05e1e
	}

	public void setQuantity(int quantity) {
		// MEPMD5 29_292 protected block for method body
		quantity=quantity;
		// MEPMD5 fe65e7e04aaa39e5671e3fa2f9da49ee
	}

	public int getQuantity() {
		// MEPMD5 29_316 protected block for method body
		return quantity;
		// MEPMD5 0c028dbc95381af39030f4210555b1a3
	}

	public double getTotalAmount() {
		// MEPMD5 29_258 protected block for method body
		return totalamount;
		// MEPMD5 67e878d9fb1fee6a1a69150b30cd142a
	}

	// Protected block for manually added member functions
	// MEPMD5 29_188 manually added member functions
	// Enter code here
	// MEPMD5 d562e6df93aed13645b67acd34cf7773

} // end of class Order

