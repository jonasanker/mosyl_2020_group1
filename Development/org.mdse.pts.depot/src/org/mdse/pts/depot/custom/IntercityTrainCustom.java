package org.mdse.pts.depot.custom;

import org.mdse.pts.depot.impl.IntercityTrainImpl;

public class IntercityTrainCustom extends IntercityTrainImpl {

	@Override
	public int getTrainSpeed() {
		if (coaches.size() >= 8) {
			return 130;
		} else {
			return 150;
		}
	}

}
