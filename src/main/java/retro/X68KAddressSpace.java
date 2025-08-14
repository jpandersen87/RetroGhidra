package retro;

import ghidra.program.model.address.AddressSpace;
import ghidra.program.model.address.GenericAddressSpace;
import ghidra.program.model.lang.SpaceNames;

public class X68KAddressSpace extends GenericAddressSpace {
	/**
	 * Constructs a new GenericAddress space with the given name, bit size, type
	 * and unique value.
	 * 
	 * @param name
	 *            the name of the space.
	 * @param size
	 *            the number of bits required to represent the largest address
	 *            the space.
	 * @param type
	 *            the type of the space
	 * @param unique
	 *            the unique id for this space.
	 */
	public X68KAddressSpace(String name, int size, int type, int unique) {
		super(name, size, type, unique);
	}

	/**
	 * Constructs a new GenericAddress space with the given name, bit size, type
	 * and unique value.
	 * 
	 * @param name
	 *            the name of the space.
	 * @param size
	 *            the number of bits required to represent the largest address
	 *            the space.
	 * @param type
	 *            the type of the space
	 * @param unique
	 *            the unique id for this space.
	 * @param showSpaceName
	 *            whether to show the space name in toString()
	 */
	public X68KAddressSpace(String name, int size, int type, int unique, boolean showSpaceName) {
		super(name, size, type, unique, showSpaceName);
	}

	/**
	 * Constructs a new GenericAddress space with the given name, bit size, type
	 * and unique value.
	 * 
	 * @param name
	 *            the name of the space.
	 * @param size
	 *            the number of bits required to represent the largest address
	 *            the space.
	 * @param unitSize
	 *            number of bytes contained at each addressable location (1, 2,
	 *            4 or 8)
	 * @param type
	 *            the type of the space
	 * @param unique
	 *            the unique id for this space.
	 */
	public X68KAddressSpace(String name, int size, int unitSize, int type, int unique) {
		super(name, size, unitSize, type, unique);
	}
	
	public static final AddressSpace HEADER_SPACE = new GenericAddressSpace(
		"HEADER", 64, AddressSpace.TYPE_OTHER, SpaceNames.OTHER_SPACE_INDEX);
}
