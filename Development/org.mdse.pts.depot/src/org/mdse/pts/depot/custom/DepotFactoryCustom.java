package org.mdse.pts.depot.custom;

import org.mdse.pts.depot.IntercityTrain;
import org.mdse.pts.depot.RegionalTrain;
import org.mdse.pts.depot.impl.DepotFactoryImpl;

public class DepotFactoryCustom extends DepotFactoryImpl {

	@Override
	public IntercityTrain createIntercityTrain() {
		return new IntercityTrainCustom();
	}

	@Override
	public RegionalTrain createRegionalTrain() {
		return new RegionalTrainCustom();
	}

}
