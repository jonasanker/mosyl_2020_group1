package org.mdse.pts.schedule.dsl.linking;

import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.nodemodel.INode;
import org.mdse.pts.common.util.EcoreIOUtil;
import org.mdse.pts.depot.Depot;
import org.mdse.pts.network.Network;
import org.mdse.pts.schedule.SchedulePackage;

public class ScheduleLinkingService extends DefaultLinkingService {
	
	private static final String NETWORK_FILE_EXTENSTION = ".network";
	private static final String DEPOT_FILE_EXTENSTION = ".depot";

	@Override
	public List<EObject> getLinkedObjects(EObject context, EReference reference, INode node)
			throws IllegalNodeException {
		// Convention is that the node name has a file with corresponding name
		Network network = findNetworkReference(context, reference, node);
		if (network != null) {
			return Collections.singletonList(network);
		}

		Depot depot = findDepotReference(context, reference, node);
		if (depot != null) {
			return Collections.singletonList(depot);
		}

		return super.getLinkedObjects(context, reference, node);
	}
	
	private Network findNetworkReference(EObject context, EReference reference, INode node) {
		Network network = null;
		if (reference.equals(SchedulePackage.eINSTANCE.getSchedule_Network())) {
			final String crossRefNode = getCrossRefNodeAsString(node).replaceAll("\"", "");

			network = loadModelFromSameFolder(context, crossRefNode + NETWORK_FILE_EXTENSTION);
		}
		return network;
	}

	private Depot findDepotReference(EObject context, EReference reference, INode node) {
		Depot depot = null;
		if (reference.equals(SchedulePackage.eINSTANCE.getSchedule_Depots())) {
			final String crossRefNode = getCrossRefNodeAsString(node).replaceAll("\"", "");

			depot = loadModelFromSameFolder(context, crossRefNode + DEPOT_FILE_EXTENSTION);
		}
		return depot;
	}

	protected <T> T loadModelFromSameFolder(EObject modelElement, String fileName) {
		IFile originalFile = EcoreIOUtil.resolveRelativeFileFromEObject(modelElement);
		IFile accompanyingFile = getFileInSameFolder(originalFile, fileName);

		if (accompanyingFile == null || !accompanyingFile.exists()) {
			return null;
		}

		return EcoreIOUtil.loadModel(accompanyingFile);
	}

	protected IFile getFileInSameFolder(IFile originalFile, String filename) {
		IContainer parent = originalFile.getParent();
		IPath path = new Path(filename);
		return parent.getFile(path);
	}
}
