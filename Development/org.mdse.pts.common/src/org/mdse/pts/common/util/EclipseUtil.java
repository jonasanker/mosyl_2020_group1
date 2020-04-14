package org.mdse.pts.common.util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class EclipseUtil {
	public static IProject resolveProjectFromResource(Resource resource) {
		if (resource == null) {
			return null;
		}
		
		URI uri = resource.getURI();
		
		return resolveProjectFromResourceURI(uri);
	}
	
	public static IProject resolveProjectFromResourceURI(URI resourceURI) {
		IFile file = resolveRelativeFileFromResourceURI(resourceURI);
//		file = ResourceUtil.makeFileRelativeToWorkspace(file);

		IProject project = file.getProject();

		return project;
	}
	
	public static IFile resolveRelativeFileFromResourceURI(URI resourceURI) {
		String uriString = null;
		
		if (resourceURI.isFile()) {
			uriString = resourceURI.toFileString();
		} else if (resourceURI.isPlatform()) {
			uriString = resourceURI.toPlatformString(true);
		}
		
		if (uriString == null) {
			return null;
		}
		
		IPath path = new Path(uriString);
		IFile file = makePathRelativeToWorkspace(path);
		
		return file;
	}
	
	public static IFile makePathRelativeToWorkspace(IPath filePath) {
		IWorkspaceRoot workspaceRoot = getWorkspaceRoot();
//		IPath workspacePath = workspaceRoot.getFullPath();
		IPath workspacePath = workspaceRoot.getLocation();
		
		IPath relativeFilePath = filePath.makeRelativeTo(workspacePath);
		
		return workspaceRoot.getFile(relativeFilePath);
	}
	
	public static IWorkspaceRoot getWorkspaceRoot() {
		IWorkspace workspace = getWorkspace();
		return workspace.getRoot();
	}
	
	public static IWorkspace getWorkspace() {
		return ResourcesPlugin.getWorkspace();
	}
	
	
	public static IFile getFileInSameContainer(IFile file, String newFilename) {
		IContainer parent = file.getParent();
		IPath newFilePath = new Path(newFilename);
		
		return parent.getFile(newFilePath);
	}
	
	
	public static IFile createRelativeFile(IFile file) {
		IPath filePath = file.getFullPath();
		IPath relativeFilePath = createRelativePath(filePath);
		
		if (relativeFilePath == null) {
			return null;
		}
		
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot workspaceRoot = workspace.getRoot();
		return workspaceRoot.getFile(relativeFilePath);
	}
	
	public static IPath createRelativePath(IPath path) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot workspaceRoot = workspace.getRoot();
		//"Location" is the absolute path to the workspace.
		IPath workspaceLocation = workspaceRoot.getLocation();
		
		boolean isWorkspaceResource = workspaceLocation.isPrefixOf(path);

		if (!isWorkspaceResource) {
			return null;
		}
		
		return path.makeRelativeTo(workspaceLocation);
	}
	
	public static void writeToFile(String content, IFile file) {
		try {
			InputStream inputStream = new ByteArrayInputStream(content.getBytes());
			
			if (file.exists()) {
				file.delete(true, null);
			}
			
			ensureFolderStructure(file);
			file.create(inputStream, true, null);
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public static void ensureFolderStructure(IResource resource) {
		//Recursively create a (possible not yet existing) file structure
		IContainer container = resource.getParent();
		
		if (container instanceof IResource)  {
			ensureFolderStructure((IResource) container);
		}
		
		if (resource instanceof IFolder) {
			IFolder folder = (IFolder) resource;
			
			if (!folder.exists()) {
				try {
					folder.create(true, false, null);
				} catch(Exception e) {
					throw new RuntimeException(e);
				}
		    }
		}
	}
	
	
	public static void refreshProject(IProject project) {
		refreshResource(project, IResource.DEPTH_INFINITE);
	}
	
	public static void refreshResource(IResource resource) {
		refreshResource(resource, IResource.DEPTH_INFINITE);
	}
	
	public static void refreshResource(IResource resource, int depth) {
		try {
			resource.refreshLocal(depth, null);
		} catch(CoreException e) {
			
		}
	}
}
