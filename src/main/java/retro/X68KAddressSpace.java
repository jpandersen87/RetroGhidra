package retro;

import ghidra.program.model.address.AddressSpace;
import ghidra.program.model.address.GenericAddressSpace;
import ghidra.program.model.lang.SpaceNames

public class X68KAddressSpace extends AddressSpace {
	public static final AddressSpace HEADER_SPACE = new GenericAddressSpace(
		"HEADER", 64, AddressSpace.TYPE_OTHER, SpaceNames.OTHER_SPACE_INDEX);
}
