package org.mdse.pts.schedule.dsl.linking;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.nodemodel.INode;

public class ScheduleLinkingService extends DefaultLinkingService {

	@Override
	public List<EObject> getLinkedObjects(EObject context, EReference reference, INode node) throws IllegalNodeException {
		//TODO Implement custom linking service if needed.
		
		// consider conventions; file name is same among all 
		
		// Find network/depot file
		// Load it
		// Compare names and find the one equal expected
		// return
		// super.getCrossRefNodeAsString(node);
		
		return super.getLinkedObjects(context, reference, node);
	}
	
}
