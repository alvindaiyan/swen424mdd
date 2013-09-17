import java.util.List;

// From MetaEdit+, graph: ProductOrdering
// .java file for class Customer

public class Customer {
// member data
	// private
	private List orders;	//  This is the order of the customer.
	private String firstname;	//  This is the firstname of the customer
	private String lastname;	//  This is the lastname of the customer
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
	Address address;	// aggregation based data

// member functions
	public void setFirstName(String firstname) {
		// MEPMD5 29_828 protected block for method body
		firstname=firstname;
		// MEPMD5 462061768a34de449c77553ef251ed6c
	}

	public void setLastName(String lastname) {
		// MEPMD5 29_886 protected block for method body
		lastname=lastname;
		// MEPMD5 3dbee7492ac185698fd0eb64865625d2
	}

	public String getLastName() {
		// MEPMD5 29_910 protected block for method body
		return lastname;
		// MEPMD5 1582773ea6c9e4be3e1c972b8c5775cf
	}

	public List getOrders() {
		// MEPMD5 29_968 protected block for method body
		return orders;
		// MEPMD5 686440fa2a305301f4cbf068ed4ad5a3
	}

	public void setOrders(List orders) {
		// MEPMD5 29_944 protected block for method body
		orders=orders;
		// MEPMD5 c29fce5ed172c8688f725cb8913ba22a
	}

	public String getFirstName() {
		// MEPMD5 29_852 protected block for method body
		return firstname;
		// MEPMD5 d70901046d95bc869c08754f05e6d3db
	}

	// Protected block for manually added member functions
	// MEPMD5 29_727 manually added member functions
	// Enter code here
	// MEPMD5 d562e6df93aed13645b67acd34cf7773

} // end of class Customer

