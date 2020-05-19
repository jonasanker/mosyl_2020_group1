package org.mdse.pts.depot.custom;

import org.mdse.pts.depot.impl.RegionalTrainImpl;

public class RegionalTrainCustom extends RegionalTrainImpl {
	@Override
	public int getTrainSpeed() {
		return 80;
	}
}
